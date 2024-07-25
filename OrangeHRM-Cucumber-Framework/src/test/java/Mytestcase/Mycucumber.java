package Mytestcase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\java\\fea.feature", glue= {"StepsRunning"})


public class Mycucumber {

	
	
}
