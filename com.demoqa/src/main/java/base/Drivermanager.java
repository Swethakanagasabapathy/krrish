package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermanager {
	public static WebDriver driver;
	public static void Browsermanager(String browser) throws InterruptedException{
		 
		 System.out.println("Execution after setting ChromeDriver path in System setProperty method");
		 if(browser.contains("chrome")) {
			 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driverexe\\chromedriver.exe");
			 driver=new ChromeDriver();
		 } else {
			 System.out.println("no browsername found");
			 
		 }
		 
		 driver.get("https://demoqa.com");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 System.out.println("Execution complete");
		 
		 }
		 
}
