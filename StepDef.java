package MercerProject;

import org.openqa.selenium.By;
import static org.junit.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import stepDefinition.HtmlReporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

public static	WebDriver driver = null;
	HtmlReporter reporter = null;

	@Given("^Open Url in browser$")
	public void open_Url_in_browser() throws Throwable {
		try {

			reporter = HtmlReporter.getInstance();
			reporter.BeginScenario("Login Feature", "Wordpress Application");

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\welcome\\Desktop\\Cucu\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
			reporter.ReportStep("STEP 1", "Open Url in browser", "", true,true);
		} catch (Exception e) {

			reporter.ReportStep("STEP 1", "Open Url in browser", e.toString(), false,true);
			driver.quit();

		}
	}

	@When("^Enter login username and password$")
	public void enter_login_username_and_password() throws Throwable {
		
		String msg="";
		boolean ispass= true;
		
		try {
			driver.findElement(By.id("user_login")).sendKeys("opensourcecms");
		} catch (Exception e) {
			msg = e.toString();
			ispass=false;
			
		}
		try {
			System.out.println("Hiiiiiii");
			driver.findElement(By.id("user_pass")).sendKeys("opensourcecms");
			System.out.println("hiiiiii again");
			
			//reporter.ReportStep("STEP 2", "Enter Username and password", "", true,true);
			

			
		} catch (Exception e) {
			
			driver.quit();
			ispass=false;

			//reporter.ReportStep("STEP 2", "Enter Username and password", e.toString(), false,true);

		}
		
		reporter.ReportStep("STEP 2", "Enter Username and password", msg, ispass,true);

	}

	@Then("^Click button$")
	public void click_button() throws Throwable {
		try {
			driver.findElement(By.id("wp-submit1")).click();
			reporter.ReportStep("STEP 3", "Click Button", "", true,true);

		} catch (Exception e) {

			reporter.ReportStep("STEP 3", "Click button", e.toString().split("}")[0]+"}", false,true);
			closeBrowser();

			fail(e.toString());




		}

		
	}
	public static void closeBrowser() throws Exception{
	    
	    driver.quit();
	}
}
