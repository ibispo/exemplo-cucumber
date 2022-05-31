package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.ResultadoBuscaPage;

public class StepsAmazon {
	WebDriver driver;

	@Before
	public void before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@After
	public void after() {
		driver.quit();
	}

	@Dado("que esteja na pagina: {string}")
	public void que_esteja_na_pagina(String url) {
		driver.get(url);
	}

	@Quando("fizer a busca pelo produto {string}")
	public void fizer_a_busca_pelo_produto(String descProduto) {
		HomePage hm = new HomePage(driver);
		hm.realizarBusca(descProduto);
	}

	@Entao("vou verificar se o valor esta acima de {string}")
	public void vou_verificar_se_o_valor_esta_acima_de(String vlrProd) {
		ResultadoBuscaPage res = new ResultadoBuscaPage(driver);
		res.clicarProduto();

		Assert.assertEquals(vlrProd, res.retornarValorProduto());
	}

}
