package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import java.io.File;


public class SwagLabsLoginSD {

    @Steps
    SwagLabsLoginSteps airbnbSearchSteps;

    @Given("que me encuentro en la pagina de login de SwagLabs")
    public void queMeEncuentroEnLaPaginaDeLoginDeSwagLabs() {
        airbnbSearchSteps.appLogin();
    }

    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicioSesiónConElUsuarioStandard_user(String usuario, String password) {
        airbnbSearchSteps.clickUser(usuario, password);
    }

    @Then("valido que deberia aparecer el titulo de {string}")
    public void validoQueDeberiaAparecerElTituloDe(String producto) {
        Assert.assertEquals(airbnbSearchSteps.getResultProducto(), producto);
    }

    @And("tambien valido que al menos exista un item")
    public void tambienValidoQueAlMenosExistaUnItem() {
        Assert.assertEquals(airbnbSearchSteps.getResultItem(), "ADD TO CART");
    }
}
