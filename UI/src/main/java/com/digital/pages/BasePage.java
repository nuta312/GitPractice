package com.digital.pages;

import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    ElementActions elementActions = new ElementActions();
}
