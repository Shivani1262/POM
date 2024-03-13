package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonUtils.WebDriverUtil;

public class HomePage extends WebDriverUtil {
	//Identify Organization
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement Organization ;
	
	//Identify Contacts
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement Contacts ;
	
	//Identify  image
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement image ;
	
	//Identify  signout
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutbtn ;
	
	//Create contructor to initialize WebElements. 
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Create a Method
	public void Home() {
		//click on organizations
		Organization.click();
	}	
	public void Home(WebDriver driver) {	
		//Mouse hover on image
		mouseOver(driver, image);
		signoutbtn.click();
	}

	public WebElement getOrganization() {
		return Organization;
	}

	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}
}
