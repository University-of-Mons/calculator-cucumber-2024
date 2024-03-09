package calculator;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("calculator")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "calculator")
@SuppressWarnings("java:S2187")
public class CucumberTest {
}
