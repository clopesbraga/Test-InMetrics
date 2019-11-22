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

	//AP�S OS TESTES SEREM REALIZADOS � RODADO O FECHAMENTO
	@After
	public void tearDown() throws Exception {
		
		//testes.driver.close();
	
	}

	// INICIO DOS TESTES
	@Test
	public void TestExecucoes() {
		
		testes.ConfereXpath("Carreiras");
		testes.AcionaBotoes();
		
		//ENQUANTO N�O MUDAR A PAGINA A APLICA��O CONTINUARA A TENTAR O ACESSO
		while (testes.elemento.getText().equals("Carreiras")){
			
			testes.ConfereXpath("confira nossas vagas");
			
			if (testes.elemento.getText().equals("confira nossas vagas")){ 
				testes.AcionaBotoes();
				
				/* CONSEGUINDO VALIDAR O ELEMENTO DA TELA CARREIRAS
				 * SER� CAPTURADO ELEMENTO DA NOVA TELA*/
				 testes.ConfereXpath("Efetivo"); 
			}		
			
		}
		
	    // A TELA NOVA SENDO ACIONADA APARECER� TESTE REALIZADO COM SUCESSO.
		if(testes.elemento.getText().equals("Efetivo")){
			
			System.out.println("Teste realizado com sucesso");
		}
			
	
	}
		
}


