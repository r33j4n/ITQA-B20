package pages;

import net.serenitybdd.annotations.Step;

public class Dashboard {

    OrangeHRMDashboard orangeHRMDashboard;

    @Step
    public void verifyAdmin() {
        orangeHRMDashboard.loginVerified();
    }
}
