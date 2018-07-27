import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class sysdate {

	public static boolean DateCompare() throws ParseException {
		
	String userdate = "12/07/2018";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date datetobeselected =sdf.parse(userdate);
		System.out.println(datetobeselected);
	
		
		//sydate  
		 Date date = new Date();  
		 String s= sdf.format(date); 
		 System.out.println(s);
		 
		 //sysdate=date convert
		 Date sysdate =sdf.parse(s);
		    
		  if(datetobeselected.before(sysdate))
		  {
			  System.out.println("dates is older than current date");
			  return false;
		  }
		  
		  else
		return true;

	}

}
