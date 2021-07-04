package guru99.gitest;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    protected WebDriver driver;
    @Test
    public void guru99tutorial() throws InterruptedException{
    	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
    WebDriver driver = new FirefoxDriver();
       driver.get("http://www.guru99.com/");
       driver.close();
    }
}
