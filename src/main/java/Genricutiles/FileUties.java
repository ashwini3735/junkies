package Genricutiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUties {
	
	public String readDatafrompropertefile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("");
		Properties pobj = new Properties();
		pobj.load(fis);
		String Value = pobj.getProperty(key);
		return Value;
		
	}

}
