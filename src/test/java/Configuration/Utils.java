package Configuration;


import coreframework.AbstractWebPage;
import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils  extends AbstractWebPage {

    public Utils(WebDriver driver) { super (driver);}

    public static final int TIMEOUT=30;

    //wait for element visible

    public static void waitForElementVisible(WebDriver driver, WebElement element) {

        WebDriverWait wait=new WebDriverWait(driver, Timeout);



    }







}
