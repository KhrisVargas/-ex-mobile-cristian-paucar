package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class SwagLabsPrincipalScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement resultProducto;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView")
    private WebElement resultItem;

    public String getResultProd(){
        return resultProducto.getText();
    }

    public String getResultIt(){
        return resultItem.getText();
    }
}
