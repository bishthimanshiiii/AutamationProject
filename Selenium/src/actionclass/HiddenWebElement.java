package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenWebElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/r.php");
	//find the disabled element
	 WebElement hiddenElement = driver.findElement(By.xpath("//input[@id='u_0_4_5m']"));
	
	Thread.sleep(2000);
	
	//object of java executor class
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('name').value='Himanshi Bisht'");
	}

}
