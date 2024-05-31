package webDriverMethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.Main;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class WebDriverMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		//writing browser name and the browser will open
/*		Scanner sc = new Scanner(System.in);
	
System.out.println("enter your browser name ");
		String browser =sc.next(); 
		
		//for writing browser name and the browser will open
		if(browser.equalsIgnoreCase("chrome"))
		{
			ChromeDriver driver = new ChromeDriver();
		} 
		
		else if(browser.equalsIgnoreCase("edge"))
		{
		EdgeDriver driver = new EdgeDriver();
		}  
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			FirefoxDriver driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser");
		}*/
		
		
	//LAUNCING THE WEB BROWSER
		
		WebDriver driver = new ChromeDriver(); //upcasting  //WebDriver is a parent class
		
		//to lauch a web application return type void
		//get(url)---void
		driver.get("https://www.myntra.com/");
		
		
		
		//manage to manage the window size ---return type Options interface
		//manage()
		driver.manage().window().maximize();
		
		
		//title to get the title of a particular page ---string
		//getTitle()--string
		String title = driver.getTitle();
		System.out.println("title of webpage is"  +title);
		
		//get current url of a page
		//getCurrentUrl()---string
		String url=driver.getCurrentUrl();
		System.out.println("url " +url);
		
		//to get source code of a page
		//getPageSouce ---string
		String page_source = driver.getPageSource();

		System.out.println("page source " +   page_source);
		
		
		//to close the parent window
		//close()--void
		driver.close();
		
		//to close the parent and child window both
		//quite()---void
		driver.quit();
		
		//navigate is used to refresh , back and forward action
		//navigate()---navigation interface
		
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(5000);//to stop the execution for 5 sec
		
		driver.navigate().back();
		Thread.sleep(5000);
		

		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//TO SWITCH  ACTIVE ELEMENT
		driver.get("https://www.google.com/");
		//driver.switchTo().activeElement().sendKeys("youtube",keys:ENTER);
		

		
		
	}
}
