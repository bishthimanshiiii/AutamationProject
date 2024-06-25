package browserPopUp;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification {
public static void main(String[] args) {
	
	//FOR DISABLED THE NOTIFICATION
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");//this will disable the notification	
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.yatra.com/");
//Robot r = new Robot();
//r.keyPress(KeyEvent.VK_TAB);
//r.keyPress(KeyEvent.VK_ENTER);
//r.keyRelease(KeyEvent.VK_TAB);
//r.keyRelease(KeyEvent.VK_ENTER);	



}
}
