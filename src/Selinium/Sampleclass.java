package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sampleclass {
	public static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions start = new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(start);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jhjhhxcjgbj");
		driver.findElement(By.id("pass")).sendKeys("@ru12234");
		driver.findElement(By.name("login")).click();

	}

}
