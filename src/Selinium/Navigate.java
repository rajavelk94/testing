package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate {
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
		
		
		driver.get("https://www.snapdeal.com/");
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();

}
}