package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooSearch {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/?p=us");
		driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("h");
		List<WebElement> L = driver.findElements(By.xpath("//input[@id='uh-search-box']/../descendant::li"));
		
		for(WebElement W : L)
		{
			String s = W.getText();
			if(s.startsWith("h"))
			{
				System.out.println("Starting with h " + W.getText());
			}
			else
			{
				System.out.println("not starting with h " + W.getText());
			}
		}

	}

}
