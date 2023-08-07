package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conditional {
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Flogin");
		WebElement condition=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		System.out.println("  is displayed  " +  condition.isDisplayed());
		System.out.println("  is displayed aree  " +  condition.isEnabled());
		
		WebElement male =driver.findElement(By.xpath("//input[@id='gender-male']"));
		System.out.println(male.isSelected());
		male.click();
		

		WebElement female =driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(female.isSelected());
		
		
		
		System.out.println(male.isSelected());
	
		
		
		
		
		
		
		
		
		
				

}
}