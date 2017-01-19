package com.swachhata.citizenapp.pages.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	
		 
		  WebDriver driver;
		  public DashboardPage(WebDriver Idriver){
		   this.driver=Idriver;
		  }
		  //*************************Post a Complaint ************************/
		  @FindBy(xpath="//android.widget.RelativeLayout[contains(@resource-id,'pac')]")
		  private WebElement PostComplaint;
		  @FindBy(xpath="//android.widget.TextView[contains(@text,'Camera')]")
		  private WebElement Camera;
		  @FindBy(xpath="//android.widget.RelativeLayout[contains(@resource-id,'up')]")
		  private WebElement UpdateProfile;
		  @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'settings')and @index='1']")
		  private WebElement Search;
		  @FindBy(xpath="//android.widget.EditText[contains(@text,'Search complaint') and @index='0']")
		  private WebElement SearchComplaint;
		  @FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'back')]")
		  private WebElement back;
		  @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.ichangemycity.swachhbharat:id/textView') and @text='Profile']")
		  private WebElement ProfileTab;
		  @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.ichangemycity.swachhbharat:id/textView') and @text='Notifs']")
		  private WebElement NotificationsTab;
		  @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.ichangemycity.swachhbharat:id/textView') and @text='Complaints']")
		  private WebElement ComplaintsTab;
		  
		  @FindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.ichangemycity.swachhbharat:id/textView') and @text='Home']")
		  private WebElement HomepageTab;
		  
		  public void ClickOnPostaComplaintLink() throws InterruptedException
		  {
		  System.out.println("Clicking Post a Complaint");
		  PostComplaint.click();
		  System.out.println("Clicked Post a Complaint");
		  Thread.sleep(2000);
		  }
		  
		  public void ClickOnUpdateProfilePage() throws InterruptedException
		  {
		   System.out.println("Clciking Update User Settings");
		   UpdateProfile.click();
		   System.out.println("Clicked Update User Settings");
		   Thread.sleep(2000);
		  }
		  public void ClcikOnProfilePage() throws InterruptedException
		  {
		  System.out.println("Clciking Profile Page");
		  ProfileTab.click();
		  System.out.println("Clicked Profile Page");
		  Thread.sleep(2000);
		  }
		  public void ClickOnNotificationssPage() throws InterruptedException
		  {
		 System.out.println("Clicking Notifications tab");
		  NotificationsTab.click();
		  System.out.println("Clicked Notifications tab");
		  
		  Thread.sleep(2000);
		  }
		  public void ClickOnHomePage() throws InterruptedException
		  {
		 System.out.println("Clicking Homepage tab");
		 HomepageTab.click();
		  System.out.println("Clicked Homepage tab");
		  
		  Thread.sleep(2000);
		  }
		  public void ClickOnComplaintssPage() throws InterruptedException
		  {
		 System.out.println("Clicking Complaints tab");
		 ComplaintsTab.click();
		 System.out.println("Clicked Complaints tab");
		 Thread.sleep(2000);
		  }
		  
		  public void ClickOnSearchComplaintPage(String name) throws InterruptedException
		  {
		  Search.click();
		  Thread.sleep(2000);
		  SearchComplaint.sendKeys(name);
		  Thread.sleep(2000);
		  back.click();
		  Thread.sleep(2000);
		  
		  }

		

		  
		  
		}


