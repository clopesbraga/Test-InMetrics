package Definicoes;

import Pagina.Swapi;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DefAcesso {
	
	Swapi swapi = new Swapi();
	
	
	@Given("Estar na pagina Swapi.com.br")
	public void AcessarPagina(){
		
		try {
			swapi.CarregarPagina();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@When("Iniciar pesquisa sobre filmes")
	public void FazerPesquisa(){
		
		try {
			swapi.PesquisarLista();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Then("Mostrar Filmes produzidos por George Lucas e Rick McCallum")
	public void MostrarResultado(){
		
		swapi.Resultado();
	}
	
	
	
	
}
