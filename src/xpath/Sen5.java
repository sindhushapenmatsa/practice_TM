package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sen5 {

	public static void main(String[] args) {
		
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://testingmasters.weebly.com/webtables.html");
			List<WebElement> Empid = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr/td[5][text()='Analyst']/following-sibling::td[3]/select"));
			System.out.println("no.of Analysts"+ Empid.size());
			
			   for(WebElement EI : Empid)
			   {
				   Select s = new Select(EI);
				   s.selectByVisibleText("Rejected");
			   }


	}

}
