package org.exe;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.adac.BookHotel;
import org.adac.Search;
import org.adac.login;
import org.adac.select;
import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.base.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Executable extends Base {
	
//	public static WebDriver driver ;
	
	@Given("^user in AdactinHotel page$")
	public void user_in_AdactinHotel_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Poorni Shurthi\\Documents\\AdactinPagecucumber\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
	}

	
	@When("^user login with valid \"([^\"]*)\" and\"([^\"]*)\" and user navigate to searchHOtel page$")
	public void user_login_with_valid_and_and_user_navigate_to_searchHOtel_page(String arg1, String arg2) throws Throwable {
		
		
		login lp1= new login();
	    
	    fillTextbox(lp1.getUsername(), readfromexcel(1,0));
	    fillTextbox(lp1.getPassword(), readfromexcel(1,1));
	    btnClick(lp1.getBtnlogin());
	    
	    
	//    WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
	//    email.sendKeys("Priya3110");
	 //   WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
	  //      pass.sendKeys("Priya@3110");
	    
	  //     WebElement logn=driver.findElement(By.xpath("//input[@type='Submit']"));
	 //      logn.click();
	    }

	@When("^user choosing \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"\\.\"([^\"]*)\", \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_choosing(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
      Search lp2=new Search();
//		 
//		 dropdownValues(lp2.getLocation(), 3);
//		 dropdownValues(lp2.getHotels(),3);
//		 dropdownValues(lp2.getNumberofRooms(),3);
//		 fillTextbox(lp2.getCheckindate(), readfromexcel(1,2));
//     	 fillTextbox(lp2.getCheckoutdate(),readfromexcel(1,3));
//		 dropdownValues(lp2.getAdultsPerRoom(),3);
//		 dropdownValues(lp2.getChildrenPerRoom(),3);
//	 
		 Map<String, String> i = excelread("Hotel Sunshine");
		 System.out.println(i);
		 
		 dropdownValues(lp2.getLocation(), i.get("location"));
		 dropdownValues(lp2.getHotels(), i.get("Hotel"));
		 dropdownValues(lp2.getRoomType(), i.get("room type"));
		 dropdownValues(lp2.getNumberofRooms(),3);
		 fillTextbox(lp2.getCheckindate(), i.get("check in date"));
		 fillTextbox(lp2.getCheckoutdate(),i.get("check out date"));
		 dropdownValues(lp2.getAdultsPerRoom(), i.get("Adults"));
	 dropdownValues(lp2.getChildrenPerRoom(), i.get("Children"));	      
	}

	
	@When("^user click search button and user go to select hotel page$")
	public void user_click_search_button_and_user_go_to_select_hotel_page() throws Throwable {
		 Search lp2=new Search();
		 btnClick(lp2.getSearch());

		
		 
	}

	@When("^user choose a hotel in the list and click continue button and user should be in payment page$")
	public void user_choose_a_hotel_in_the_list_and_click_continue_button_and_user_should_be_in_payment_page() throws Throwable {
	    
		select lp3=new select();
		 
		 btnClick(lp3.getRadioBtn());
		 btnClick(lp3.getContinueBtn());
		 Thread.sleep(5000);
	}

	@When("^user enter \"([^\"]*)\" ,\"([^\"]*)\" and \"([^\"]*)\" \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\" ,\"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) throws Throwable {
		BookHotel lp4 = new BookHotel();
		
		 fillTextbox(lp4.getFname(), readfromexcel(1,4));
		 fillTextbox(lp4.getLname(), readfromexcel(1,5));
		 fillTextbox(lp4.getBillingAddress(),readfromexcel(1,6));
		 fillTextbox(lp4.getCreditcrdno(), readfromexcel(1,7));
		 fillTextbox(lp4.getCvvno(),readfromexcel(1,8));
		dropdownValues(lp4.getCreditcrdtype(),2);
	    dropdownValues(lp4.getExpiryMonth(),2);
		dropdownValues(lp4.getExpiryYear(),3);
		Thread.sleep(5000);
		btnClick(lp4.getBooknow());
			
		
	}
	
	
	

	@When("^user click book now button and user get the booked room details$")
	public void user_click_book_now_button_and_user_get_the_booked_room_details() throws Throwable {
		BookHotel lp4 = new BookHotel();
		btnClick(lp4.getBooknow());
		Thread.sleep(5000);
		
		
		WebElement orderno= driver.findElement(By.id("order_no"));
		
		System.out.println(orderno.getAttribute("value"));
		Writeinexcel(0, 0, "order", orderno);
	}

	
	@Then("^user click search hotel then moved to home page of search hotel$")
	public void user_click_search_hotel_then_moved_to_home_page_of_search_hotel() throws Throwable {
		

	}
	public static  void TakeScreenShot( String filename) throws IOException {

		TakesScreenshot  ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Poorni Shurthi\\Documents\\AdactinPagecucumber\\Pictures\\pictures.JPEG");
		FileUtils.copyFile(src,des);

		}



}
