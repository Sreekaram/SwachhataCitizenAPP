package com.swachhata.citizenapp.E2ETest.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.swachhata.citizenapp.pages.com.ComplaintsDetailsPage;
import com.swachhata.citizenapp.pages.com.ComplaintsPage;
import com.swachhata.citizenapp.pages.com.DashboardPage;
import com.swachhata.citizenapp.pages.com.PostaComplaintPage;
import com.swachhata.citizenapp.pages.com.PostaComplaintUsingGallleryPage;
import com.swachhata.citizenapp.pages.com.ProfilePage;
import com.swachhata.citizenapp.pages.com.RegistrationPage;



public class SwachhataCitizenAPPTest {
	WebDriver driver;
	  
	 @BeforeTest
	  public void setUp() throws MalformedURLException {
	  
	  System.out.println("Opening the Swachhata Application"); 
	   
	   // Created object of DesiredCapabilities class.
	   org.openqa.selenium.remote.DesiredCapabilities capabilities = new org.openqa.selenium.remote.DesiredCapabilities();

	   // Set android deviceName desired capability. Set your device name.
	   capabilities.setCapability("deviceName", "549dc8a6");

	   // Set BROWSER_NAME desired capability. It's Android in our case here.
	   capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

	   // Set android VERSION as desired capability. Set your mobile device's OS version.
	   capabilities.setCapability(CapabilityType.VERSION, "5.0.2");

	   // Set android platformName desired capability. It's Android in our case here.
	   capabilities.setCapability("platformName", "Android");

	   // Set android appPackage desired capability. It is
	  
	   // Set your application's appPackage if you are using any other app.
	   capabilities.setCapability("appPackage", "com.ichangemycity.swachhbharat");
	   capabilities.setCapability("newCommandTimeout", "300");  

	   // Set android appActivity desired capability.  
	    capabilities.setCapability("appActivity", "com.ichangemycity.swachhbharat.SplashScreen");
	    

	   // Created object of RemoteWebDriver will all set capabilities.
	   // Set Appium server address and port number in URL string.
	   // It will launch Swachhata app in android device.
	   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4763/wd/hub"), capabilities);
	   driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		 
		}
	 //****************LoginTest**************************//
	 @Test
	 public void citizenAPPLoginTest() throws InterruptedException{
		 RegistrationPage	 Registration =PageFactory.initElements(driver, RegistrationPage.class);
		 Registration.CitizenAppLoginTest("9900645700");
		 //Registration.logOut();
	 }
	 //****************Post A Complaint using camera Test**************************//
	@Test(priority=8)
	  public void PostaComplaintTest() throws InterruptedException
	  {
		 PostaComplaintPage  PostComplaint =PageFactory.initElements(driver, PostaComplaintPage.class);
		 PostComplaint.ClickOnPostAComplaint("SRIT House");
	  }
	
	//****************UpdateProfileTest**************************/
	@Test(priority=7)
	  public void UpdateProfileTest() throws InterruptedException{
		 ProfilePage Profile=PageFactory.initElements(driver, ProfilePage.class);
		   Profile.ClickOnProfileSettings("Anils");
	 }
	//******************complaintEditDeleteTest************************//
	@Test(priority=4)
	  public void complaintEditTest() throws InterruptedException
	  {
	   ComplaintsDetailsPage ComplaintDetail =PageFactory.initElements(driver, ComplaintsDetailsPage.class);
	   ComplaintDetail.EditComplaintPage("JANAAGRAHA");
	   ComplaintDetail.DeleteComplaintPage();
	   
	  }
	//******************complaintDeleteTest************************//
	@Test(priority=5)
	  public void complaintDeleteTest() throws InterruptedException
	  {
	   ComplaintsDetailsPage ComplaintDetail =PageFactory.initElements(driver, ComplaintsDetailsPage.class);
	   ComplaintDetail.DeleteComplaintPage();
	   
	   
	  }
	//****************DashBoard test**************************//
		@Test(priority=2)
		  public void DashboardTest() throws InterruptedException
		  {
			 DashboardPage  DashBoard =PageFactory.initElements(driver, DashboardPage.class);
			   DashBoard.ClickOnComplaintssPage();
			   DashBoard.ClcikOnProfilePage();
			   DashBoard.ClickOnNotificationssPage();
			   DashBoard.ClickOnHomePage();
			   DashBoard.ClickOnSearchComplaintPage("Radha"+"\n");
			
		  }
	
		//****************Comments,voteup,status change,feedback Test**************************//
		@Test(priority=6)
		  public void ComplaintPageTest() throws InterruptedException{
			ComplaintsPage  Compaints =PageFactory.initElements(driver, ComplaintsPage.class);
			Compaints.ClickOnVoteUp();
			Compaints.EnterCommentAndFeedback("Testing a comment");
		}

		//****************Logout Test**************************//
		@Test(priority=3)
		  public void LogoutTest() throws InterruptedException{
			RegistrationPage	 Registration =PageFactory.initElements(driver, RegistrationPage.class);
			Registration.logOut();
			 
		}
		//****************Post A Complaint using gallery Test**************************//
				@Test(priority=2)
				  public void PostaComplaintUsingGalleryTest() throws InterruptedException{
					PostaComplaintUsingGallleryPage	 Gallery =PageFactory.initElements(driver, PostaComplaintUsingGallleryPage.class);
					Gallery.ClickOnPostAComplaintUsingGallery("SRIT","Brookefield, Bengaluru, Karnataka, India");
				}
}


