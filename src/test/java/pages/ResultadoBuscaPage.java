package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoBuscaPage {

	/*

	  // identify element with text()
      WebElement l=driver.findElement(By.xpath("//*[text()='Library']"));
      System.out.println("Element with text(): " + l.getText());
      
      // identify element with contains()
      WebElement m=driver.findElement(By.xpath("//*[contains(text(),'GATE')]"));
      System.out.println("Element with contains(): " + m.getText());

	 */
	
	
	final String PRODUTO_DA_BUSCA = "//span[contains(text(),'Apple iPhone 12 (128')]";
	final String PRECO_PRODUTO = "//span[@class='a-price-whole']";

	WebDriver driver;

	public ResultadoBuscaPage(WebDriver drv) {
		this.driver = drv;
	}

	public void clicarProduto() {
		driver.findElement(By.xpath(PRODUTO_DA_BUSCA)).click();
	}

	public String retornarValorProduto() {
		return driver.findElement(By.xpath(PRECO_PRODUTO)).getText();
	}

}
