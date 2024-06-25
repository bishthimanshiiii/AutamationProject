package browserPopUp;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//upload your resume on naukri
public class Naukri {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.xpath("(//p[@class='main-2'])[1]")).click();
		
	
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Thread.sleep(2000);
		//select the path
		StringSelection path = new 	StringSelection("file:///C:/Users/akans/OneDrive/Desktop/SQL/himanshiresume%20___u%2022.pdf");
		
		//copy the path to clipboard
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(path, null);
		Robot r = new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyPress(KeyEvent.VK_ENTER);

		


r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
