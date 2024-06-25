package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		Actions act = new Actions(driver);
//		WebElement cirle=driver.findElement(By.id("circle"));
//		//click and hold
//		act.clickAndHold(cirle).perform();
//		//to relese
//		Thread.sleep(2000);
//		act.release().perform();
		
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		Actions act = new Actions(driver);
		//drag and drop
		//find the element we want to drag
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		//find the place where you want to drop
		WebElement dropp = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		//drag and drop
		act.dragAndDrop(drag, dropp).perform();
	}

}
