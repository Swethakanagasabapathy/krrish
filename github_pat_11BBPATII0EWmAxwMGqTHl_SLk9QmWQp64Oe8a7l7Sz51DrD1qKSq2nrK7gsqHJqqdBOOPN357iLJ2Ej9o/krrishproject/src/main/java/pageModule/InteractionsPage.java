package pageModule;

import org.openqa.selenium.interactions.Actions;

import base.Drivermanager;
import base.Wrapper;
import webElement.Interactions_xpath;

public class InteractionsPage extends Drivermanager {
	public static Wrapper wrap = new Wrapper();

	public static void Interactions() throws InterruptedException {
		Interactions_xpath interxp = new Interactions_xpath(driver);
		wrap.fluentWait(driver, interxp.Interactions_menu);
		wrap.scrollByElements(driver, interxp.Interactions_menu);
		wrap.CLICK(driver, interxp.Interactions_menu);
		System.out.println("interactions_menu  click");
		Thread.sleep(1000);

	}

	public void Sortable() throws InterruptedException {
		Interactions_xpath interxp = new Interactions_xpath(driver);
		wrap.fluentWait(driver, interxp.Sortable_menu);
		wrap.scrollByElements(driver, interxp.Sortable_menu);
		wrap.CLICK(driver, interxp.Sortable_menu);
		System.out.println("Sortable_menu click");
		Thread.sleep(1000);

		Actions action = new Actions(driver);
		action.dragAndDrop(interxp.Sortabletabone.get(0), interxp.Sortabletabone.get(1)).perform();
		wrap.scrollByElements(driver, interxp.Sortabletabone.get(2));
		Thread.sleep(2000);
		action.dragAndDrop(interxp.Sortabletabone.get(2), interxp.Sortabletabone.get(3)).perform();
		System.out.println("list passed");
		Thread.sleep(2000);

		wrap.fluentWait(driver, interxp.gridtab);
		wrap.scrollByElements(driver, interxp.gridtab);
		wrap.CLICK(driver, interxp.gridtab);
		wrap.scrollByElements(driver, interxp.gridtab);
		Thread.sleep(2000);
		action.dragAndDrop(interxp.gridtabone.get(0), interxp.gridtabone.get(2)).perform();
		wrap.scrollByElements(driver, interxp.gridtabone.get(3));
		Thread.sleep(2000);
		action.dragAndDrop(interxp.gridtabone.get(3), interxp.gridtabone.get(5)).perform();
		System.out.println("Grid passed");
		Thread.sleep(2000);

	}

	public void Selectable() throws InterruptedException {
		Interactions_xpath interxp = new Interactions_xpath(driver);
		wrap.fluentWait(driver, interxp.Selectable_menu);
		wrap.scrollByElements(driver, interxp.Selectable_menu);
		wrap.CLICK(driver, interxp.Selectable_menu);
		System.out.println("Selectable_menu click");
		Thread.sleep(1000);

		wrap.fluentWait(driver, interxp.selectablelistone.get(0));
		wrap.scrollByElements(driver, interxp.selectablelistone.get(0));
		for (int i = 0; i <= 1; i++) {
			wrap.CLICK(driver, interxp.selectablelistone.get(i));
			Thread.sleep(500);
		}

			wrap.fluentWait(driver, interxp.selectablegridtab);
			wrap.scrollByElements(driver, interxp.selectablegridtab);
			wrap.CLICK(driver, interxp.selectablegridtab);
			wrap.scrollByElements(driver, interxp.selectablegridtab);
			System.out.println("selectablegridtab passed");
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			wrap.fluentWait(driver, interxp.selectablegridtabone.get(0));
			wrap.scrollByElements(driver, interxp.selectablegridtabone.get(0));
			action.dragAndDrop(interxp.selectablegridtabone.get(0), interxp.selectablegridtabone.get(2)).perform();
			wrap.scrollByElements(driver, interxp.selectablegridtabone.get(3));
			Thread.sleep(2000);
			action.dragAndDrop(interxp.selectablegridtabone.get(3), interxp.selectablegridtabone.get(5)).perform();
			System.out.println("selectableGridtabone passed");
			Thread.sleep(2000);
		}

	

	public void Resizable() throws InterruptedException {
		Interactions_xpath interxp = new Interactions_xpath(driver);
		wrap.fluentWait(driver, interxp.Resizable_menu);
		wrap.scrollByElements(driver, interxp.Resizable_menu);
		wrap.CLICK(driver, interxp.Resizable_menu);
		System.out.println("Resizable_menu click");
		Thread.sleep(1000);

		wrap.fluentWait(driver, interxp.resizableBoxWithRestriction);
		wrap.scrollByElements(driver, interxp.resizableBoxWithRestriction);
		Actions action = new Actions(driver);
		action.dragAndDropBy(interxp.resizableBoxWithRestriction, 100, 100).perform();
		Thread.sleep(1000);
		wrap.fluentWait(driver, interxp.resizable);
		wrap.scrollByElements(driver, interxp.resizable);
		action.dragAndDropBy(interxp.resizable, 200, 200).perform();
		Thread.sleep(1000);

	}
}
