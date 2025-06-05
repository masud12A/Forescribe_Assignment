package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
	
	//constructor..
	
		public DashboardPage(WebDriver driver) {
	        super(driver);
	    }
		


		// Locators...
		
		@FindBy(xpath = "//h6[normalize-space()='Dashboard']") WebElement msgDashboard;
		
		// User dropdown icon
		
	    @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/i")
	    WebElement userDropdownIcon;
	    
	   // Dropdown menu options
	    
	    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li")
	    List<WebElement> dropdownOptions;
		
	    
	    
	    
	    
	    
		//methods
		
		public boolean isDashboardPageExists()
		{
			try
			{
			return(msgDashboard.isDisplayed());
			}
			catch(Exception e)
			{
				return(false);
			}
		}
		
		
		//  Click the dropdown
		
	    public void clickUserDropdown() {
	        userDropdownIcon.click();
	    }
	    
	    
	     // Click Logout from dropdown
	    
	    public void clickLogout() {
	        for (WebElement option : dropdownOptions) {
	            if (option.getText().equals("Logout")) {
	                option.click();
	                break;
	            }
	        }
	    }
		
		


}
