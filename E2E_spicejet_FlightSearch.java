import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E_spicejet_FlightSearch{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		System.out.println(driver.getTitle());
			Thread.sleep(15000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
		if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
		{
			System.out.println("Is Disabled");
			Assert.assertFalse(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
		driver.findElement(By.cssSelector("div[id='divpaxinfo']")).click();
			Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Adult']")).click();
			Thread.sleep(2000);
		Select Adult = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		Adult.selectByVisibleText("4");
		
		driver.findElement(By.cssSelector("select[id='ctl00_mainContent_ddl_Child']")).click();
		Thread.sleep(2000);
		Select Child = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child']")));
		Child.selectByIndex(1);
		//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Child'] //option[@value='1']")).click();
		
		Select currency = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		currency.selectByValue("INR");
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_btn_FindFlights']")).click();
		
		
		
		

	}

}
