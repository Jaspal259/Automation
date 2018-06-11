import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest
{

  @Test()
  public void test()
  {
	WebDriver driver =new FirefoxDriver();
	driver.get("http://crystal.tekmindz.com/mohips/#/dashboard/searchEmp");
	driver.findElement(By.xpath("//*[@id=\"submit\"]/i")).click(); 
	driver.findElement(By.xpath("/html/body/app-dashboard/div/main/div/app-search-employee/div/div/div/div/div/div[1]/div/div/div/div/input")).sendKeys("269020501000"); 

	
	
 System.out.println("Testing test");
  }

}
