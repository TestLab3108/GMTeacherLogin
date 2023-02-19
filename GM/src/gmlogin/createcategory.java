package gmlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class createcategory {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","username","pwd","title"})
	public void category(String url,String username,String pwd,String title) throws Throwable {
		
		String Key="webdriver.chrome.driver";
		String Value="./chromedriver.exe";
		System.setProperty(Key, Value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(url);
		
		//driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		
	    Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/main/div/form/button")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@aria-label='open drawer']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul[1]/li[5]/div/div[2]/span")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")).click();
		
		//Create a new Categry:
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/button")).click();
		
		Thread.sleep(3000);
		
		//Enter a Title of the Caregory:
		driver.findElement(By.id("title")).sendKeys(title);
		
		//click on Add category:
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[1]/form/button")).click();
		
		Thread.sleep(4000);
		
		//Click on close Button:
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button")).click();
		
		Thread.sleep(5000);
		
		//click on Row Number
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[5]/div/div[2]")).click();
		
		Thread.sleep(4000);
		
		//click on row no 25:
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[3]")).click();
		
		Thread.sleep(5000);
		
		
		//click on option:
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[4]/table/tbody/tr[15]/td[4]/ul/div")).click();
		
		Thread.sleep(4000);
		
		//Click on publish:
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[4]/table/tbody/tr[15]/td[4]/ul/div[2]/div/div/div[2]/div/div/span")).click();
		
		Thread.sleep(4000);
		
		//Again click On option.
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[4]/table/tbody/tr[15]/td[4]/ul/div[1]")).click();
		
		Thread.sleep(3000);
		
		//Click on Home Page:
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[1]/a")).click();
;		
	}
	
	
	
	

}
