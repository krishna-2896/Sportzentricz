package com.testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true
,stepNotifications = true
,dryRun = false
,features={"src\\test\\resources\\Features\\Registerproffesion.feature"}
,glue="com.stepdefinition"
,snippets = SnippetType.CAMELCASE
)
public class Register_profession {

}
