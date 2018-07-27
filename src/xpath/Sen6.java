package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sen6 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://testingmasters.weebly.com/webtables.html");
		List<WebElement> status = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr/td[8]/select"));
		List<WebElement> Empid = driver.findElements(By.xpath("//*[@id='VisitingTable']/tbody/tr/td[2]"));

		
		   for(int i=0;i<status.size();i++)
		   {
			   WebElement rv = status.get(i);
			   Select s = new Select(rv);
			  String Sel_opt = s.getFirstSelectedOption().getText();
			  if(Sel_opt.equalsIgnoreCase("Accepted"))
			  {
				 System.out.println(Empid.get(i).getText());
			  }
		   }

	}



}
