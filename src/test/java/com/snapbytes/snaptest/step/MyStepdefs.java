package com.snapbytes.snaptest.step;

import com.snapbytes.snaptest.service.DictionaryService;
import com.snapbytes.snaptest.service.TestContext;
import com.snapbytes.snaptest.service.UserManager;
import cucumber.api.java.en.When;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Random;

public class MyStepdefs {

    private final DictionaryService dictionaryService;
    private final UserManager<MyUser> userManager;
    private final CommonSteps commonSteps;

    public MyStepdefs(DictionaryService dictionaryService,
                      UserManager<MyUser> userManager,
                      CommonSteps commonSteps) {
        // All steps must reference CommonSteps
        this.dictionaryService = dictionaryService;
        this.userManager = userManager;
        this.commonSteps = commonSteps;
    }

    @When("^I assign random prop$")
    public void beforeScenario() {
        commonSteps.saveConstant(new Random().nextInt()+"", "my prop");
    }

    @When("^(?:I )?save variable ((?:the|my|lookup)(?: \\w+)+) as:$")
    public void saveVariable(String dictionaryKey, List<String> values) {
        StringBuilder builder = new StringBuilder();
        values.forEach(cellValue -> {
            if (cellValue.matches("'.+'")) {
                cellValue = StringUtils.removeStart(cellValue, "'");
                cellValue = StringUtils.removeEnd(cellValue, "'");
            }
            String evaluated = dictionaryService.lookupText(cellValue);
            builder.append(evaluated);
        });
        String concatedString = builder.toString();
        dictionaryService.putVariable(dictionaryKey.substring(4), concatedString);
    }
}
