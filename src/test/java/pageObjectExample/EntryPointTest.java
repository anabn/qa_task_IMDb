package pageObjectExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryPointTest extends TestBase{
    private final String SITE_URL="https://www.imdb.com/chart/top/";
    public EntryPointTest(WebDriver webDriver) {
        super(webDriver);
    }
    public EntryPointTest goToSiteByURL(){
        webDriver.get(SITE_URL);
        return this;
    }
    public EntryPointTest getMovie(){
        double number = 9.0;
        for (int i=1;;i++) {
            if (findRating(By.xpath("//tr[" + i + "]/td[@class='ratingColumn imdbRating']/strong")) >= number){
                findMovies(By.xpath("//tr[" + i + "]/td[@class='titleColumn']"));
            }
            else {
                break;
            }
        }
        return this;
    }
}
