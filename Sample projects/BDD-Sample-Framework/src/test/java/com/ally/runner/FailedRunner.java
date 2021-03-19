package com.ally.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/ally/step_definitions",
        features = "@target/rerun.txt"
)
public class FailedRunner {
}
