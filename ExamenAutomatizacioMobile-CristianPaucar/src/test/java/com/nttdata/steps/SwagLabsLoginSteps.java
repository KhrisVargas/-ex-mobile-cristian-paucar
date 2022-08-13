package com.nttdata.steps;

import com.nttdata.screens.SwagLabsLoginScreen;
import com.nttdata.screens.SwagLabsPrincipalScreen;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SwagLabsLoginSteps {

    SwagLabsLoginScreen loginScreen;

    SwagLabsPrincipalScreen searchScreen;


    @Step("Abre la aplicación")
    public void appLogin(){
        loginScreen.appLogin();
    }

    @Step("Registra usuario")
    public void clickUser(String usuario, String password){
        loginScreen.userText(usuario);
        loginScreen.passwordText(password);
        loginScreen.clickLogin();
    }

    @Step("Valido el titulo")
    public String getResultProducto(){
        return searchScreen.getResultProd();
    }

    @Step("Valido el item")
    public String getResultItem(){
        return searchScreen.getResultIt();
    }

}
