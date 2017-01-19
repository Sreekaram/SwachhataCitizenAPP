package com.swachhata.citizenapp.pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostaComplaintPage {

		 
		 WebDriver driver;
		 public  PostaComplaintPage(WebDriver Idriver){
		  this.driver=Idriver;
		 }
		  
		  //@FindBy(xpath="//android.widget.TextView[contains(@text,'Gallery')]")
		  //private WebElement gallery;
		 @FindBy(xpath="//android.widget.RelativeLayout[contains(@resource-id,'pac')]")
		  private WebElement PostComplaint;
		  
		  @FindBy(xpath="//android.widget.TextView[contains(@text,'Take a picture')]")
		  private WebElement Takepicture;
		 
		  @FindBy(xpath="//android.widget.ImageView[contains(@content-desc,'Shutter')and @index='1']")
		  private WebElement Shot;
		  @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'com.android.camera2:id/btn_done')]")
		  private WebElement OK;
		  
		  //*********************Category********************//
		  
		  
		  @FindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'parent')and @index='1']")
		  private WebElement Category;
		  @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_description')]")
		  private WebElement LandMark;
		  @FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'imgbtn_location')]")
		  private WebElement Location;
		  @FindBy(xpath="//android.widget.Button[contains(@resource-id,'continuebtn')and @text='Post']")
		  private WebElement Post;
		  @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'backToFeed') and @text='Back To Feed']")
		  private WebElement Backtofeed;
		  
		  
		  
		  


		public void ClickOnPostAComplaint(String landmark) throws InterruptedException {
			
			System.out.println("Clicking Post a Complaint");
			 PostComplaint.click();
			System.out.println("Clicked Post a Complaint");
			
			 Takepicture.click();
			 Thread.sleep(2000);
			 Shot.click();
			   Thread.sleep(2000);
			   OK.click();
			   Thread.sleep(2000);
			   Category.click();
			   Thread.sleep(2000);
			   LandMark.sendKeys(landmark);
			   Thread.sleep(2000);
			   Location.click();
			   Thread.sleep(2000);
			   Post.click();
			   Thread.sleep(2000);
			   Backtofeed.click();
			   Thread.sleep(2000);
			   
		}
		  
		  
		  

		}


