import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty","html:target/reports/htmlReport","json:target/reports/jsonReport","junit:target/reports/junitReport"})
public class TestRunner {
}
