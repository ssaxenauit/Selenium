import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot_E2E {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		File src = scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\Selenium_Udemy\\ScreenShot\\screenshot.png"));
	}

}
