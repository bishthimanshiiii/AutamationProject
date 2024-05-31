package actionclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {
	public static void main(String[] args) throws AWTException, InterruptedException   {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		
		
		//action class
		Actions act = new Actions(driver);
		
		WebElement mouseHover =driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
		//use the methods
		//PAYTM
		act.moveToElement(mouseHover).perform();
		
		//next paytm option
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Payments']"))).perform();
		
		//to perforn next action
		act.click(driver.findElement(By.xpath("//a[text()='Bill Payment & Recharges']"))).perform();
		
		WebElement right = driver.findElement(By.xpath("//a[text()='Paytm For Business']"));
		
		act.contextClick(right).perform();
		
		
		//robot class object
		
		Robot r = new Robot();
		
		for(int i=1;i<12;i++)
		{
			//act.click(right).sendKeys(Keys.ARROW_DOWN).perform();
			r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
			r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
		 
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
     
		
		
	}

}
