package com.testrunner;

import org.junit.runner.RunWith;

import com.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true
,stepNotifications = true
,dryRun = false
,features="src\\test\\resources\\Features"
,glue="com.stepdefinition"
,snippets = SnippetType.CAMELCASE

)
public class TestRunner_Signup {



}