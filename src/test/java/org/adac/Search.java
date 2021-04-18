package org.adac;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends Base {

	public Search() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement RoomType;

	@FindBy(id = "room_nos")
	private WebElement NumberofRooms;

	@FindBy(id = "datepick_in")
	private WebElement checkindate;

	@FindBy(id = "datepick_out")
	private WebElement checkoutdate;

	@FindBy(id = "adult_room")
	private WebElement AdultsPerRoom;

	@FindBy(id = "child_room")
	private WebElement ChildrenPerRoom;

	@FindBy(id = "Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getNumberofRooms() {
		return NumberofRooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return ChildrenPerRoom;
	}

	public WebElement getSearch() {
		return search;

	}

}
