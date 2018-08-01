package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.talentzing.com/Recruiter/Recruiterregistration.aspx?LoginType=1");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\USER\\Desktop\\Hello.txt");

	}

}
