import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				/*Check the first  Checkbox and verify if it is successfully checked and Uncheck it again 
				 * to verify if it is successfully Unchecked
				 */
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
				
				driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
				Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
				
				//How to get the Count of number of check boxes present in the page?
				System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
				Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 3);

		}
	
}
