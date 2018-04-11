package gov.dhs.uscis.odos.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import gov.dhs.uscis.odos.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Login implements Task {

    @Step("Login as admin")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.LOGIN_LINK));
        actor.attemptsTo(Enter.theValue("admin").into(HomePage.USERNAME_FILED));
        actor.attemptsTo(Enter.theValue("admin").into(HomePage.PASSWORD_FIELD));
        actor.attemptsTo(Click.on(HomePage.SIGN_IN_BTN));
    }

    public static Login asAdmin() {
        return instrumented(Login.class);
    }

}
