package baseLayer;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Util 
{
	public static void capture(WebDriver dr, String filename) throws IOException
	{
		File ts=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ts, new File("./images/"+filename+""));
	}

}
