package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gettextattribute {
                 
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
				 
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement clear= driver.findElement(By.cssSelector("#Email"));
		System.out.println(clear.getAttribute("value"));
	
		clear.clear();
		clear.sendKeys("rajavelk9@gmail.com");
		  
		WebElement clear1=driver.findElement(By.cssSelector("#Password"));
		clear1.clear();
		clear1.sendKeys("0909");
		
		System.out.println(clear.getAttribute("value"));
		
		
		
}
}