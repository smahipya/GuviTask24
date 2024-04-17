package GuviTask24;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SigninPage {

	WebDriver driver;
	public void SignPage (	WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="signin2")WebElement Signinbutton;
	@FindBy(id="sign-username")WebElement Signinuname;
	@FindBy(id="sign-password")WebElement SigninPassword;
	@FindBy(xpath="//button[@onclick=\"register()\"]")WebElement Signin;
	
	
	public void Signinbutton() {
		Signinbutton.click();
	}
	public void Signinuname() {
		Signinuname.sendKeys("Admin123@gmail.com");
	}
	public void SigninPassword() {
		SigninPassword.sendKeys("admin@123");
	}
	public void Signin() {
		Signin.click();
	}

}
