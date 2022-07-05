package PageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Perfil {
    private WebDriver driver;

    public void TakeScreenshot() throws IOException
    {
        Date currentDate = new Date();
        String screenshootname = currentDate.toString().replace(" ","-").replace(":","-");
        TakesScreenshot scrShot = ((TakesScreenshot)driver);
        File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScrFile, new File("src//main//resources//Screenshots//"+screenshootname+".png"));
    }

    public Perfil(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
