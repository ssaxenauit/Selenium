import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SIGNUP_qaclickacademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/");
			Thread.sleep(15000);
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//div[@class=\"tools\"]/div/nav/ul/li[3]/a/i")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("input[id=user_name]")).sendKeys("sslearning");
		driver.findElement(By.cssSelector("input[id=user_email]")).sendKeys("shwetasaxena42@gmail.com");
		driver.findElement(By.cssSelector("input[id=user_password]")).sendKeys("Myself16");
		driver.findElement(By.cssSelector("input[id=user_password_confirmation]")).sendKeys("Myself16");
		
		driver.findElement(By.xpath("//input[@id='user_unsubscribe_from_marketing_emails']")).click();
		driver.findElement(By.xpath("//input[@id='user_agreed_to_terms']")).click();
		
		driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
		
		System.out.println(driver.getTitle());
	
	}

}
