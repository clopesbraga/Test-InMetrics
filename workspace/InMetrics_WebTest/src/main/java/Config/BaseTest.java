package Config;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTest {
	
	public WebDriver driver;
	public	WebElement elemento;
	public String texto;
	
	
	 
	
	public void AbreNavegador() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.inmetrics.com.br/");
		
	}
	
	public WebElement ConfereAcesso(String xpath) {
		
		elemento = driver.findElement(By.xpath("//a[contains(text(),'"+xpath+"')]"));
			
		return elemento;
	
	}
		
	
	public void AcionaBotoes(){
		
		
	 if(elemento.isEnabled()){
		 
		 elemento.click();
		 
	 }
		
	}
	
	public String MensagemFinalTeste(){
		
		String resposta;
	
		resposta="Teste Realizado com sucesso";
		return resposta;
		
	}

}
