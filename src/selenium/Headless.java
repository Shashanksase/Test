package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class Headless {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\c00423\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");

		
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
}
