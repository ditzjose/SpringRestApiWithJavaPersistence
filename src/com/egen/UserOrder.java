package com.egen;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class UserOrder {
	
	@Id
	private String  userID;
	private String OrderID;
	private String  Title;
	
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
//	public List<MoveTable> getOrderList() {
//		return OrderList;
//	}
//	public void setOrderList(List<MoveTable> orderList) {
//		OrderList = orderList;
//	}
	
	

}
