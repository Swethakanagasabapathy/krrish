package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermanager {

	public static WebDriver driver;

	public static void Browsermanager() throws InterruptedException {

		System.out.println("Execution after setting ChromeDriver path in System setProperty method");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sweety\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		System.out.println(" before Execution complete");
		driver.get("https://demoqa.com/");
		System.out.println(" after Execution complete");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Execution complete");
	}
}
