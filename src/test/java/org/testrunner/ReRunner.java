package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@rerun/failed_scenarios.txt",
glue="org.stepdefinition")
public class ReRunner {

}
