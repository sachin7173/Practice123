package Test_Classes;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Classes.BaseClass;
import POM_Classes.Home;
import POM_Classes.Login;
import POM_Classes.Logout;
import POM_Classes.Signin;
import POM_Classes.UtilityClass;

public class Test__1 extends BaseClass{
	Signin signin;
	Login login;
	Home home;
	Logout logout;
	
	@BeforeClass
	public void openBrowser12() throws IOException {
		openBrowser();
			signin =new Signin(driver);
			login =new Login(driver);
			home=new Home(driver);
			logout=new Logout(driver);
		}
	@BeforeMethod
	public void login12() throws IOException, InterruptedException {
		signin.signinbtn12();
		login.username12(UtilityClass.getPropertyFileData("username"));
        login.password12(UtilityClass.getPropertyFileData("password"));
        login.loginbtn12();
        Thread.sleep(2000);
        home.accountbtn12();
	}
	
	@Test
	public void verifyusername12() throws IOException {
		String expResult = UtilityClass.getPropertyFileData("username1");
		String actResult = home.verifyusername12();
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actResult, expResult,"act and ExpResult is different");
		soft.assertAll();
	}
	@AfterMethod
	public void logout12(ITestResult result) throws IOException, InterruptedException {
		if(result.getStatus()==ITestResult.FAILURE) {
			int TCID=3453;
			UtilityClass.CaptureScreenshot(driver, TCID);
			Thread.sleep(2000);
		}logout.logoutbtn12();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	}

