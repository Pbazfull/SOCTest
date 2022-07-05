package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class RedeCredenciadaSOCNET {
    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/section[1]/div/div/div/div/div/section/div/div/div/div/div/div[4]/div/div/a")
    private WebElement BtnBuscarCredenciados;

    public RedeCredenciadaSOCNET(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void IrParaSOCNET()
    {
        BtnBuscarCredenciados.click();
    }
}
