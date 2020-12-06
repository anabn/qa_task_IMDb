package testPageObjectExample;
import org.testng.annotations.Test;

//Using Java and Selenium
// 1) Open following link: https://www.imdb.com/chart/top/
// 2) Print out to console movies with rating >= 9.0
// Page Object pattern usage will be a plus.
// Deadline: Tuesday (12 Dec) morning

public class testPageByRating extends prepareEnvForTest{
    @Test
    public void testDisplayMovieWhichRatingMoreThenNineOrEquals() {
        logger.info("execute : " + this.getClass());
        logger.info("execute test which is displayed movies with rating >= 9.0");
        main.goToSiteByURL().getMovie();
        logger.info("print out to console movies");
        logger.info("finish execution the  : " + this.getClass());
    }

}
