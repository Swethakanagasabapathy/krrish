package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets_xpath {

	public Widgets_xpath(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[contains(.,'Widgets')]")
	public WebElement Widgets_menu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Auto Complete')]")
	public WebElement Autocomplete_menu;

	@FindBy(id = "autoCompleteMultipleInput")
	public WebElement autoCompleteMultipleInput;

	@FindBy(id = "autoCompleteSingleInput")
	public WebElement autoCompleteSingleInput;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Date Picker')]")
	public WebElement DatePicker_menu;
	
	@FindBy(id = "datePickerMonthYearInput")
	public WebElement datePickerMonthYearInput;
	
	@FindBy(xpath = "//*[@id=\"datePickerContainer\"]/div[2]/div[1]")
	public WebElement Dateandtime ;
	
	@FindBy(id = "dateAndTimePickerInput")
	public WebElement dateAndTimePickerInput;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Progress Bar')]")
	public WebElement ProgressBar_menu;
	
	@FindBy(id = "startStopButton")
	public WebElement startStopButton;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Menu')]")
	public WebElement Menu_menu;
	
	@FindBy(xpath = "//*[@id='nav']/li[2]/a")
	public WebElement mainmenu2_menu;
	
	@FindBy(xpath = "//*[@id=\"nav\"]/li[2]/ul/li[3]/a")
	public WebElement subsublist_menu;
	
	@FindBy(xpath = "//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[1]/a")
	public WebElement subsubitem1_menu;
	

}
