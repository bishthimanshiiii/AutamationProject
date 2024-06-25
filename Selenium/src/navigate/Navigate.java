package navigate;

import java.time.Duration;

import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(	"https://web.whatsapp.com/");
		driver.navigate().to("https://www.zomato.com/ncr");
		driver.navigate().back();
		driver.navigate().forward();
	
		driver.manage().window().setSize(new Dimension(150, 300));
		driver.manage().window().setPosition(new Point(100, 100));
	//	driver.manage().window().setSize(new Dimension(150,300));
		
		driver.close();
		
	
		
		
	}

}
