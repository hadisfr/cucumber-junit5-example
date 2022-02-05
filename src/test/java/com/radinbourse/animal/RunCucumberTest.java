package com.radinbourse.animal;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@RunWith(Cucumber.class)
@CucumberContextConfiguration
@ContextConfiguration(classes = TestConfiguration.class)
@CucumberOptions(tags = "not @Disabled", plugin = {"json:target/cucumber.json"})
public class RunCucumberTest {

}