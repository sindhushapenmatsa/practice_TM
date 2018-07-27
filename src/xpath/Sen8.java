package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sen8 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> Empid = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr[position()<6]/td[1]"));
		System.out.println("first 5 records"+ Empid.size());
		   for(WebElement EI : Empid)
		   {
			   EI.click();
		   }

	}

}
