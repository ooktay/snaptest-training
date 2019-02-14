package com.snapbytes.training;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Training {
    @Given("^I am logged in with (\\w+)$")
    public void iAmLoggedInWith(String userKey) {

    }

    @Given("^I am registered with (\\w+)$")
    public void iAmRegisteredWith(String userKey) {

    }

    @And("I am an? ([\\w ]+)")
    public void iAmAn(String profession) {
    }

    @And("I am ([\\w ]+)")
    public void iAm(String fullName) {
    }
}
