package com.swachhata.citizenapp.pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComplaintsPage {
	WebDriver driver;
	 public ComplaintsPage(WebDriver Idriver){
	  this.driver=Idriver;
	}
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'City')]")
	 private WebElement CityComplaints;
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Vote Up')]")
	 private WebElement Voteup;
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Yours')]")
	 private WebElement YoursComplaints;
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Nearby')]")
	 private WebElement NearbyComplaints;
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Vote Up')]")
	 private WebElement VoteUp;
	 @FindBy(xpath="//android.widget.TextView[contains(@text,'Comment')and @index='1']")
	 private WebElement Comment;
	 @FindBy(xpath="//android.widget.EditText[contains(@text,'Write a comment') and @index='2']")
	 private WebElement WriteComment;
	 @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'send') and @index='3']")
	 private WebElement SendComment;
	 @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'back')]")
	 private WebElement back;
	 @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'complaint_image')]")
	 private WebElement Complaintimage;
	 @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'menu')]")
	 private WebElement Menu;
	 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'textData')and @text='Mark as Resolved']")
	 private WebElement Resolve;
	 @FindBy(xpath="//android.widget.Button[contains(@text,'OK')]")
	 private WebElement OKK;
	 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'feedback1')and @text='Feedback']")
	 private WebElement Feedback;
	 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'title')and @text='Neutral']")
	 private WebElement Neutral;
	 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'text1')and @text='Officer was not responsive enough']")
	 private WebElement Neutraloption;
	 @FindBy(xpath="//android.widget.Button[contains(@resource-id,'send')and @text='Send']")
	 private WebElement Send;
	 
	 @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.ichangemycity.swachhbharat:id/textView') and @text='Complaints']")
	  private WebElement ComplaintsTab;
	
	 
	 public void ClickOnVoteUp() throws InterruptedException
	 {  
		 System.out.println("Clicking Complaints");
		 ComplaintsTab.click();
		 System.out.println("Clicked Complaints");
		 Thread.sleep(2000);
		 Voteup.click();
		 System.out.println("Clicked voteup");
	 }
	 public void EnterCommentAndFeedback(String comment) throws InterruptedException
	 {  
		 System.out.println("Clicking on comment");
		 Comment.click();
		 System.out.println("Clicked comment");
		 Thread.sleep(2000);
		 WriteComment.sendKeys(comment);
		 Thread.sleep(2000);
		 SendComment.click();
		 Thread.sleep(2000);
		 back.click();
		 Thread.sleep(2000);
		 Complaintimage.click();
		 Thread.sleep(2000);
		 Menu.click();
		 Thread.sleep(2000);
		 Resolve.click();
		 System.out.println("mark as resolved");
		 Thread.sleep(2000);
		 OKK.click();
		 WriteComment.sendKeys(comment);
		 Thread.sleep(2000);
		 SendComment.click();
		
		 Thread.sleep(2000);
		 System.out.println("Click on Feddback");
		 Feedback.click();
		 Thread.sleep(2000);
		 Neutral.click();
		 Thread.sleep(2000);
		 Neutraloption.click();
		 Thread.sleep(2000);
		 Send.click();
		 Thread.sleep(2000);
		 back.click();
		 Thread.sleep(2000);
		 YoursComplaints.click();
		 System.out.println("Click on Your Complanits");
		 Thread.sleep(2000);
		 CityComplaints.click();
		 System.out.println("Click on city complaints");
		 Thread.sleep(2000);
		 NearbyComplaints.click();
		 System.out.println("Click on near by complaints");
		 Thread.sleep(2000);
	 }
	 
	 
	 
	 public void ComplaintslistingTest(String comment) throws InterruptedException
	 {  
		 System.out.println("Clicking Complaints");
		 ComplaintsTab.click();
		 System.out.println("Clicked Complaints");
		 Thread.sleep(2000);
	  
	 CityComplaints.click();
	 Thread.sleep(2000);
	 
	 Voteup.click();
	 Thread.sleep(2000);
	 Comment.click();
	 Thread.sleep(2000);
	 WriteComment.sendKeys(comment);
	 Thread.sleep(2000);
	 SendComment.click();
	 Thread.sleep(2000);
	 back.click();
	 Thread.sleep(2000);
	 Complaintimage.click();
	 Thread.sleep(2000);
	 Menu.click();
	 Thread.sleep(2000);
	 Resolve.click();
	 Thread.sleep(2000);
	 OKK.click();
	 WriteComment.sendKeys(comment);
	 Thread.sleep(2000);
	 SendComment.click();
	
	 Thread.sleep(2000);
	 Feedback.click();
	 Thread.sleep(2000);
	 Neutral.click();
	 Thread.sleep(2000);
	 Neutraloption.click();
	 Thread.sleep(2000);
	 Send.click();
	 Thread.sleep(2000);
	 back.click();
	 Thread.sleep(2000);
	 YoursComplaints.click();
	 Thread.sleep(2000);
	 NearbyComplaints.click();
	 Thread.sleep(2000);
}
}