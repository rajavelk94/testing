package Selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Checkboxselect {

	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#female")).click();
		//driver.findElement(By.cssSelector("#male")).click();
		
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		driver.findElement(By.xpath("//input[@id='tuesday']")).click();
		driver.findElement(By.xpath("//input[@id='wednesday']")).click();
		driver.findElement(By.xpath("//input[@id='thursday']")).click();
		
		
         List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox'and contains(@id,'day')]" ));
 
       System.out.println(checkbox.size());
}
}