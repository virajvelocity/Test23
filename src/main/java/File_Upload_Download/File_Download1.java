package File_Upload_Download;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Download1 
{
	public static void main(String[] args)
	{
		 ChromeOptions CO=new ChromeOptions();
		 CO.addArguments("--remote-allow-Origins=*", "ignore-certificate-errors");
	 
		String S1=System.getProperty("user.dir")+"\\All_Downloads\\";
		 
		 //This is my default Folder/Directory where we have to store our file
		  HashMap mp=new HashMap();
		  mp.put("download.default_directory", S1);
		
		  //Set Chrome Browser setting
		  CO.setExperimentalOption("prefs", mp);
		  
		  WebDriver driver=new ChromeDriver(CO);  
		
		//To enter URL/Open an Application
		 driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
			
		 driver.manage().window().maximize();
		 	
		 //Wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 		 
		//Click on Zip file
		driver.findElement(By.xpath("//*[text()='chromedriver_win32.zip']")).click();
		
	}
	
	
	
}
