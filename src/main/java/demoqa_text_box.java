import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class demoqa_text_box {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://demoqa.com/text-box");
        WebElement element = driver.findElement(By.xpath("//input[@id='userName']"));
        element.click();element.sendKeys("Test");

        WebElement userEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        userEmail.click();userEmail.sendKeys("Testov@mail.ru");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.click();currentAddress.sendKeys("g. Kurgan");

        WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddress.click();permanentAddress.sendKeys("g. Kurgan st. K-Myzgotina d. 136");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
        Submit.click();

    }
}
