import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	System.out.println(driver.getTitle());
	 Thread.sleep(2000);
	String text="Shweta";
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("alertbtn")).click();
	
	System.out.println((driver.switchTo().alert().getText()));
	driver.switchTo().alert().accept();
	
	driver.findElement(By.id("name")).sendKeys(text);
	driver.findElement(By.id("confirmbtn")).click();
	System.out.println((driver.switchTo().alert().getText()));
	driver.switchTo().alert().dismiss();
	

	}

}
