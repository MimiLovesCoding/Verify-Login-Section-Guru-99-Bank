package BankTestLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testUserIdandPassword extends LaunchDrivers {

// Test Case 1: Verify valid userid and password
	@Test(priority = 1)
	public void validbanklogin() {

		WebElement userId = driver.findElement(By.name("uid"));
		userId.sendKeys("mngr601191");
		WebElement pswrd = driver.findElement(By.name("password"));
		pswrd.sendKeys("ubEmuha");
		WebElement logbtn = driver.findElement(By.name("btnLogin"));
		logbtn.click();
		
		//Validation
		Assert.assertEquals("Guru99 Bank Manager HomePage", "Login passed with valid credentials!");
	}

	// Test Case 2: Verify invalid userid and valid password
	@Test(priority = 2)
	public void invaliduserIdValidPasswrd() {

		WebElement userId = driver.findElement(By.name("uid"));
		userId.sendKeys("November24");
		WebElement pswrd = driver.findElement(By.name("password"));
		pswrd.sendKeys("ubEmuha");
		WebElement logbtn = driver.findElement(By.name("btnLogin"));
		logbtn.click();
		
		//Validation
		Assert.assertEquals("User or Password is not valid", "Unexpected result for invalid userId!");
	}

	// Test Case 3: Verify valid userid and invalid password
	@Test(priority = 3)
	public void validuserIdInvalidPasswrd() {

		WebElement userId = driver.findElement(By.name("uid"));
		userId.sendKeys("mngr601191");
		WebElement pswrd = driver.findElement(By.name("password"));
		pswrd.sendKeys("wrongpsrd");
		WebElement logbtn = driver.findElement(By.name("btnLogin"));
		logbtn.click();
		
	}

//Test Case 4: Verify invalid userid and invalid password
	@Test(priority = 4)
	public void invaliduserandinvalidpswrd() {

		WebElement userId = driver.findElement(By.name("uid"));
		userId.sendKeys("November24");
		WebElement pswrd = driver.findElement(By.name("password"));
		pswrd.sendKeys("wrongpsrd");
		WebElement logbtn = driver.findElement(By.name("btnLogin"));
		logbtn.click();

		//Validation
		Assert.assertEquals("User or Password is not valid", "Unexpected result for invalid userId and invalid password!");
	}
}

