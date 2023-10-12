package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cloud_vendor_info")

public class CloudVendor {
	
	@Id
	private String contactorID;
	private String contactorName;
	private String contactNum;

	
	  public CloudVendor() {
	  
	  }
	 
	public CloudVendor(String contactorID,
	 					String contactorName,
	 					String contactNum) {
		// TODO Auto-generated constructor stub
		 this.contactorID=contactorID;
		 this.contactorName=contactorName;
		 this.contactNum=contactNum;
	}

	public String getContactorID() {
		return contactorID;
	}
	public void setContactorID(String contactorID) {
		this.contactorID = contactorID;
	}
	public String getContactorName() {
		return contactorName;
	}
	public void setContactorName(String contactorName) {
		this.contactorName = contactorName;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	

}
