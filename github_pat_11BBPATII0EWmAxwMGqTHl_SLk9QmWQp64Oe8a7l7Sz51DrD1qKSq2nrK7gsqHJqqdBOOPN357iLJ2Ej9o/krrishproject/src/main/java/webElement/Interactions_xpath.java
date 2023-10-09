package webElement;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Interactions_xpath {

	public Interactions_xpath(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[contains(.,'Interactions')]")
	public WebElement Interactions_menu;

	@FindBy(xpath = "//span[@class='text' and contains(.,'Sortable')]")
	public WebElement Sortable_menu;

	@FindBy(xpath = "//div[@id='demo-tabpane-list']//child::div[@class='list-group-item list-group-item-action']")
	public List<WebElement> Sortabletabone;

	@FindBy(id = "demo-tab-grid")
	public WebElement gridtab;

	@FindBy(xpath = "//div[@id='demo-tabpane-grid']//child::div[@class='list-group-item list-group-item-action']")
	public List<WebElement> gridtabone;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Selectable')]")
	public WebElement Selectable_menu;
	
	@FindBy(xpath = "//div[@id='demo-tabpane-list']//li[@class='mt-2 list-group-item list-group-item-action']")
	public List<WebElement> selectablelistone;
	
	@FindBy(xpath = "//span[@class='text' and contains(.,'Resizable')]")
	public WebElement Resizable_menu;
	
	@FindBy(xpath = "//*[@id=\"resizableBoxWithRestriction\"]/span")
	public WebElement resizableBoxWithRestriction;
	
	@FindBy(xpath = "//*[@id=\"resizable\"]/span")
	public WebElement resizable;
	
	@FindBy(id = "demo-tab-grid")
	public WebElement  selectablegridtab;
	
	@FindBy(xpath = "//div[@class='list-group list-group-horizontal-sm']")
	public List<WebElement> selectablegridtabone;
	
	
	
	
	
	
}

