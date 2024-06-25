package dowpdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown");
		WebElement dropdown=driver.findElement(By.id("select3"));
		
		//select class
		
		//Select s = new Select(dropdown);
		//s.selectByIndex(1);
		
		//select by value
		
		//s.selectByValue("United Kingdom");
		
		//script to select all
		Select s = new Select(dropdown);
		System.out.println(s.isMultiple());
		
		System.out.println(s.getWrappedElement().getText());
		
//		List<WebElement> option = s.getOptions();// it will give all the option present in a dropdown
//		for(WebElement allo:option)
//		{
//			System.out.println(allo.getText());
//		}
//		
		
		
//for(int i =0; i<8;i++)
//{
//	s.selectByIndex(i);
//	Thread.sleep(2000);
//}
//List<WebElement> all = s.getAllSelectedOptions();//all selected
//for(WebElement allopt:all)
//{
//System.out.println(allopt.getText());
//}
//System.out.println(s.getFirstSelectedOption().getText());

//delectall is only used in multi select dropdown
//for(int i= 0; i<7;i++)
//{
//s.deselectByIndex(i);
//Thread.sleep(2000);
//}


	}

}
