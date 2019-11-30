package Config;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public WebDriver driver;
	public	WebElement elemento;
	private String texto;

	
	
	public void AbreNavegador() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.inmetrics.com.br/");
			
	}
	
	public WebElement ConfereXpath(String xpath) {
		
        elemento = driver.findElement(By.xpath("//a[contains(text(),'"+xpath+"')]"));

		return elemento;
	
	}
	
	public void AcionaBotoes(){
		
	 if(elemento.isEnabled()){elemento.click();}
		
	}

}
