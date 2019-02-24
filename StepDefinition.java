package stepDefinition;

import org.apache.log4j.BasicConfigurator;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import freemarker.log.Logger;

public class StepDefinition {

	public static WebDriver driver;
	HtmlReporter reporter = null;
	//HtmlReporter reporter = null;
	public final static Logger logger = null;
	//reporter.BeginScenario("Lanunch Browser", "Cucumber Regression");


	@Given("^Open browser$")
	public void open_url() throws Throwable {
		try {
			reporter = HtmlReporter.getInstance();
			//reporter = HtmlReporter.getInstance();

			reporter.BeginScenario("Lanunch Browser", "Cucumber Regression");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\welcome\\Desktop\\Cucu\\chromedriver.exe");

			driver = new ChromeDriver();

			reporter.ReportStep("Step1", "Open Browser","", true, true);
		} catch (Exception e) {
			
			reporter.ReportStep("Step1", "Open Browser",e.toString(), false, true);

		}
	}

	@When("^Enter any data$")
	public void user_enter_in_search_engine() throws Throwable {
		try {
			driver.get("http://demo.guru99.com/v4/index.php");
			driver.findElement(By.id("uid")).sendKeys("hello");
			driver.findElement(By.id("password")).sendKeys("hello");

			//String title  = driver.getTitle();
			//if(title.contains("cannot"))
			//{
				
				//Exception ex =new Exception("Required page is not available");
				//throw ex;
			//}
		
			
		//	int a,b,c;
		//	a =44;
		//	b = 0;
			//c =a/b;
			
			reporter.ReportStep("Step2", "enter data","", true, true);
		} catch (Exception e) {
			reporter.ReportStep("Step2", "enter data",e.toString().split("}")[0]+"}", false, true);

		}
	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {

		reporter.ReportStep("Step3", "close browser","", true, true);

		System.out.println("close");
		driver.quit();

	}

}
