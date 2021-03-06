package com.cocaleca.rifado.cucumber.stepdefs;

import com.cocaleca.rifado.RifadoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = RifadoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
