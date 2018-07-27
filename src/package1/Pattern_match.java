package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_match {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\USER\\Desktop\\Hello.txt");
		FileReader fr = new FileReader(f);
		BufferedReader fb = new BufferedReader(fr);
		
		String st ="";
		String pattern = "[A-Z]{5}[0-9]{4}[A-Z]{2}";
		 
		Pattern p = Pattern.compile(pattern);
		
	 
	   while((st=fb.readLine())!=null)
		{			
		   Matcher m = p.matcher(st);
		   while(m.find())
		   {
			   System.out.println(m.group());
		   }
		
			
		}
		
		

	}

}
