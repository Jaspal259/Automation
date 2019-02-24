package stepDefinition;

import java.io.*;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.cucumber.listener.Reporter;




//



@RunWith(Cucumber.class)
@CucumberOptions(
		
		 features = "C:/Users/welcome/Desktop/New Workspace/TestProject/src/stepDefinition"
		 ,glue={"stepDefinition"},
				 plugin = {"pretty"}
		 		
		 //plugin = { "pretty:C:/Users/welcome/Desktop/New Workspace/TestProject/src/report.html"}
		
				
				//com.cucumber.listener.ExtentCucumberFormatter

				)

public class Runner {

	/*
	@AfterClass
	public static void writeExtentReport() {

//		ConfigFileReader o = new ConfigFileReader();
		//System.out.println(	o.getReportConfigPath() );
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

		
		Reporter.loadXMLConfig(new File(o.getReportConfigPath()));
	
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
	*/
	
	
}
