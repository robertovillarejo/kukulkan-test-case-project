package mx.infotec.dads.cucumber.stepdefs;

import mx.infotec.dads.TestcaseApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestcaseApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
