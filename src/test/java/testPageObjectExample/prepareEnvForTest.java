package testPageObjectExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjectExample.EntryPointTest;
import org.apache.log4j.Logger;
import java.util.concurrent.TimeUnit;

public class prepareEnvForTest {
    public WebDriver chromeWebDriver;
    public EntryPointTest main;
    protected Logger logger;
    private final String pathToLocalWebdriver = "/Users/popcorn/chromedriver";
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", pathToLocalWebdriver);
        chromeWebDriver = new ChromeDriver();
        chromeWebDriver.manage().window().maximize();
        logger = Logger.getLogger(prepareEnvForTest.class.getName());
        logger.info("prepare an environment for run test");
        chromeWebDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        main = PageFactory.initElements(chromeWebDriver, EntryPointTest.class);
        logger.info("initiation elements");
    }

    @AfterClass
    public void afterClass() {
        chromeWebDriver.quit();
        logger.info("close an environment after test");
    }
}


