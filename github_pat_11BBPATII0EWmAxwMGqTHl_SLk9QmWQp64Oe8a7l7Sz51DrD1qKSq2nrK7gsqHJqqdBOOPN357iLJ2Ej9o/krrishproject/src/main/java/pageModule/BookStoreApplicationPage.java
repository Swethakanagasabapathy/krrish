package pageModule;

import base.Drivermanager;
import base.Wrapper;
import webElement.BookStoreApplication_xpath;

public class BookStoreApplicationPage extends Drivermanager {
	public static Wrapper wrap = new Wrapper();

	public static void BookStoreApplication() throws InterruptedException {
		BookStoreApplication_xpath bookxp = new BookStoreApplication_xpath(driver);
		wrap.fluentWait(driver, bookxp.BookStoreApplication_menu);
		wrap.scrollByElements(driver, bookxp.BookStoreApplication_menu);
		wrap.CLICK(driver, bookxp.BookStoreApplication_menu);
		System.out.println("BookStoreApplication_menu  click");
		Thread.sleep(1000);

	}

	public static void Login() throws InterruptedException {
		BookStoreApplication_xpath bookxp = new BookStoreApplication_xpath(driver);
		wrap.fluentWait(driver, bookxp.Login_menu);
		wrap.scrollByElements(driver, bookxp.Login_menu);
		wrap.CLICK(driver, bookxp.Login_menu);
		System.out.println("Login_menu  click");
		Thread.sleep(1000);

		wrap.fluentWait(driver, bookxp.userName);
		wrap.scrollByElements(driver, bookxp.userName);
		wrap.SENDKEYS(driver, bookxp.userName, "Swetha");
		wrap.fluentWait(driver, bookxp.password);
		wrap.SENDKEYS(driver, bookxp.password, "Swetha@2000");
		Thread.sleep(1000);
		wrap.scrollByElements(driver, bookxp.login);
		wrap.CLICK(driver, bookxp.login);
		Thread.sleep(2000);
		System.out.println("login passed");

	}

}
