package gov.dhs.uscis.odos.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static Target LOGIN_LINK = Target.the("sign in link").located(By.linkText("sign in"));
    public static Target USERNAME_FILED = Target.the("username field").located(By.id("username"));
    public static Target PASSWORD_FIELD = Target.the("password field").located(By.id("password"));
    public static Target SIGN_IN_BTN = Target.the("sign in button").located(By.id("signinbtn"));
    public static Target SUCCESS = Target.the("success login").locatedBy("You are logged in as user");
}
