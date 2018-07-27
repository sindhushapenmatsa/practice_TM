package package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Low_High {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php?id_category=11&controller=category");
		
		WebElement dropdown_sort = driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		
		Select s = new Select(dropdown_sort);
		s.selectByVisibleText("Price: Lowest first");
		
		Thread.sleep(3000);
		Actions Ac = new Actions(driver);
		Ac.moveToElement(driver.findElement(By.xpath("//span[text()='Summer Dresses']"))).build().perform();
		
		
		List<WebElement> cost = driver.findElements(By.xpath("//ul[@class='product_list grid row']//div[1]/span[1]"));
		
		for(WebElement c : cost)
		{
			
			System.out.println(c.getText());
	
		}
		
		
		

	}

}
