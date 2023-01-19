package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	//@FindBy(xpath="")private WebElement UN;
	//@FindBy(xpath="")private WebElement PWD;
	@FindBy(xpath="//button[contains(text(),'Sign out')]") private WebElement logoutbtn;
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void logoutbtn12() {
		logoutbtn.click();
	}
}
