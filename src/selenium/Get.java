package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

@SuppressWarnings("unused")
public class Get {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * System.setProperty("webdriver.ie.driver",
		 * "C:\\Users\\c00423\\eclipse-workspace\\Test\\Drivers\\IEDriverServer.exe");
		 * WebDriver driver = new InternetExplorerDriver();
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\c00423\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// String baseUrl = "https://www.amazon.in/";
		// String tagName = "";

		driver.navigate().to("https://www.google.co.in/");
		driver.manage().window().maximize();
		String str = driver.getCurrentUrl();
		System.out.println("The current URL is " + str);
		/*
		 * driver.navigate().to(baseUrl); driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(400, null);
		 * 
		 * driver.navigate().refresh(); //System.out.println(driver.getPageSource());
		 */
		
		
		driver.close();
		System.exit(0);

	}

}
