package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Demo2class {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions start=new ChromeOptions();
		start.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(start);
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("rajavel123");
		driver.findElement(By.id("password")).sendKeys("297O8G");
		driver.findElement(By.id("login")).click();
		Thread.sleep(1000);
		 
		WebElement w1=driver.findElement(By.id("location"));
		 Select location=new Select(w1);
		 location.selectByVisibleText("London");
		 Thread.sleep(1000);
		 
		 WebElement w2=driver.findElement(By.cssSelector("#hotels"));
		 Select hotel= new Select(w2);
		 hotel.selectByVisibleText("Hotel Sunshine");
		 Thread.sleep(1000);
		  
		 WebElement w3=driver.findElement(By.xpath("//select[@id='room_type']"));
		 Select type =new Select(w3);
		 type.selectByVisibleText("Super Deluxe");
		 Thread.sleep(1000);
		 
		 WebElement w4=driver.findElement(By.xpath("//select[@id='room_nos']"));
		 Select rooms=new Select(w4);
		 rooms.selectByVisibleText("6 - Six");
		 Thread.sleep(1000);
		 
		 WebElement w5=driver.findElement(By.cssSelector("#datepick_in"));
		 w5.clear();
		 w5.sendKeys("04/07/2023");
		 Thread.sleep(1000);
		 
		 WebElement w6=driver.findElement(By.cssSelector("#datepick_out"));
		 w6.clear();
		 w6.sendKeys("14/07/2023");
		 Thread.sleep(1000);
		 
		 WebElement w7=driver.findElement(By.xpath("//select[@id='adult_room']"));
		 Select adult=new Select(w7);
		 adult.selectByValue("4");
		 Thread.sleep(1000);
		 
		 WebElement w8=driver.findElement(By.xpath("//select[@id='child_room']"));
		 Select children=new Select(w8);
		 children.selectByValue("4");
		 
		 
		 driver.findElement(By.cssSelector("#Submit")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.cssSelector("#radiobutton_0")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.cssSelector("a[href='http://adactinhotelapp.com/ForgotPassword.php']")).click();
		driver.findElement(By.id("emailadd_recovery")).sendKeys("rajavelk89@gmail.com");
		driver.findElement(By.cssSelector("#Submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Click here to login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='New User Register Here']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rajavelk94");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rajavelk94@");
		driver.findElement(By.id("re_password")).sendKeys("rajavelk94@");
		driver.findElement(By.id("full_name")).sendKeys("rajavel");
		driver.findElement(By.id("email_add")).sendKeys("rajavelk94@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.name("captcha")).sendKeys("           ");
		driver.findElement(By.id("tnc_box")).click();
		driver.findElement(By.className("reg_button")).click();*/
		
		
		
		
		
		
		
	
	
	}		

}
