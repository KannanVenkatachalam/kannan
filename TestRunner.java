package org.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources",glue = "org.stepdefinition",dryRun = false,strict = true)
@CucumberOptions(features = "src/test/resources",glue ="org.stepdefinition",dryRun = false,strict = false)
public class TestRunner {

}
