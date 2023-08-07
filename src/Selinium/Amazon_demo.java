package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon_demo {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));

}
}