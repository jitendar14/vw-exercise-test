package coreframework;


import org.openqa.selenium.WebDriver;
import pageObjects.LandingPage;

public class AbstractTestcase {

    protected WebDriver driver;

    @Value("$vwurl}")
    private String vwurl;
    public void printURL()  {  System.out.println(uwurl); }

    @Autowired
    protected RestTestTemplate restTemplate;

    public void printRestTemplate() { System.out.println(restTemplate); }

    @Autowired
    private WebDriverFactory webDriverFactory;

    public void printWebDriverFactory() { System.out.println(webDriverFactory); }

    public String navigateToVolksWagenUrl() { return vwurl ;}

    protected LandingPage goToLandingPage () {


        driver=webDriverFactory.initializeWebDriver();
        driver.get(navigateToVolksWagenUrl());
        System.out.println(driver.getTitle());

        return new LandingPage(driver);



    }














}
