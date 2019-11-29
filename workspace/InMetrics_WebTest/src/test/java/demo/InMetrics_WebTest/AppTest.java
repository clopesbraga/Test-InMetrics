package demo.InMetrics_WebTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"Definicoes"},
		features = {"./src/test/java/features/Test.feature"}
		)

public class AppTest {}
