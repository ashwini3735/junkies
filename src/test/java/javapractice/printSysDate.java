package javapractice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class printSysDate {
	
	@Test
	public void sysData()
	{
		  Date currentdate = new Date();
		  SimpleDateFormat dateformate = new SimpleDateFormat("dd-mm-yyy");
		  String date = dateformate.format(currentdate);
		  System.out.println(date);
	}

}
