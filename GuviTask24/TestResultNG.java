package GuviTask24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;


public class TestResultNG {
	
	WebDriver driver =new ChromeDriver	();
	SigninPage sg =new SigninPage ();
	LoginPage lg =new LoginPage(driver);

	@BeforeTest
	public void start() {
	driver.get("https://www.demoblaze.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	driver.manage().window().maximize();}
	
	
	@Test(dependsOnMethods= {"signup"})
	public void login () throws InterruptedException {
		
   
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(1000));
	wait.until(ExpectedConditions.visibilityOf(lg.Loginbutton));
	lg.Loginbutton();
	lg.Loginuname();
	lg.Loginpassword();
	wait.until(ExpectedConditions.elementToBeClickable(lg.login)); 
	
	lg.login();
	
}
	
	@Test()
	public void signup() throws Exception{

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(sg.Signinbutton));
	sg.Signinbutton();
	sg.Signinuname();
	sg.SigninPassword();
	sg.Signin();
	
	Alert alert =driver.switchTo().alert();
    String text=alert.getText();
    System.out.println(text);
    alert.accept();

	}
	@AfterTest
	public void close() {
		driver.close();
	}
	
}
