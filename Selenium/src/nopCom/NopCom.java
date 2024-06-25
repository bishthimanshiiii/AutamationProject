package nopCom;

import java.awt.Rectangle;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class NopCom {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.nopcommerce.com/sitemap");
	
	 
	
	//footer
//	WebElement foot = driver.findElement(By.xpath("//div[@class='footer']"));
////System.out.println(foot.getRect().getWidth());//width
//System.out.println(foot.getRect().getY());//y coordinate
	
//information
//	WebElement info = driver.findElement(By.xpath("//strong[text()='Information']"));
//	System.out.println(info.getRect().getX());
	
//	sitemap
//	WebElement site = driver.findElement(By.xpath("//a[text()='Sitemap']"));
//	System.out.println(site.getRect().getY());
//	
//WebElement shop = driver.findElement(By.xpath("//a[text()='Shipping & returns']"));
//
//System.out.println(shop.getRect().getWidth());
	
//	Privacy notice
//	WebElement p = driver.findElement(By.xpath("//a[text()='Privacy notice']"));
//	System.out.println(p.getRect().getY());
	
	//condition
//	WebElement c = driver.findElement(By.xpath("//a[text()='Conditions of Use']"));
//	System.out.println(c.getRect().getY());
//	
//	//about
//	System.out.println(driver.findElement(By.xpath("//a[text()='About us']")).getRect().getY());
	
//	contact 
	//System.out.println(driver.findElement(By.xpath("(//a[text()='Contact us'])[2]")).getRect().getY());
	
//	//cs
//	System.out.println(driver.findElement(By.xpath("//strong[text()='Customer service']")).getRect().getY());
	
	//search
//	System.out.println(driver.findElement(By.xpath("(//a[text()='Search'])[2]")).getRect().getY());
	
//	//news
//	System.out.println(driver.findElement(By.xpath("(//a[text()='News'])[2]")).getRect().getY());
//
	
//	//blog
//	System.out.println(driver.findElement(By.xpath("(//a[text()='Blog'])[2]")).getRect().getY());
	
//	//re
//	System.out.println(driver.findElement(By.xpath("//a[text()='Recently viewed products']")).getRect().getY());
	
	//com
//	System.out.println(driver.findElement(By.xpath("//a[text()='Compare products list']")).getRect().getY());
	
	//new
//	System.out.println(driver.findElement(By.xpath("//a[text()='New products']")).getRect().getY());
	
	//acc
//	System.out.println(driver.findElement(By.xpath("//strong[text()='My account']")).getRect().getY());
	//mya
	//System.out.println(driver.findElement(By.xpath("(//a[text()='My account'])[2]")).getRect().getY());
	
	//order
	//System.out.println(driver.findElement(By.xpath("//a[text()='Orders']")).getRect().getY());
	
	//
	//System.out.println(driver.findElement(By.xpath("//a[text()='Addresses']")).getRect().getY());
	
	//sh
	//System.out.println(driver.findElement(By.xpath("//a[text()='Shopping cart']")).getRect().getY());
	
	//w
	//System.out.println(driver.findElement(By.xpath("//a[text()='Wishlist']")).getRect().getY());
	
	//vendor
	//System.out.println(driver.findElement(By.xpath("//a[text()='Apply for vendor account']")).getRect().getY());
	
	//follow
	//System.out.println(driver.findElement(By.xpath("//strong[text()='Follow us']")).getRect().getY   ());
	
	//fb
//	System.out.println(driver.findElement(By.xpath("//a[text()='Facebook']")).getRect().getY());
	
	//x
	//System.out.println(driver.findElement(By.xpath("//a[text()='Twitter']")).getRect().getY());
	
	
	//ni
	//System.out.println(driver.findElement(By.xpath("//a[text()='RSS']")).getRect().getY());
//	System.out.println(driver.findElement(By.xpath("//a[text()='YouTube']")).getRect().getX());
	//System.out.println(driver.findElement(By.xpath("//strong[text()='Information']")).getRect().getY());
	
	//new
	//System.out.println(driver.findElement(By.xpath("//strong[text()='Newsletter']")).getRect().getY());
	
	//se
	//System.out.println(driver.findElement(By.xpath("//input[@id='newsletter-email']")).getRect().getY());
	//driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("qqq");
	
	//susc
	//System.out.println(driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']")).getRect().getY());
	
//	copy logo
	//System.out.println(driver.findElement(By.xpath("//span[@class='footer-disclaimer']")).getRect().getY());
	
//	logo
	//System.out.println(driver.findElement(By.xpath("//div[@class='footer-powered-by']")).getRect().getY());
	
	//logo link
	
	//System.out.println(driver.findElement(By.xpath("//a[text()='nopCommerce']")).getRect().getY());
	
WebElement h = driver.findElement(By.xpath("//strong[text()='Information']"));
//h.getRect();
System.out.println(h.getRect().getX());
System.out.println(h.getRect().getY());
driver.close();
	
}

}
