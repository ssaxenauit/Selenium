import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScoreCard_Live_Match {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cricbuzz.com/");
		Actions mouseClick = new Actions(driver);

		mouseClick.click(driver.findElement(By.xpath("//a[@title='Live Cricket Score']"))).build().perform();
		Thread.sleep(2000);
		mouseClick
				.click(driver.findElement(By.xpath("//div[@id='page-wrapper']/div[5]/div[2]/div/div/div[1]/nav/a[2]")))
				.build().perform();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		WebElement scoreTable = driver.findElement(By.xpath("//div[@id='page-wrapper']/div[4]/div[2]/div[2]/div[1]"));

		int rowScore = scoreTable
				.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int TotalScore = 0;
		for (int i = 0; i < (rowScore - 2); i++) {
			System.out.println(scoreTable
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(1)")).get(i)
					.getText()
					+ " "
					+ scoreTable
							.findElements(
									By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
							.get(i).getText());
			int run = Integer.parseInt(scoreTable
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText());
			TotalScore = TotalScore + run;
		}

		for (int x = (rowScore - 2); x < rowScore; x++) {
			System.out.println(scoreTable
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(1)")).get(x)
					.getText()
					+ " "
					+ scoreTable
							.findElements(
									By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(2)"))
							.get(x).getText());
		}
		int Extras = Integer
				.parseInt(scoreTable.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		int Total = Integer
				.parseInt(scoreTable.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		TotalScore = TotalScore + Extras;

		if (TotalScore == Total) {
			System.out.println("Sum of score calculated matches the Total Score on the Web Page");
		} else
			System.out.println("Error in calculation");
		
		driver.close();
	}

}
