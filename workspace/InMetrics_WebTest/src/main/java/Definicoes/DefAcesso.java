package Definicoes;

import java.lang.annotation.Target;
import java.text.ParseException;

import javax.swing.text.html.HTMLEditorKit.ParserCallback;

import io.cucumber.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pagina.InMetrics;

public class DefAcesso {
	
	InMetrics inmetrics = new InMetrics();
	
	
	
	@Given("Estar na pagina  InMetrics")
	public void AbrirPagina(){
		
		inmetrics.AbreNavegador();	
		
	}
	
	@When("Clicar na opcao de Carreiras")
	public void VerificaPagina(){
		
	   inmetrics.VerificaElemento("Carreiras");
	   inmetrics.Clicar();
	}
	
	@Then("Acionar o botão confira nossas vagas")
	public void PressionaBotao(){
	
		inmetrics.VerificaElemento("confira nossas vagas");
		inmetrics.Clicar();
		
	}
	
	

	

	
	
	
}
