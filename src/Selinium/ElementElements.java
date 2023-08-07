package Selinium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementElements {
	          
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
		 
		
		//implict waIt
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demo.nopcommerce.com/");
		WebElement ele=driver.findElement(By.cssSelector("#small-searchterms"));
		ele.sendKeys("iphone");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		WebElement ets=driver.findElement(By.xpath("/html/body/div[6]/div[4]"));
        System.out.println(ets.getText());
        
        List<WebElement>elem=driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]"));
         System.out.println(elem.size());
         
         
         List<WebElement>elem1=driver.findElements(By.xpath("//div[@class='footer']//a"));
	System.out.println(elem1.size());
	
 
			
	
	
	
	}
}