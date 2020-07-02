import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Google_Search_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Google");
		
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).click();
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("TestNG");
		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys(Keys.ENTER);
		
		//System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "TestNG - Google Search");

	}

}
