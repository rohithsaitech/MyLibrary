package org.jk.mylibrary.api.entites;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students implements Serializable {

	private int sid;
	private String sname;
	private Long mobile;
	private String Address;
	private int yearofstu;
	private int BookCount;
	private String status;
	
	public Students() {
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Column(length=30,nullable=false)
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getYearofstu() {
		return yearofstu;
	}

	public void setYearofstu(int yearofstu) {
		this.yearofstu = yearofstu;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getBookCount() {
		return BookCount;
	}

	public void setBookCount(int bookCount) {
		BookCount = bookCount;
	}
	@Column(length=10)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(unique=true,length=15,nullable=false)
	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


}
