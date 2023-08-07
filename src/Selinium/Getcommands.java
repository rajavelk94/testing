package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getcommands {
	public static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions get=new ChromeOptions();
		get.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(get);
		
		driver.get("https://adactinhotelapp.com/");
		System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
}
}