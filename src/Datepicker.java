import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker {

	public static void main(String[] args) throws ParseException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/flights");
		driver.findElement(By.id("hp-widget__depart")).click();
		
		String userdate = "12/7/2018";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date datetobeselected =sdf.parse(userdate);
		
		  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");  
		    Date Sysdatedate = new Date();  
		    System.out.println(formatter.format(Sysdatedate));
		    
		    
		String appmonyear = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div[1]/div[1]/div[1]/div[1]")).getText();
		System.out.println(appmonyear);
		
		String month = new SimpleDateFormat("MMMM").format(datetobeselected);
		String year = new SimpleDateFormat("yyyy").format(datetobeselected);
		String date = new SimpleDateFormat("dd").format(datetobeselected);
		
		String usermonyear=(month+" "+year).toUpperCase();
		System.out.println(usermonyear);
		
		while(true){
			appmonyear = driver.findElement(By.xpath("//div[@class='dateFilter hasDatepicker']/div[1]/div[1]/div[1]/div[1]")).getText();
			if(appmonyear.equals(usermonyear)){
				
				System.out.println(true);
				driver.findElement(By.xpath("//a[text()="+date+"]")).click();
				break;
			
			}
			
			else
			{
				if(datetobeselected.after(Sysdatedate))
				{
				driver.findElement(By.xpath("//span[starts-with(text(),'Next')]")).click();
				}
				
				else
				{
					driver.findElement(By.xpath("//span[starts-with(text(),'Prev')]")).click();
				}
				
			}
				
				
			
			
		}
		
				
		
		
		
		
		

	}

	
	
}
