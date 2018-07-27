package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sen7 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> Empid = driver.findElements(By.xpath("//*[@id='VisitingTable']"
				+ "/tbody/tr/td[3][text()='Vinod']/following-sibling::td[2][text()='Analyst']/preceding-sibling::td[4]"));
		System.out.println("no.of people who are vinod and analyst"+ Empid.size());
		   for(WebElement EI : Empid)
		   {
			   EI.click();
		   }

	}

}
