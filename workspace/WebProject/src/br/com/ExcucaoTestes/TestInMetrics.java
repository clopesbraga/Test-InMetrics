package br.com.ExcucaoTestes;


import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.BaseTestes.CarregaDriver;

public class TestInMetrics{
	
	CarregaDriver testes;
	
	//INICIA A PAGINA PELO ACIONAMENTO DO DRIVER
	@Before
	public void setUp() throws Exception {
		
		testes = new CarregaDriver();
		
	}

	//APÓS OS TESTES SEREM REALIZADOS É RODADO O FECHAMENTO
	@After
	public void tearDown() throws Exception {
		
		//testes.driver.close();
	
	}

	// INICIO DOS TESTES
	@Test
	public void TestExecucoes() {
		
		testes.ConfereXpath("Carreiras");
		testes.AcionaBotoes();
		
		//ENQUANTO NÃO MUDAR A PAGINA A APLICAÇÃO CONTINUARA A TENTAR O ACESSO
		while (testes.elemento.getText().equals("Carreiras")){
			
			testes.ConfereXpath("confira nossas vagas");
			
			if (testes.elemento.getText().equals("confira nossas vagas")){ 
				testes.AcionaBotoes();
				
				/* CONSEGUINDO VALIDAR O ELEMENTO DA TELA CARREIRAS
				 * SERÁ CAPTURADO ELEMENTO DA NOVA TELA*/
				 testes.ConfereXpath("Efetivo"); 
			}		
			
		}
		
	    // A TELA NOVA SENDO ACIONADA APARECERÁ TESTE REALIZADO COM SUCESSO.
		if(testes.elemento.getText().equals("Efetivo")){
			
			System.out.println("Teste realizado com sucesso");
		}
			
	
	}
		
}


