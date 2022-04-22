package testePratico3.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/testePratico3/features/"
        ,glue = {"testePratico3"}
        ,plugin = {"intern.Plugin"}
        , tags = {"@Cenario1"}
)
public class Runner {
}
