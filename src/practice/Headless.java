package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@SuppressWarnings("unused")
public class Headless {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\c00423\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
	}
}
