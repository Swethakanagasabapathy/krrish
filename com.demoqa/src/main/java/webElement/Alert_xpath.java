package webElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert_xpath {
	public Alert_xpath(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h5[contains(.,'Alerts, Frame & Windows')]")
	public WebElement Alert_menu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Browser Windows')]")
	public WebElement BrowserWindows_menu;

	@FindBy(id = "tabButton")
	public WebElement BrowserWindows_tabButton;

	@FindBy(id = "windowButton")
	public WebElement BrowserWindows_windowButton;

	@FindBy(xpath = "//*[@id='sampleHeading']")
	public WebElement sampleHeading;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Alerts')]")
	public WebElement Alerts_menu;

	@FindBy(id = "alertButton")
	public WebElement Alerts_alertButton;

	@FindBy(id = "timerAlertButton")
	public WebElement Alerts_timerAlertButton;

	@FindBy(id = "confirmButton")
	public WebElement Alerts_confirmButton;

	@FindBy(id = "promtButton")
	public WebElement Alerts_promtButton;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Frames')]")
	public WebElement Frames_menu;

	@FindBy(xpath = "//iframe[@id='frame1']")
	public WebElement Frames_frame1;

	@FindBy(xpath = "//iframe[@id='frame2']")
	public WebElement Frames_frame2;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Modal Dialogs')]")
	public WebElement ModalDialogs_menu;

	@FindBy(xpath = "//button[@id='showSmallModal']")
	public WebElement ModalDialogs_smallmodel;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]")
	public WebElement ModalDialogs_smallmodeltext;

	@FindBy(xpath ="//button[@id='closeSmallModal']")
	public WebElement ModalDialogs_closesmallmodel;

	@FindBy(xpath = "//button[@id='showLargeModal']")
	public WebElement ModalDialogs_largemodel;

	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/p")
	public WebElement ModalDialogs_largemodeltext;
	
	@FindBy(xpath ="//button[@id='closeLargeModal']")
	public WebElement ModalDialogs_closelargemodel;


}
