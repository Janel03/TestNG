package class01;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class testNGExample {
    //    writing down all the pre-conditions for a test case
    public static WebDriver driver;
    @BeforeMethod
    public void SetUoBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    //post conditions for test case
    @AfterMethod()
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    // Test 1
    /*go to Syntax Hrms
    enter the username & password, verify that you're logged in
    close the browser*/
    @Test
    public void LoginFunctionality(){
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();
    }
    //    ----Test2---
//    goto syntax Hrms
//    verify the  password is there
//    close the browser
    @Test
    public void loginBtnVerification(){
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println( password.isDisplayed());
    }
}
