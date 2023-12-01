import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGoTest {
    public static void main(String[] args) {

        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("selenide");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();

        //driver.quit();
    }
}
