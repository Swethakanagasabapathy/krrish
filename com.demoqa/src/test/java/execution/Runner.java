package execution;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Drivermanager;
import pageModule.AlertPage;
import pageModule.BookStoreApplicationPage;
import pageModule.FormPage;
import pageModule.InteractionsPage;
import pageModule.WidgetsPage;

import webElement.BookStoreApplication_xpath;
import webElement.Interactions_xpath;
import webElement.Widgets_xpath;

public class Runner extends Drivermanager {
	
	FormPage form = new FormPage();
	AlertPage alert = new AlertPage();
	WidgetsPage Widgets = new WidgetsPage();
	InteractionsPage inter = new InteractionsPage();
	BookStoreApplicationPage bookxp = new BookStoreApplicationPage();	

	//@DataProvider(name = "excelData")
	//public Object[][] readExcel() throws InvalidFormatException, IOException {
		//return ReadExcel.readExcel(System.getProperty("user.dir") + "/src/test/resources/dataSheet/PractiseForm.xlsx",
			//	"PractiseForm");
	//}

	@Test(priority = 1, enabled = true, dataProvider = "excelData")
	public void testCase1(String firstname, String lastname, String mobilenumber) throws InterruptedException {
		System.out.println("This is the A Normal Test Case1");
		form.form();
		form.practiseform(firstname, mobilenumber);

	}

	@Test(priority = 2, enabled = true)
	public void testCase2() throws InterruptedException {
		System.out.println("This is the A Normal Test Case2");
		alert.Alert();
		alert.BrowserWindows();
		alert.Alerts();
		alert.Frames();
		alert.ModalDialogs();
	}

	@Test(priority = 3, enabled = true)
	public void testCase3() throws InterruptedException, AWTException {
		System.out.println("This is the A Normal Test Case3");
		Widgets.Widgets();
	  Widgets.AutoComplete();
	    Widgets.DateTime();
		Widgets.ProgressBar();
		Widgets.Menu();
	}

	@Test(priority = 4, enabled = true)
	public void testCase4() throws InterruptedException, AWTException {
		System.out.println("This is the A Normal Test Case4");
		inter.Interactions();
		inter.Sortable();
		inter.Selectable();
		inter.Resizable();

	}
	@Test(priority = 5, enabled = true)
	public void testCase5() throws InterruptedException, AWTException {
		System.out.println("This is the A Normal Test Case5");
		bookxp.BookStoreApplication();
		bookxp.Login();
	}

	@BeforeMethod
	@Parameters({ "browsername" })
	public void beforeMethod(String browser) throws InterruptedException {
		System.out.println("This will execute before every Method");
		Browsermanager(browser);
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every Method");
		driver.quit();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Test Suite");
	}

}
