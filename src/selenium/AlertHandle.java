package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AlertHandle {
	@Test
	public void alertWindow() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\c00423\\Documents\\GitHub\\Test\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String print = alert.getText();
		System.out.println(print);
		alert.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Thread.sleep(3000);
		alert.dismiss();

		Thread.sleep(3000);

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//header/h1[1]/a[1]"));
		action.contextClick(element).build().perform();
		System.out.println(element);

		driver.quit();
	}
}
