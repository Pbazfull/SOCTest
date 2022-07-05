import PageObjects.BlogDeSST;
import PageObjects.Perfil;
import PageObjects.RedeCredenciadaSOCNET;
import PageObjects.SOCNET;
import Setup.Driver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Cenario01 {

    private WebDriver driver;
    private String termoDePesquisa = "Guarujá";
    @Before
    public void CriarDriver()
    {
        Driver wdriver = new Driver();
        driver = wdriver.WB();
    }

    @Test
    public void IrAtePageSOCNET()
    {
        BlogDeSST page1 = new BlogDeSST(driver);


        page1.IrParaRedeCredenciadaSOCNET();
        RedeCredenciadaSOCNET page2 = new RedeCredenciadaSOCNET(driver);
        page2.IrParaSOCNET();
        SOCNET page3 = new SOCNET(driver);
        page3.PesquisarCredenciado(termoDePesquisa);
        Perfil page4 = new Perfil(driver);
        try {
            page4.TakeScreenshot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*@After
    public void FecharDriver()
    {
        driver.close();
        driver.quit();
    }*/

}
