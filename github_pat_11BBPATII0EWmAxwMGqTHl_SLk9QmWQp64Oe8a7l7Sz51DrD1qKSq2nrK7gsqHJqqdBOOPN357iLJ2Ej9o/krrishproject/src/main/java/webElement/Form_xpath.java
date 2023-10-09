package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Form_xpath {
	public Form_xpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[contains(.,'Forms')]")
	public WebElement form_Menu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Practice Form')]")
	public WebElement Practiceform_Menu;

	@FindBy(id = "firstName")
	public WebElement Practiceform_Firstname;

	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement Practiceform_Lastname;

	@FindBy(xpath = "//input[@id='userEmail']")
	public WebElement Practiceform_Useremail;

	@FindBy(xpath = "//label[@for='gender-radio-2']")
	public WebElement Practiceform_Genderfemale;

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	public WebElement Practiceform_Mobilenumber;

	@FindBy(xpath = "//div[@class='subjects-auto-complete__placeholder css-1wa3eu0-placeholder']")
	public WebElement Practiceform_Subjects;

	@FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
	public WebElement Practiceform_Sports;

	@FindBy(xpath = "//textarea[@placeholder='Current Address']")
	public WebElement Practiceform_CurrentAddress;

}


