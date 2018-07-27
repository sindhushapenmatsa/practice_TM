package package1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		Actions ac = new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		ac.moveToElement(women).build().perform();
		
		List<WebElement> links_Women=driver.findElements(By.xpath("//a[@title='Women']/..//a"));
		
		
		for(WebElement LL:links_Women)
		{
			String href = LL.getAttribute("href");
			
			URL myurl = new URL(href);
			HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
			
			con.connect();
			int response_got = con.getResponseCode();
			System.out.println(response_got);
		}
////ul[@class="submenu-container clearfix first-in-line-xs"]//ul//li
	}

}
