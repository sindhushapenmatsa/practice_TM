package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sen3 {

	public static void main(String[] args) {
		
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://testingmasters.weebly.com/webtables.html");
			List<WebElement> Empid = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr/td[5][text()='Manager']/preceding-sibling::td[4]"));
			System.out.println("no.of managers is"+ Empid.size());
			   for(WebElement EI : Empid)
			   {
				   EI.click();
			   }

	}

}
