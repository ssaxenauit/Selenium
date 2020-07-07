import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sort_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		
		Set<String> windowId = driver.getWindowHandles();
		Iterator<String> windowIdIterator = windowId.iterator();
		String parentWindowId = windowIdIterator.next();
		String childWindowId = windowIdIterator.next();
		driver.switchTo().window(childWindowId);
		
		List<WebElement> vegFruitName = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList = new ArrayList<String>();
		for(int i=0; i<vegFruitName.size(); i++)
		{
			originalList.add(vegFruitName.get(i).getText());
		}
		
		System.out.println("********OriginalList*********");
		System.out.println(originalList);
		
		ArrayList<String> copiedList = new ArrayList<String>();
		for(int i=0; i<originalList.size(); i++)
		{
			copiedList.add(originalList.get(i));
		}
		
		Collections.sort(copiedList);
		System.out.println("********CopiedList*********");
		System.out.println(copiedList);
		
		Assert.assertEquals(originalList, copiedList);
		driver.close();
	}

}
