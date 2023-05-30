package com.runner.Luma;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/feature",
glue={"hooks","com.stepdefinition"},plugin={"html:target/luma.html","json:target/luma.json"})
public class runner {

}
