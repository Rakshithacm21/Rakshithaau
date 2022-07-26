package Firstpro;

import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Login
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
		driver.findElement(By.linkText("Order")).click();
		
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
//		driver.findElement(By.id("inputFirstName")).sendKeys("Elsa");
//		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Olaf");
		
		List<WebElement>li=driver.findElements(By.id("inputFirstName"));
		li.get(0).sendKeys("Anna");
		li.get(1).sendKeys("Kristoff");
		driver.findElement(By.id("inputEmail")).sendKeys("AnnaKristoff21@gmail.com");
		driver.findElement(By.id("inputPassword")).sendKeys("Ankr@21");
		driver.findElement(By.id("flexRadioDefault2")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9876543210");
		driver.findElement(By.id(" address1")).sendKeys("frozen world");
		driver.findElement(By.id("address2")).sendKeys("Encanto");
		driver.findElement(By.id("inputCity")).sendKeys("Disney");
		driver.findElement(By.id("inputState")).sendKeys("Karnataka");
		driver.findElement(By.id("inputZip")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@rel='samsung']")).click();
		driver.findElement(By.xpath("//input[@rel='apple']")).click();
		WebElement dr = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/form/fieldset/div/div[3]/div/div[3]/select"));
		Select minion=new Select(dr);
		minion.selectByIndex(1);
		driver.findElement(By.xpath("//input[@placeholder='no of mobiles']")).sendKeys("1");
		WebElement dr1 = driver.findElement(By.id("bought"));
		Select tangled=new Select(dr1);
		tangled.selectByVisibleText("No");
		List<WebElement> li1=driver.findElements(By.id("gridCheck1"));
		li1.get(0).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Close")).click();
	}

}
