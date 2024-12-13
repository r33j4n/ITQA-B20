package pages;

import org.openqa.selenium.By;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class OrangeHRMHomePage extends PageObject {
    public void enterUname() {
        $(By.name("username")).type("Admin");
    }

    public void enterPassword() {
        $(By.name("password")).type("admin123");
    }

    public void clickLogin() {
        $(By.tagName("button")).click();
    }
}
