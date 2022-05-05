package Run;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//runing a particular class
@RunWith(Cucumber.class)
//file path
@CucumberOptions(features= {"src\\test\\resources\\Indoor\\Indoor.feature"},glue= {"DefinitionSkillary"},dryRun = false )
//i wan
public class TestRun {

}
