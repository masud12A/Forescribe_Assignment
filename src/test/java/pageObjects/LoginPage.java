package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage{
	
	//constructor..
	
	public LoginPage(WebDriver driver) {
        super(driver);
    }
	


	// Locators
	
	@FindBy(name = "username") WebElement txt_username;
	@FindBy(name = "password") WebElement txt_password;
	@FindBy(xpath = "//button[@type='submit']") WebElement btn_submit;

    

	public void SetUserName(String username)
	{
		txt_username.sendKeys(username);
	}
	public void SetPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	public void ClickSubmit()
	{
		btn_submit.click();
	}
}
