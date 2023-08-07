package Selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explictwait {

	public static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions start = new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(start);

		WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/mobile-phones-store");
		WebElement s1 = driver.findElement(By.xpath("//a[normalize-space()='Offer Zone']"));
		s1.click();

		WebElement fire = Wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='t-shirts']")));
		fire.click();

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div")).click();

		WebElement fire1 = Wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/ul/li[5]/div")));

		fire1.click();

	}
}