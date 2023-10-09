package execution;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Drivermanager;
import pageModule.AlertPage;
import pageModule.BookStoreApplicationPage;
import pageModule.FormPage;
import pageModule.InteractionsPage;
import pageModule.WidgetsPage;

public class Runner extends Drivermanager {
	FormPage form = new FormPage();
	AlertPage alert = new AlertPage();
	WidgetsPage Widgets = new WidgetsPage();
	InteractionsPage inter = new InteractionsPage();
	BookStoreApplicationPage bookxp = new BookStoreApplicationPage();

	@Test(priority = 1, enabled = true)
	public void testCase1() {
		System.out.println("This is the A Normal Test Case1");
		form.form();
		form.practiceform();

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

		System.out.println("This is the A Normal Test Case2");
		Widgets.Widgets();
		Widgets.AutoComplete();
		Widgets.DateTime();
		Widgets.ProgressBar();
		Widgets.Menu();

	}

	@Test(priority = 4, enabled = true)
	public void testCase4() throws InterruptedException {

		System.out.println("This is the A Normal Test Case2");
		inter.Interactions();
		inter.Sortable();
		inter.Selectable();
		inter.Resizable();

	}

	@Test(priority = 5, enabled = true)
	public void testCase5() throws InterruptedException {

		System.out.println("This is the A Normal Test Case2");
		bookxp.BookStoreApplication();
		bookxp.Login();

	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		System.out.println("This will execute before every Method");
        Browsermanager();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every Method");
		driver.close();
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
