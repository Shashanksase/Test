package practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaQuiz {

	int i;
	int j;

	void A() {
		i = 1;
		j = 2;
	}

	// private int i = j;
	// private int j = 10;

	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\c00423\\eclipse-workspace\\Test\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.tutorialspoint.com/index.htm";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		// capture screenshot and store the image
		TakesScreenshot scrhst = (TakesScreenshot) driver;//1
		File scrfile = scrhst.getScreenshotAs(OutputType.FILE);//2
		FileUtils.copyFile(scrfile, new File("C:\\Users\\c00423\\eclipse-workspace\\Test\\Screnshot\\image.png"));
		
		//1 and 2 line in single line write the code 
		// File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		driver.quit();

		/*
		 * String Str1 = " Java "; String Str2 = " is "; String Str3 = " awesome .";
		 * String StrResult = Str1.trim() + Str2 + Str3.trim();
		 * System.out.println(StrResult);
		 * 
		 * char chars[] = { 'a', 'b', 'c' }; String str = new String(chars);
		 * System.out.println(str); JavaQuiz testObj = new JavaQuiz();
		 * System.out.print(testObj.toString());
		 * 
		 * String Java = "Are you a Java expert? Yes, you are.";
		 * System.out.println(Java.charAt(9)); String StrArr[] = { "JAVA", "JDK", "JRE"
		 * }; String Str = "JAVA"; System.out.println(StrArr[0] == Str); //
		 * System.out.println((new JavaQuiz()).i); final String str1 = "social"; final
		 * String str2 = "media"; String str3 = str1 + str2; String str4 =
		 * "socialmedia"; System.out.println(str3 == str4); // Object str; //
		 * str.replaceAll(Character.toString(‘c’), “”);
		 * System.out.println(Integer.parseInt("10")); String str11 = "How are you?";
		 * String str21 = str11.substring(0, 7); System.out.println(str21); String word
		 * = "abcde"; for (int i = 0; i < 4; i += 2) { // System.out.print(word[i]); }
		 */
	}

}
