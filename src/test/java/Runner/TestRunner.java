package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features/BuscarCredenciados.feature",
        glue = {"Cenarios"},
        plugin = {"json:target/cucumber.json"})

public class TestRunner {

}
