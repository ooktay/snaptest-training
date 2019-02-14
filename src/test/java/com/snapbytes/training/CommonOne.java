package com.snapbytes.training;

import com.snapbytes.snaptest.step.CommonSteps;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CommonOne {
    private final CommonSteps commonSteps;
    private final LastUsed lastUsed;

    public CommonOne(CommonSteps commonSteps, LastUsed lastUsed) {
        this.commonSteps = commonSteps;
        this.lastUsed = lastUsed;
    }

    @Given("I am logged in")
    public void iAmLoggedIn() {
        System.out.println("logged in");
    }

    @Given("I am logged in as Administrator")
    public void iAmLoggedInAsAdministrator() {
        System.out.println("logged in as Admin");
    }

//    @Given("^I am registered with (\\w+)$")
//    public void iAmRegisteredWith(String userKey) {
//        commonSteps.registeredWithUser(userKey);
//    }

    @And("I am an? ([\\w ]+)")
    public void iAmAn(String profession) {
    }

//    @And("I am ([\\w ]+)")
//    public void iAm(String fullName) {
//    }

    @Given("^I am logged in with (\\w+)$")
    public void iAmLoggedInWith(String userKey) {
        commonSteps.registeredWithUser(userKey);
        lastUsed.user = userKey;
    }

    @And("I print last used user")
    public void iPrintLastUsedUser() {
        System.out.println(lastUsed.user);
    }

    @Before
    public void senaryoOncesi() {
        System.out.println("Baslarken");
    }

//    @BeforeStep
//    public void arada() {
//        commonSteps.waitForNSeconds(2);
//    }
}
