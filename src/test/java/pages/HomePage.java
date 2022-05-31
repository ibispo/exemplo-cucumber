package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

	final String CAMPO_DE_BUSCA = "//input[@id='twotabsearchtextbox']";

	WebDriver driver;

	public HomePage(WebDriver drv) {
		this.driver = drv;
	}

	public void realizarBusca(String textoBusca) {
		driver.findElement(By.xpath(CAMPO_DE_BUSCA)).sendKeys(textoBusca);
		driver.findElement(By.xpath(CAMPO_DE_BUSCA)).sendKeys(Keys.ENTER);
	}

}
