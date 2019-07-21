package coreframework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractWebPage {


    protected WebDriver driver;
    public AbstractWebPage(WebDriver driver) {

        this.driver=driver;
        PageFactory.initElements(this.driver, this);

    }



}
