package Executar;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue= {"Definicoes"},
		features = {"./src/main/java/features/Test.feature"}
		)

public class App 
{
 
}
