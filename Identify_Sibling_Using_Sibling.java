import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identify_Sibling_Using_Sibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/");
			Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class='tools']/div/nav/ul/li[4]/a/i")).click();
		driver.findElement(By.cssSelector("input[id=user_email]")).sendKeys("shwetasaxena42@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Myself16");
		
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		System.out.println(driver.getTitle());
	}

}
