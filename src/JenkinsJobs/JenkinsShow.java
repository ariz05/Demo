package JenkinsJobs;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class JenkinsShow {

	public static WebDriver driver;
 
	 @Test
  
		public static void demo() 
			{
	  
			String exePath = "C:\\Users\\arizr\\Desktop\\DriversandJars\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
				
			System.out.print("Welcome to Selenium World!!");

		    driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
			driver.get("https://www.homeshop18.com/");
	  
	  
  
			}

@Test
  public static void demo2() {
			String exePath = "C:\\Users\\arizr\\Desktop\\DriversandJars\\chromedriver.exe";

			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			System.out.print("Welcome to Selenium World!!");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.homeshop18.com/");
			Assert.assertTrue(driver.getTitle().contains("Largest"));
	  
	  
  }

@AfterMethod
public void EndTest()
{
	driver.quit();
}
}



