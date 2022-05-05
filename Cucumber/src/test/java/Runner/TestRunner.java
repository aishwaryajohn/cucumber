package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//From here we are executing the cucumber class(Login.feature)file


@RunWith(Cucumber.class) //run with is used when we want to specifically run a file
//here we are giving the source of cucumber class/file ie "src/test/resources/Login/Login.feature"
//glue = {"Definition"})--> we are running the definition package.
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"}, glue = {"Definition"})

public class TestRunner {

}
