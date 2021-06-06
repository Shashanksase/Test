package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentStart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\c00423\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		Thread.sleep(1000);
		dr.get("https://www.google.com/search?q=webdriver+api+in+selenium&rlz=1C1GCEU_enIN868IN868&sxsrf=ALeKk00RvGZRbUDNXerEWSC9QGtK8ELuCA:1622008223949&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjDiYvA0-bwAhUm7XMBHZftAuwQ_AUoAXoECAEQAw&biw=1280&bih=881");

		dr.quit();
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 5; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");

			}
			System.out.println();

		}

		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
