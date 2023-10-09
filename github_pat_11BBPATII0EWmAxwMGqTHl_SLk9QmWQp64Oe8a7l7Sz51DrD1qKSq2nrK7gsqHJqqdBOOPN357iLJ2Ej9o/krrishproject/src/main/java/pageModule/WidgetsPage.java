package pageModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import base.Drivermanager;
import base.Wrapper;
import webElement.Alert_xpath;
import webElement.Widgets_xpath;

public class WidgetsPage extends Drivermanager {
	public static Wrapper wrap = new Wrapper();

	public static void Widgets() throws InterruptedException {
		Widgets_xpath widgetsxp = new Widgets_xpath(driver);
		wrap.fluentWait(driver, widgetsxp.Widgets_menu);
		wrap.scrollByElements(driver, widgetsxp.Widgets_menu);
		wrap.CLICK(driver, widgetsxp.Widgets_menu);
		System.out.println("Widgets_menu  click");
		Thread.sleep(1000);
	}

	public void AutoComplete() throws AWTException, InterruptedException {
		Widgets_xpath widgetsxp = new Widgets_xpath(driver);
		wrap.fluentWait(driver, widgetsxp.Autocomplete_menu);
		wrap.scrollByElements(driver, widgetsxp.Autocomplete_menu);
		wrap.CLICK(driver, widgetsxp.Autocomplete_menu);
		System.out.println("Autocomplete_menu click");

		wrap.fluentWait(driver, widgetsxp.autoCompleteMultipleInput);
		wrap.CLICK(driver, widgetsxp.autoCompleteMultipleInput);
		Robot r = new Robot();
		for (int i = 0; i <= 2; i++) {

			r.keyPress(KeyEvent.VK_O);
			r.keyRelease(KeyEvent.VK_O);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		wrap.scrollByElements(driver, widgetsxp.autoCompleteSingleInput);
		wrap.CLICK(driver, widgetsxp.autoCompleteSingleInput);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public void DateTime() throws AWTException, InterruptedException {
		Widgets_xpath widgetsxp = new Widgets_xpath(driver);
		wrap.fluentWait(driver, widgetsxp.DatePicker_menu);
		wrap.scrollByElements(driver, widgetsxp.DatePicker_menu);
		wrap.CLICK(driver, widgetsxp.DatePicker_menu);
		System.out.println("DatePicker_menu click");

		wrap.fluentWait(driver, widgetsxp.datePickerMonthYearInput);
		wrap.scrollByElements(driver, widgetsxp.datePickerMonthYearInput);
		wrap.CLICK(driver, widgetsxp.datePickerMonthYearInput);
		Robot r = new Robot();
		for (int i = 1; i <= 10; i++) {
			r.keyPress(KeyEvent.VK_BACK_SPACE);
			r.keyRelease(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(1000);
		}
		wrap.SENDKEYS(driver, widgetsxp.datePickerMonthYearInput, "01/05/2022");
		wrap.CLICK(driver, widgetsxp.Dateandtime);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);
		wrap.SENDKEYS(driver, widgetsxp.dateAndTimePickerInput, "February 7, 2023 12:00 AM");

	}

	public void ProgressBar() throws InterruptedException {
		Widgets_xpath widgetsxp = new Widgets_xpath(driver);
		wrap.fluentWait(driver, widgetsxp.ProgressBar_menu);
		wrap.scrollByElements(driver, widgetsxp.ProgressBar_menu);
		wrap.CLICK(driver, widgetsxp.ProgressBar_menu);
		System.out.println("ProgressBar_menu click");

		wrap.fluentWait(driver, widgetsxp.startStopButton);
		wrap.scrollByElements(driver, widgetsxp.startStopButton);
		wrap.CLICK(driver, widgetsxp.startStopButton);
		Thread.sleep(10000);
		for (int i = 0; i <= 1; i++) {
			System.out.println("ProgressBar pass");

		}
		Thread.sleep(10000);
	}

	public void Menu() throws InterruptedException {
		Widgets_xpath widgetsxp = new Widgets_xpath(driver);
		wrap.fluentWait(driver, widgetsxp.Menu_menu);
		wrap.scrollByElements(driver, widgetsxp.Menu_menu);
		wrap.CLICK(driver, widgetsxp.Menu_menu);
		System.out.println("Menu_menu click");

		wrap.fluentWait(driver, widgetsxp.mainmenu2_menu);
		Thread.sleep(2000);
		wrap.CLICK(driver, widgetsxp.mainmenu2_menu);
		System.out.println("mainmenu2 passed");

		wrap.fluentWait(driver, widgetsxp.subsublist_menu);
		Thread.sleep(3000);
		wrap.CLICK(driver, widgetsxp.subsublist_menu);
		System.out.println("subsublist_menu passed");

		wrap.fluentWait(driver, widgetsxp.subsubitem1_menu);
		Thread.sleep(3000);
		wrap.CLICK(driver, widgetsxp.subsubitem1_menu);
		System.out.println("subsubitem1_menu passed");

	}
}
