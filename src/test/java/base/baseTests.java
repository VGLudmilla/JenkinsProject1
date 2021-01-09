package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseTests {
    private WebDriver driver;

    @Test
    public void setUp() {
        driver.get("https://the-internet.herokuapp.com/");
        String title = driver.getTitle();
        System.out.println(title);
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }

    @BeforeTest
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

}
