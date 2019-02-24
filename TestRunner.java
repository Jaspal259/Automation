package MercerProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		 features = "C:\\Users\\welcome\\Desktop\\New Workspace\\TestProject\\src\\MercerProject\\Mercer.feature"
		 ,glue={"MercerProject/"}
		 	

				)


public class TestRunner {

}
