package Pagina;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.BaseTest;

public class InMetrics extends BaseTest{
	
	int ms=10000; 
	
	public void CarregarPagina(){
		
		AbreNavegador();
		
	}
	
    public WebElement VerificaElemento (String elemento){
		
    	Thread b = new Thread();
   	 
   	    synchronized(b){
   		 
   		 try {;
   		 
   		 	ConfereAcesso(elemento);
   		    b.wait(ms);
   		 
   		 } catch (Exception e) {}
   		 
   	 }
		return ConfereAcesso(elemento);
	}

    
    public void Clicar(){
    	
    	 
    	 AcionaBotoes();
			
    	
    }
    
    public String MensagemFinal(){
    	
    	Thread b = new Thread();
      	 
   	    synchronized(b){
   		 
   		 try {;
   		 
   		 	MensagemFinalTeste();
   		    b.wait(ms);
   		 
   		 } catch (Exception e) {}
   		 
   	   }
   	    return MensagemFinalTeste();
   }
    		
}