package Firstpro;


import java.util.Iterator;
import java.util.Set;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Contactus 
{
	@Test
	public void Logintro() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rakshitha.cm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		driver.findElement(By.id("username")).sendKeys("AnnaKristoff");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ankr@21");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//a[@onclick='openPopup()']")).click();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Annakristoff");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("AnnaKristoff21@gmail.com");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("Need a query regarding orders");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		driver.manage().window().maximize();
		driver.quit();
	}

}
