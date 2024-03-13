package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

		//Identify Username Textfield
		@FindBy(name="user_name")
		private WebElement Usernametf ;
		
		//Identify Password Textfield
		@FindBy(name="user_password")
		private WebElement Passwordtf ;
		
		//Identify Login button
		@FindBy(id="submitButton")
		private WebElement Loginbtn ;
		
		//Crete a constructor to initialize WebElements.
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//Create a Method
		public void Login(String usernamedata, String passworddata) {
			Usernametf.sendKeys(usernamedata);
			Passwordtf.sendKeys(passworddata);
			Loginbtn.click();
		}

		public WebElement getUsernametf() {
			return Usernametf;
		}

		public WebElement getPasswordtf() {
			return Passwordtf;
		}

		public WebElement getLoginbtn() {
			return Loginbtn;
		}
}
