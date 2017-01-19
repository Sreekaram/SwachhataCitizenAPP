package com.swachhata.citizenapp.pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostaComplaintUsingGallleryPage {
	WebDriver driver;
	public PostaComplaintUsingGallleryPage(WebDriver Idriver){
		this.driver=Idriver;
	}
	
	@FindBy(xpath="//android.widget.RelativeLayout[contains(@resource-id,'pac')]")
	  private WebElement PostComplaintgallery;
	
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Gallery')]")
	  private WebElement Gallery;
	@FindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'Show roots')]")
	  private WebElement ShowRoots;
	
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Images')]")
	  private WebElement images;
	
	@FindBy(xpath="//android.widget.TextView[contains(@resource-id,'title')and @text='ICMC']")
	  private WebElement ICMC;

	@FindBy(xpath="//android.widget.TextView[contains(@resource-id,'date')and @bounds='[40,823][332,856]']")
	  private WebElement photos;
	@FindBy(xpath="//android.widget.LinearLayout[contains(@resource-id,'parent')and @index='1']")
	  private WebElement Category;
	@FindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_description')and @index='0']")
	  private WebElement EditText;
	@FindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_location')and @index='0']")
	  private WebElement EditLocation;
	
	@FindBy(xpath="//android.widget.Button[contains(@resource-id,'continuebtn')and @text='Post']")
	  private WebElement PostGal;
	@FindBy(xpath="//android.widget.TextView[contains(@resource-id,'complaintID')]")
	  private WebElement thanks;
	@FindBy(xpath="//android.widget.TextView[contains(@resource-id,'backToFeed') and @text='Back To Feed']")
	  private WebElement Backtofeed;
	@FindBy(xpath="//android.widget.RelativeLayout[contains(@bounds,'[0,144][720,524]']")
	  private WebElement locate;
	
	public void ClickOnPostAComplaintUsingGallery(String landmark, String Location) throws InterruptedException {
		
		System.out.println("Clicking Post a Complaint");
		 PostComplaintgallery.click();
		
		 System.out.println("Clicked Post a Complaint");
		
		Gallery.click();
		 Thread.sleep(2000);
		 ShowRoots.click();
		   Thread.sleep(2000);
		   images.click();
		   Thread.sleep(2000);
		   ICMC.click();
		   Thread.sleep(2000);
		   photos.click();
		   Thread.sleep(2000);
		   Category.click();
		   Thread.sleep(2000);
		   EditText.sendKeys(landmark);
		   Thread.sleep(5000);
		   EditLocation.sendKeys(Location);
		   Thread.sleep(5000);
		   locate.click();
		   Thread.sleep(2000);
		   PostGal.click();
		   Thread.sleep(2000);
		 System.out.println(thanks.getText());
		   Backtofeed.click();
		   Thread.sleep(2000);
		   
	}
}
