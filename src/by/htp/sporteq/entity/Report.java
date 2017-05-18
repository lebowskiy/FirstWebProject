package by.htp.sporteq.entity;

import java.sql.Date;

public class Report {

	private int orderID;
	private int userID;
	private int equipID;
	private Date dateStart;
	private Date dateEnd;
	
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Report(int orderID, int userID, int equipID, Date dateStart, Date dateEnd) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.equipID = equipID;
		this.dateStart = dateStart;
		this.dateEnd = dateEnd;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getEquipID() {
		return equipID;
	}
	public void setEquipID(int equipID) {
		this.equipID = equipID;
	}
	public Date getDateStart() {
		return dateStart;
	}
	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	
	
	
}
