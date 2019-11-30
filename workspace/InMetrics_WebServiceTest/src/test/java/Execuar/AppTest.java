package Execuar;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;



@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"Definicoes"},
		features = {"./src/main/java/features/Teste.feature"}
		)

public class AppTest 
   
{
 
   
}
