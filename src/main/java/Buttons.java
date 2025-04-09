import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        WebElement dclickMe = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(dclickMe).perform();
        WebElement RCM = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(RCM).perform();
        WebElement btn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        btn.click();
        Thread.sleep(5000);
        // Закрыть драйвер после выполнения
        driver.quit();
    }
}
