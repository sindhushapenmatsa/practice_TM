package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Calender {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/search?q=google+calculator");
		driver.manage().window().maximize();

		File f = new File("C:\\Users\\USER\\Desktop\\Calculator.xlsx");
		FileInputStream finput = new FileInputStream(f);
		XSSFWorkbook WB = new XSSFWorkbook(finput);
		XSSFSheet WS = WB.getSheet("Input");

		int last_row_no = WS.getLastRowNum();

		for (int i = 1; i <= last_row_no; i++) {
			Row r = WS.getRow(i);
			Cell cell = r.getCell(0);
			cell.setCellType(cell.CELL_TYPE_STRING);
			String num1 = cell.getStringCellValue();
			System.out.println(num1);
			
			
			
			cell = r.getCell(2);
			cell.setCellType(cell.CELL_TYPE_STRING);
			String operator =cell.getStringCellValue();
			System.out.println(operator);
			
			
			cell = r.getCell(1);
			cell.setCellType(cell.CELL_TYPE_STRING);
			String num2 = cell.getStringCellValue();
			System.out.println(num2);

			cell = r.getCell(3);
			cell.setCellType(cell.CELL_TYPE_STRING);
			String expected = cell.getStringCellValue();
			
			System.out.println(driver.findElement(By.xpath("//span[text()='" + num1 + "']")).getText());
			driver.findElement(By.xpath("//span[text()="+num1+"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='" + operator + "']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='" + num2 + "']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='=']")).click();
			Thread.sleep(2000);
			String actual = driver.findElement(By.xpath("//span[@id='cwos']")).getText();
			System.out.println(expected + " ----------" + actual);
			Thread.sleep(2000);
			
			r.createCell(4).setCellValue(actual);
			
			

		}
	
		
		FileOutputStream fout = new FileOutputStream(f);
		WB.write(fout);
		WB.close();
		fout.close();
		

	}

}
