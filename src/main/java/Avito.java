import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Avito {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.avito.ru/all/lichnye_veschi");
        WebElement element = driver.findElement(By.xpath("//img[@alt=\"Мужская одежда\"]"));
        element.click();
        WebElement wwod = driver.findElement(By.xpath("//input[@preset='overlay']"));
        wwod.sendKeys("Футболка", Keys.ENTER);
    }

}
