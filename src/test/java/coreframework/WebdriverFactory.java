package coreframework;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.security.InvalidParameterException;
import java.util.concurrent.TimeUnit;

import static groovy.xml.Entity.not;

public class WebdriverFactory {


    @Value("${runmode}")
    private String runmMode;

    public WebDriver initializeWebDriver(){

        WebDriver driver = null;

        String path=System.getProperty("User.dir")+"/src/test/resources/";

        switch (runMode)

        {

            case "Chrome";
            System.setProperty("");
            driver = new ChromeDriver();
            break;

            case "Opera";
            System.setProperty("");
            driver = new OperaDriver();
            break;

            default : throw new InvalidParameterException(runMode + is not a valid parameter - RunMode environment variable is not set !");


            }

            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            return driver;




    }






}
