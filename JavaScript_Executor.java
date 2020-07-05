import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		int i=0;
		driver.get("https://ksrtc.in");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String hiddenData = "return document.getElementById(\"fromPlaceName\").value";
		String hiddenValue = (String) js.executeScript(hiddenData);
		
		while(!hiddenValue.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			hiddenValue = (String) js.executeScript(hiddenData);
			
			System.out.println(hiddenValue);
			
			if(i>10)
			{
				System.out.println("Element Not Found");
			}
			else
				System.out.println("Element Found");
		}
		driver.close();
	}

}
