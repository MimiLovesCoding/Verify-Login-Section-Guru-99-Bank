package BankTestLogin;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchDrivers {
	protected WebDriver driver;

	@BeforeMethod
	@Parameters("multibrowsers")
	public void Launch(String browsername) {

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if (browsername.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Tests are complete");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
		driver.get("http://www.demo.guru99.com/V4/");
		
	}

	@AfterMethod
	public void quitdrivers() throws InterruptedException {
		if (driver != null) {
			Thread.sleep(3000);
			driver.quit();
		}
	}
}
	
	


	

	