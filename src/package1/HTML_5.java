package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTML_5 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://freshdesignweb.com/demo/html5-registration-form/");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sindhusha");
		driver.findElement(By.xpath("//input[@value='Sign me up!']")).click();
		List<WebElement> list_error = driver.findElements(By.cssSelector("input:invalid"));
		
		for(WebElement l :list_error)
		{
			
			System.out.println(l.getAttribute("name"));
		}
		

	}

}
