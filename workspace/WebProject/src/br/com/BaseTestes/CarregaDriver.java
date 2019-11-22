package br.com.BaseTestes;

//CLASSE QUE ALÉM DE CARREGAR OS DRIVERS PARA AUTOMATIZAÇÃO DE TESTE
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarregaDriver {
	
	public WebDriver driver;
	public	WebElement elemento;
	
	// CARREGA OS DRIVER PARA ABRIR A PAGINA
	public CarregaDriver() {

		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.inmetrics.com.br/");
		
	}
	
	// METODO QUE RECEBE UM ELEMENTO DA PAGINA 
	public WebElement ConfereXpath(String xpath) {
	
		elemento = driver.findElement(By.xpath("//a[contains(text(),'"+xpath+"')]"));

		return elemento;
	
	}
	
	/*METODO QUE APROVEITA O ELEMENTO CARREGADO PARA FAZER O BOTAO
	 *CLICAR AUTOMATICAMENTE  
	 */
	public void AcionaBotoes(){
	
		if(elemento.isEnabled()){	
			elemento.click();
		}
		
		
		
	}
	

}
