package gmlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class newaccountstudent {
	
	
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","name","login","number","pwd","cpwd"})
	public void accountstudent(String url,String name,String login,String number,String pwd,String cpwd) throws Throwable{
	String Key="webdriver.chrome.driver";
	String Value="./chromedriver.exe";
	System.setProperty(Key, Value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	driver.get(url);
	
	Thread.sleep(3000);
	
	//Click on Sign in Link:
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div[1]/div[3]/button")).click();
	
	//Click on " I am a Student"
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/button/div/div")).click();
	
	//click on Register:
	driver.findElement(By.id("simple-tab-1")).click();
	
	Thread.sleep(2000);

		
	driver.findElement(By.id("name")).sendKeys(name,Keys.TAB,login,Keys.TAB,number,Keys.TAB,pwd,Keys.TAB,cpwd,Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.ENTER);
	
	}

}
