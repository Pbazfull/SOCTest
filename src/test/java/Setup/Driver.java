package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Driver {
    public WebDriver WB(String url)
    {
        System.setProperty("webdriver.edge.driver", "src/test/java/Resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        return driver;
    }
}
