package pages;

import net.serenitybdd.annotations.Step;

public class HomePage {
    OrangeHRMHomePage orangeHRM;

    @Step
    public void openApplication() {
        orangeHRM.open();
    }

    @Step
    public void enterUsername() {
        orangeHRM.enterUname();
    }

    @Step
    public void enterPassword() {
        orangeHRM.enterPassword();
    }

    @Step
    public void clickLoginButton() {
        orangeHRM.clickLogin();
    }
}
