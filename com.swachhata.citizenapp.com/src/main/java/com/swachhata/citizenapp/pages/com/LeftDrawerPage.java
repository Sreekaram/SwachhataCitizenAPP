package com.swachhata.citizenapp.pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftDrawerPage {
	
		 WebDriver driver;
		 public LeftDrawerPage(WebDriver Idriver){
		  this.driver=Idriver;
		}
		 
		   
		 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'title') and @text='Complaints Posted')]")
		 private WebElement ComplaintsPosted; 
		 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'title') and @text='Complaints Posted')]")
		 private WebElement ComplaintsVoted;
		 
		 
		 public void ComplaintsPostedPage() throws InterruptedException
		 {
		  ComplaintsPosted.click();
		  Thread.sleep(2000);
		  
		 }
}
