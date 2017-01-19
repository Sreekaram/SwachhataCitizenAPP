package com.swachhata.citizenapp.pages.com;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {
	
		 WebDriver driver;
		 public ProfilePage(WebDriver Idriver){
		  this.driver=Idriver;

		}
		 @FindBy(xpath="//android.widget.RelativeLayout[contains(@resource-id,'up')]")
		  private WebElement UpdateProfile;
		 @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_name')]")
		 private WebElement ChangingName;
		 @FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'imgbtn_location')]")
		 private WebElement ChangingLocation;
		 @FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'imgbtn_location')]")
		 private WebElement ChangingLocationn;
		 
		 @FindBy(xpath="//android.widget.Button[contains(@resource-id,'submit')and @text='Done']")
		 private WebElement Done;
		 
		 public void  ClickOnProfileSettings(String name) throws InterruptedException
		 {
			 System.out.println("Clciking Update User Settings");
			   UpdateProfile.click();
			   System.out.println("Clicked Update User Settings");
			   Thread.sleep(2000);
			
		  ChangingName.clear();
		  Thread.sleep(2000);
		  ChangingName.sendKeys(name);
		  ChangingLocation.click();
		  Thread.sleep(2000);
		  ChangingLocationn.click();
		  Thread.sleep(2000);
		  Done.click();
		  Done.click();
		  
		 }

		
		}


