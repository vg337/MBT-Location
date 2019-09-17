package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * Classe qui gère l'éxecution de toutes les Features
 * @author Yassine Skiba
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/Features"
,glue= {"Steps"}
)
public class ARD_TestRunner {

}