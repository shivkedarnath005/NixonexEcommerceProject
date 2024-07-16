package baseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configdataprovider 
{
	Properties pro;
	public Configdataprovider()//constructor
	{
		File src=new File("./config.properties");
		
	   try
	   {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
	   }
	   catch(Exception e)
	   {
		System.out.println("Not able to upload"+e);
	   }
	   
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	public String getUrl()
	{
		return pro.getProperty("url");
	}

}
