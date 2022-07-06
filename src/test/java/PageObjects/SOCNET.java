package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Locale;

public class SOCNET {
    private WebDriver driver;

    @FindBy(how = How.CSS, using = "div#lnk-mostra-opcoes > span.alteracao")
    private WebElement BtnAlterar;
    @FindBy(how = How.CSS, using = "button#btn-distancia-20")
    private WebElement BtnKm;
    @FindBy(how = How.CSS, using = "div#div-filtro-conveniencias div:nth-child(1) > label > span.cbx-estilizado")
    private WebElement CheckMarkWifi;
    @FindBy(how = How.CSS, using = "input#ipt-busca-credenciado-2")
    private WebElement CaixaDePesquisa;


    @FindBy(how = How.CSS, using ="#conteudo-resultados > div.estrutura-card > div > div:nth-child(1) > div > section")
    private WebElement Card;

    @FindBy(how = How.CSS, using ="div#root div.opcao-autocomplete-maps.active")
    private WebElement menu;

    @FindBy(how = How.XPATH, using = "/html/body/div/div/section[2]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[27]/a/button")
    private WebElement PrimeiroBtnSaibaMais;
    public SOCNET(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void PesquisarCredenciado (String termoDePesquisa)
    {
        termoDePesquisa = termoDePesquisa.toLowerCase();
        BtnAlterar.click();
        BtnKm.click();
        CheckMarkWifi.click();
        CaixaDePesquisa.sendKeys(termoDePesquisa);
        menu.click();
        //CaixaDePesquisa.sendKeys(Keys.ARROW_DOWN);
        //CaixaDePesquisa.sendKeys(Keys.ENTER);
        Card.click();
        PrimeiroBtnSaibaMais.click();
    }
}
