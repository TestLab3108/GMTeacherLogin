package gmlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class newaccountinstitute {
	
WebDriver driver;
	
	@Test
	@Parameters({"url","name","institutionname","email","contactperson","phonenumber","pwd","cpwd"})
	public void accountstudent(String url,String name,String institutionname,String email,String contactperson,String phonenumber,String pwd,String cpwd) throws Throwable{
	String Key="webdriver.chrome.driver";
	String Value="./chromedriver.exe";
	System.setProperty(Key, Value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get(url);
	
	Thread.sleep(3000);
	
	//Click on Sign in Link:
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button")).click();
	
	//Click on " I am a Institute"
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[4]/div/button/div/div")).click();
	
	//click on Register:
	driver.findElement(By.id("simple-tab-1")).click();
	
	Thread.sleep(2000);

		
	driver.findElement(By.id("name")).sendKeys(name,Keys.TAB,institutionname,Keys.TAB,email,Keys.TAB,contactperson,Keys.TAB,phonenumber,Keys.TAB,pwd,Keys.TAB,cpwd,Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.ENTER);
			
	
	}	

}
