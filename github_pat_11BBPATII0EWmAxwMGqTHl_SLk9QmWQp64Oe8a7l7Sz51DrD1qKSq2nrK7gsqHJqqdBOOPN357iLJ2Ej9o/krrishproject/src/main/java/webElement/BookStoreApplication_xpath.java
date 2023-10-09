package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStoreApplication_xpath {
	

	public BookStoreApplication_xpath(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[contains(.,'Book Store Application')]")
	public WebElement BookStoreApplication_menu;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Login')]")
	public WebElement Login_menu;
	
	@FindBy(id = "userName")
	public WebElement userName;
	
	@FindBy(id = "password")
	public WebElement password;
	
	@FindBy(id = "login")
	public WebElement login;
	
	
	
	
}