package cucumber.numberconverter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "cucumber.numberconverter"
)
public class CucumberRunnerTest {
}