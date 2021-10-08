package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}
	
	@After
	public void fecharDriver() {
		driver.quit();
	}
	
	public static WebDriver getDriver() {
        return driver;
    }

    public static void abrirUrl(String url) {
        driver.get(url);
    }

}