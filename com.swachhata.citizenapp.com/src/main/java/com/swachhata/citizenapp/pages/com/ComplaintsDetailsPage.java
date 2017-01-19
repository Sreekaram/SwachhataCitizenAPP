package com.swachhata.citizenapp.pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComplaintsDetailsPage {

		 WebDriver driver;
		 public ComplaintsDetailsPage(WebDriver Idriver){
		  this.driver=Idriver;
		}
		 @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'complaint_image')]")
		 private WebElement Complaintimage;
		 @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'menu')]")
		 private WebElement Menu;
		 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'textData')and @text='Edit complaint']")
		 private WebElement Edit;
		 @FindBy(xpath="//android.widget.TextView[contains(@text,'Delete complaint')]")
		 private WebElement Delete;
		 @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'dropdown')]")
		 private WebElement Dropdown;
		 @FindBy(xpath="//android.widget.TextView[contains(@text,'Garbage vehicle not arrived')]")
		 private WebElement Categorychange;
		 
		 @FindBy(xpath="//android.widget.EditText[contains(@resource-id,'et_landmark')]")
		 private WebElement Landmarkchange;
		 @FindBy(xpath="//android.widget.Button[contains(@resource-id,'submit')and @text='Done']")
		 private WebElement Donee;
		 @FindBy(xpath="//android.widget.Button[contains(@text,'OK')]")
		 private WebElement OKK;
		 @FindBy(xpath="//android.widget.Button[contains(@resource-id,'com.ichangemycity.swachhbharat:id/back')]")
		 private WebElement Back;
		 
		 
		 public void EditComplaintPage(String Landmarkk)throws InterruptedException
		 {
		  Complaintimage.click();
		  Thread.sleep(2000);
		  Menu.click();
		  Thread.sleep(2000);
		  Edit.click();
		  Thread.sleep(2000);
		  Dropdown.click();
		  Thread.sleep(2000);
		  Categorychange.click();
		  Thread.sleep(2000);
		  Landmarkchange.clear();
		  Thread.sleep(2000);
		  Landmarkchange.sendKeys(Landmarkk);
		  Thread.sleep(2000);
		  Donee.click();
		  Thread.sleep(2000);
		  Back.click();
		  Thread.sleep(2000);
		 }
		 
		 public void DeleteComplaintPage() throws InterruptedException
		 {
			Complaintimage.click();
			  Thread.sleep(2000);
			  Menu.click();
			  Thread.sleep(2000);
			  Delete.click();
			  Thread.sleep(2000);
			  OKK.click();
			  Thread.sleep(2000);
			  OKK.click();
			  Thread.sleep(2000);
		  
		  
		  
		  
		  
		 }
		}
