package pagesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import base.BasePage;

public class HomePage extends BasePage {
	 
	public HomePage(WebDriver driver) {
		super(driver);
		}
	
	
	@FindBy(id="signin_button")
	public WebElement btnSignIn;
	
	public void doClickSingInbtn() {
		btnSignIn.click();
		
	}
	
	@FindBy(id="online-banking")
	public WebElement btnMoreServices;
	
	
	public void doClickMoreServicesbtn() {
		btnMoreServices.click();
		
	}
	
	
	

}
