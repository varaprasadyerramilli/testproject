package Groupidisthepackagenamemain;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Baseclass {
	
	public static WebDriver driver;
	public WebDriver browserinvoking() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("E:\\USEFULL SOFTWARES\\artifactidistheprojectname\\invoking.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		System.out.println(browsername);
		if(browsername.equals("InternetExplorer"))
		{
			System.setProperty("webdriver.ie.driver","E:\\Selineum Learning Documentatin\\IEDriverServer_Win32_3.6.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		return driver;
	}
	

}
