package pageObjectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
    protected WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public TestBase(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 15);
    }
    private void  waitVisibility(By elementBy){
        webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }
    protected void findMovies(By elementBy){
        waitVisibility(elementBy);
        WebElement element = webDriver.findElement(elementBy);
        System.out.println(element.getText());
    }
    protected Double findRating(By elementBy){
        waitVisibility(elementBy);
        WebElement element = webDriver.findElement(elementBy);
        return Double.parseDouble(element.getText());
    }
}
