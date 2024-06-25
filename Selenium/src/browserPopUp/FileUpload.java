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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.beust.jcommander.Strings;

public class FileUpload {
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//fileupload by sendkeys
//		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
//		  WebElement fileUpload=driver.findElement(By.xpath("//input[@id='fileInput']"));
//
//		  fileUpload.sendKeys("C:\\Users\\akans\\OneDrive\\Desktop\\SQL\\Himanshi automation resume.docx");
		
		
		//fileupload by robot class
		driver.get("https://demoapps.qspiders.com/ui/fileUpload/custom?sublist=1");
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		
		//select the path
		StringSelection path = new 	StringSelection("‪C:\\Users\\akans\\OneDrive\\Desktop\\report  hb1.docx");
		
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
