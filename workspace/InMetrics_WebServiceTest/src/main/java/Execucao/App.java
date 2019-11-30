package Execucao;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"Definicoes"},
		features = {"./src/test/java/Features/teste.feature"}
		)

public class App 
{
	
	

}
