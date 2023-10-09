  package base;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Wrapper  {
////Fluent Wait method
	
	public static WebElement fluentWait(WebDriver driver, final WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement elementWaitedFor = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return element;
			}
		});
		return elementWaitedFor;
	}

	public  void scrollByElements(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}

	public void CLICK(WebDriver driver, WebElement element) {
		fluentWait(driver, element);
		element.click();

	}

	public  void SENDKEYS(WebDriver driver, WebElement element, String value) {
		fluentWait(driver, element);
		element.click();
		element.sendKeys(value);


	}

}
