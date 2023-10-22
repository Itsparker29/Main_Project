
public class LinkedIn {

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedIn_Login 
{
	WebDriver driver;

	@BeforeTest
	public void LaunchLinkedIn()throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	
	driver.get("https://www.linkedin.com/home");
	
	driver.manage().window().maximize();
	
	Thread.sleep(6000);
	
	driver.navigate().refresh();
		
	}
	@Test(priority=1)
	 public void Login()
	
	{
		driver.findElement(By.id("session_key")).sendKeys("naveencivil0706@gmail.com");
		
		driver.findElement(By.name("session_password")).sendKeys("#Itsparker29");
		
		WebElement SigninButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		SigninButton.click();
	}
	@Test(priority=2)
	
	public void MyNetwork()
	{
		driver.get("https://www.linkedin.com/mynetwork/");
		
		WebElement MyNetwork = driver.findElement(By.xpath("//*[@id=\"ember600\"]/div/div[1]/svg"));
		
		MyNetwork.click();
		
}
	@AfterTest
	public void teardown()
	{
		driver.close();	
	}
}
