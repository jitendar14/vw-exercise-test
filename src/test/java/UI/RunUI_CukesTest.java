package UI;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucumber-pretty", "json:target/cucumber.json"},
        features={"C:/Selenium/workspace/vwexcercise/src/test/resources/Retailers.feature"},
        glue={"com/UI"},
        tags={}



)



public class RunUI_CukesTest {


}
