package Firstpro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Signup
{
	@Test
	public void Intro() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rakshitha.cm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://mobileworld.azurewebsites.net/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.id("myName")).sendKeys("Anna");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kristoff");
		driver.findElement(By.xpath("//input[@type='Email']")).sendKeys("AnnaKristoff21@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Ankr@21");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("14-07-2022");
		driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div[4]/input")).click();
		driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("its a automation script");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
		driver.switchTo().alert().accept();
		driver.quit();
		
		
	}

}
