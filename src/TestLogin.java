import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String path = System.getProperty("user.dir") + "/login.html";
        driver.get("file:///" + path);

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement button = driver.findElement(By.tagName("button"));

        username.sendKeys("admin" );
        password.sendKeys("1234");
        button.click();

        try { Thread.sleep(2000); } catch (Exception e) {}

        WebElement message = driver.findElement(By.id("message"));
        System.out.println(message.getText());

        driver.quit();
    }
}