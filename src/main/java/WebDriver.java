import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {
    public static void main(String[] args) {

        org.openqa.selenium.WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        driver.quit();
    }
}
