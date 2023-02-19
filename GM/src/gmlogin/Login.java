package gmlogin;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Throwable {
	 {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://gurumavin.in/student-account");
		
			
			    File file=new File("C:\\Users\\HP\\eclipse-workspace\\GM\\LoginData.xlxs.xlsx");
			    FileInputStream fis=new FileInputStream(file);
			    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
			    XSSFSheet sheet=workbook.getSheet("Sheet1");
				int rowcount=sheet.getLastRowNum();	
				int colcount=sheet.getRow(1).getLastCellNum();
				
				
				for(int i=1;i<=rowcount;i++)
				{
					XSSFRow celldata=sheet.getRow(i);
					
					String mail=celldata.getCell(0).getStringCellValue();
					String pwd=celldata.getCell(1).getStringCellValue();
					
					
					driver.findElement(By.cssSelector("#email")).clear();
					driver.findElement(By.cssSelector("#email")).sendKeys(mail);
					
					driver.findElement(By.cssSelector("#password")).clear();
					driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
					
					Thread.sleep(3000);
					
				}
			}
		}

	}


