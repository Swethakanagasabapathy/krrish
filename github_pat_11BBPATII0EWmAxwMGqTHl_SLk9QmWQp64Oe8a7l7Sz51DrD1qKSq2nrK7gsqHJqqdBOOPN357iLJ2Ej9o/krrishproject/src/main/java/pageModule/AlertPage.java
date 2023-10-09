package pageModule;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import base.Drivermanager;
import base.Wrapper;
import webElement.Alert_xpath;
import webElement.Form_xpath;

public class AlertPage extends Drivermanager {
	public static Wrapper wrap = new Wrapper();

	public static void Alert() {
		Alert_xpath alertxp = new Alert_xpath(driver);
		wrap.fluentWait(driver, alertxp.Alert_menu);
		wrap.scrollByElements(driver, alertxp.Alert_menu);
		wrap.CLICK(driver, alertxp.Alert_menu);
		System.out.println("Alert_menu  click");
	}

	public void BrowserWindows() {
		Alert_xpath alertxp = new Alert_xpath(driver);
		wrap.fluentWait(driver, alertxp.BrowserWindows_menu);
		wrap.scrollByElements(driver, alertxp.BrowserWindows_menu);
		wrap.CLICK(driver, alertxp.BrowserWindows_menu);
		System.out.println("browserwindow_Menu click");
		wrap.fluentWait(driver, alertxp.BrowserWindows_tabButton);
		wrap.CLICK(driver, alertxp.BrowserWindows_tabButton);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		wrap.fluentWait(driver, alertxp.sampleHeading);
		if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("tabbutton passed");
		} else {
			System.out.println("tabbutton failed");
		}

		driver.close();
		driver.switchTo().window(tabs2.get(0));
		wrap.fluentWait(driver, alertxp.BrowserWindows_windowButton);
		wrap.CLICK(driver, alertxp.BrowserWindows_windowButton);

		String parent = driver.getWindowHandle();//HANDLING THE CURRENT WINDOW ONLY

		Set<String> s = driver.getWindowHandles();//HANDLING THE ALL WINDOWS AND STORING INTO THE S ......IT MEANS SET

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator(); //ITS AN LIST 10-1

		while (I1.hasNext()) {//CEHECKING THE WINDOW

			String child_window = I1.next();//ENTERING TO THE WINDOW

			if (!parent.equals(child_window)) {//CHECKING IF IT IS NOTEQUAL OR NOT
				driver.switchTo().window(child_window);//SWITCHING THE WINDOW

				wrap.fluentWait(driver, alertxp.sampleHeading);
				if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
					System.out.println("windowbutton passed");
				} else {
					System.out.println("windowbutton failed");
				}

				driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);

	}

	// Alert alert=driver.switchto.alert
//alert.accept//CLICK THE OK BUTTON
	//ALERT.DISMISS    CLICK THE CANCEL BUTTON

	public void Alerts() throws InterruptedException {
		Alert_xpath alertxp = new Alert_xpath(driver);
		wrap.fluentWait(driver, alertxp.Alerts_menu);
		wrap.scrollByElements(driver, alertxp.Alerts_menu);
		wrap.CLICK(driver, alertxp.Alerts_menu);
		System.out.println("Alerts_menu click");

		wrap.fluentWait(driver, alertxp.Alerts_alertButton);
		wrap.CLICK(driver, alertxp.Alerts_alertButton);
		System.out.println("Alerts_alertButton click");
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		wrap.fluentWait(driver, alertxp.Alerts_timerAlertButton);
		wrap.CLICK(driver, alertxp.Alerts_timerAlertButton);
		System.out.println("Alerts_timerAlertButton click");
		Thread.sleep(8000);
		org.openqa.selenium.Alert alert1 = driver.switchTo().alert(); 
		alert1.accept();
		Thread.sleep(1000);

		wrap.fluentWait(driver, alertxp.Alerts_confirmButton);
		wrap.scrollByElements(driver, alertxp.Alerts_confirmButton);
		wrap.CLICK(driver, alertxp.Alerts_confirmButton);
		System.out.println("Alerts_confirmButton click");
		Thread.sleep(1000);
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		Thread.sleep(1000);

		wrap.fluentWait(driver, alertxp.Alerts_promtButton);
		wrap.CLICK(driver, alertxp.Alerts_promtButton);
		System.out.println("Alerts_promtButton click");
		Thread.sleep(1000);
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("testing alerts");
		alert3.accept();
		Thread.sleep(1000);

	}

	public void Frames() throws InterruptedException {
		Alert_xpath alertxp = new Alert_xpath(driver);
		wrap.fluentWait(driver, alertxp.Frames_menu);
		wrap.scrollByElements(driver, alertxp.Frames_menu);
		wrap.CLICK(driver, alertxp.Frames_menu);
		System.out.println("frames_menu click");

		wrap.fluentWait(driver, alertxp.Frames_frame1);
		driver.switchTo().frame(alertxp.Frames_frame1);
		wrap.fluentWait(driver, alertxp.sampleHeading);
		if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("frame1 passed");
		} else {
			System.out.println("frame1 failed");

		}
		driver.switchTo().defaultContent();//IT WILL RETURN TO THE PARENT FRAME

		wrap.fluentWait(driver, alertxp.Frames_frame2);
		wrap.scrollByElements(driver, alertxp.Frames_frame2);
		driver.switchTo().frame(alertxp.Frames_frame2);
		wrap.fluentWait(driver, alertxp.sampleHeading);
		if (alertxp.sampleHeading.getText().equalsIgnoreCase("This is a sample page")) {
			System.out.println("frame2 passed");
		} else {
			System.out.println("frame2 failed");

		}
		driver.switchTo().defaultContent();  //IT WILL RETURN TO THE PARENT FRAME

	}

	public void ModalDialogs() throws InterruptedException {
		Alert_xpath alertxp = new Alert_xpath(driver);
		wrap.fluentWait(driver, alertxp.ModalDialogs_menu);
		wrap.scrollByElements(driver, alertxp.ModalDialogs_menu);
		wrap.CLICK(driver, alertxp.ModalDialogs_menu);
		System.out.println("ModalDialogs_menu click");

		wrap.fluentWait(driver, alertxp.ModalDialogs_smallmodel);
		wrap.scrollByElements(driver, alertxp.ModalDialogs_smallmodel);
		wrap.CLICK(driver, alertxp.ModalDialogs_smallmodel);
		System.out.println("ModalDialogs_small model");
		Thread.sleep(3000);
		wrap.fluentWait(driver, alertxp.ModalDialogs_smallmodeltext);
		if (alertxp.ModalDialogs_smallmodeltext.getText()
				.equalsIgnoreCase("This is a small modal. It has very less content")) {
			System.out.println("small model passed");
		} else {
			System.out.println("small model failed");

		}

		wrap.CLICK(driver, alertxp.ModalDialogs_closesmallmodel);
		Thread.sleep(2000);

		

		wrap.fluentWait(driver, alertxp.ModalDialogs_largemodel);
		wrap.scrollByElements(driver, alertxp.ModalDialogs_largemodel);
		wrap.CLICK(driver, alertxp.ModalDialogs_largemodel);
		System.out.println("ModalDialogs_large model");
		Thread.sleep(3000);
		wrap.fluentWait(driver, alertxp.ModalDialogs_largemodeltext);
		if (alertxp.ModalDialogs_largemodeltext.getText().contains("Lorem Ipsum is simply dummy text of the printing and typesetting industry.")) {
			System.out.println("large model passed");
		} else {
			System.out.println("large model failed");

		}

		wrap.CLICK(driver, alertxp.ModalDialogs_closelargemodel);
		Thread.sleep(2000);

	}
}
