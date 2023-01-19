package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy(xpath="(//summary[@class='Header-link'])[2]")private WebElement accountbtn;
	@FindBy(xpath="//strong[text()='sachin7173']")private WebElement verifyusername;
	//@FindBy(xpath="") private WebElement loginbtn;
	public Home(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void accountbtn12() {
		accountbtn.click();
	}

	public String verifyusername12() {
	String actResult = verifyusername.getText();
	return actResult;
	
	}
}
