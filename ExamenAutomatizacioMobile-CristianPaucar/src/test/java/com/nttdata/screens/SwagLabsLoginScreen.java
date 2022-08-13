package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SwagLabsLoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement userInput;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement passwordInput;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement userInputText;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement passwordInputText;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    public void appLogin(){
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void userText(String us){
        userInput.click();
        userInputText.sendKeys(us);
    }

    public void passwordText(String ps){
        passwordInput.click();
        passwordInputText.sendKeys(ps);
    }

    public void clickLogin(){
        btnLogin.click();
    }

}
