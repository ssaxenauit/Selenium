import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_EditBoxes_Error {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://cleartrip.com");
		//System.out.println(driver.getTitle());
		
		Select Adult = new Select(driver.findElement(By.id("Adults")));
		Adult.selectByValue("4");
		
		Select Child = new Select(driver.findElement(By.id("Childrens")));
		Child.selectByVisibleText("1");
		
		driver.findElement(By.cssSelector(".depart_date.keyValue.span.span24.required.hasDatepicker.placeholder")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		
		driver.findElement(By.id("SearchBtn")).click();
			Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		//System.out.println(driver.getTitle());
		

	}

}
