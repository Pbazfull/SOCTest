package Cenarios;

import PageObjects.BlogDeSST;
import PageObjects.Perfil;
import PageObjects.RedeCredenciadaSOCNET;
import PageObjects.SOCNET;
import Setup.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Cenario01 {

    private WebDriver driver;
    private String termoDePesquisa = "Guarujá";
    private String url = "https://ww2.soc.com.br/blog/";
    @Before
    @org.junit.Before
    public void CriarDriver() {
        Driver wdriver = new Driver();
        driver = wdriver.WB(url);
    }

    @Test
    @Dado("que eu estou na pagina certa")
    public void que_eu_estou_na_pagina_certa() {


        BlogDeSST page1 = new BlogDeSST(driver);
        page1.IrParaRedeCredenciadaSOCNET();

        RedeCredenciadaSOCNET page2 = new RedeCredenciadaSOCNET(driver);
        page2.IrParaSOCNET();
    }


    @Test
    @Quando("eu pesquisar por um termo e usar o filtros")
    public void eu_pesquisar_por_um_termo_e_usar_o_filtros() {

        SOCNET page3 = new SOCNET(driver);
        page3.PesquisarCredenciado(termoDePesquisa);
    }

    @Entao("eu entro no perfil do credenciado")
    public void eu_entro_no_perfil_do_credenciado() {
        Perfil page4 = new Perfil(driver);
        try {
            page4.TakeScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @After
    public void FecharDriver()
    {
        driver.close();
        driver.quit();
    }

}
