package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		try {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[normalize-space(text())='Sign in']")).click(); //normalize space
		//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		WebElement Aut = driver.findElement(By.xpath("//span[contains(text(),'	Authentication')]"));
		if (Aut.isDisplayed()) {
			System.out.println(" Authentication is displayed");
			driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
			String s = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
			System.out.println(s);

		}
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
