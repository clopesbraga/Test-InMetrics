package br.com.BaseTestes;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarregaDriver {
	
	public WebDriver driver;
	public	WebElement elemento;
	
	public CarregaDriver() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDrivers\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.inmetrics.com.br/");
		
	}
	
	public WebElement ConfereXpath(String xpath) {
		
		//elemento = testes.driver.findElement(By.xpath("//a[contains(text(),'confira nossas vagas')]"));
		elemento = driver.findElement(By.xpath("//a[contains(text(),'"+xpath+"')]"));
		
	

		return elemento;
	
	}
	

}
