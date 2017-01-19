package com.swachhata.citizenapp.pages.com;



import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	WebDriver driver;
	public RegistrationPage(WebDriver Idriver){
		this.driver=Idriver;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'English')]")
	private WebElement EnglishLanguage;
	@FindBy(xpath="//android.widget.EditText[contains(@text,'mobile number')]")
	private WebElement MobileNumber;
	@FindBy(xpath="//android.widget.Button[contains(@text,'NEXT')]")
	private WebElement NextButton;
	@FindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	private WebElement LeftDrawer;
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Logout')]")
	private WebElement Logout;
	@FindBy(xpath="//android.widget.ImageView[contains(@index,'2')]")
	private WebElement gps;
	@FindBy(xpath="//android.widget.ImageView[contains(@index,'2')]")
	private WebElement Upload;
	@FindBy(xpath="//android.widget.ImageView[contains(@bounds,'[568,1128][680,1240]') and @index='2']")
	private WebElement Share;
	@FindBy(xpath="//android.widget.Button[contains(@text,'Yes')]")
	private WebElement yes;
	
	
	
public void CitizenAppLoginTest(String Mobile) throws InterruptedException {
	EnglishLanguage.click();
	Thread.sleep(5000);
	MobileNumber.sendKeys(Mobile);
	Thread.sleep(5000);
	NextButton.click();
	Thread.sleep(5000);
	gps.click();
	Thread.sleep(5000);
	Upload.click();
	Thread.sleep(5000);
	Share.click();
	Share.click();
	Thread.sleep(2000);
	
	
}
	public void logOut() throws InterruptedException{
		//Click on LogoutIcon
		LeftDrawer.click();
		Thread.sleep(5000);
		Logout.click();
		Thread.sleep(5000);
		yes.click();
		 System.out.println("Logout Successfully");
		}
}
