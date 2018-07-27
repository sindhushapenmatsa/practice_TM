package package1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class String_Buffer {

	public static void main(String[] args) {
		
		
		String s = "sindhu@gmail.com";
	
		StringBuffer SB = new StringBuffer(s);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmSS");

		StringBuffer s_new =SB.insert(s.indexOf("@"),sdf.format(new Date()) );
		System.out.println(s_new);

	}

}
