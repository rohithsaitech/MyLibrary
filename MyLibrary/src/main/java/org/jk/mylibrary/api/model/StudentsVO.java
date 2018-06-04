package org.jk.mylibrary.api.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class StudentsVO {

	private int sid;
	private String sname;
	@NotNull
	@Email
	@Size(min = 5, max = 15)
	private Long mobile;
	private String Address;
	private int yearofstu;
	private int BookCount;
	private String status;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getYearofstu() {
		return yearofstu;
	}
	public void setYearofstu(int yearofstu) {
		this.yearofstu = yearofstu;
	}
	public int getBookCount() {
		return BookCount;
	}
	public void setBookCount(int bookCount) {
		BookCount = bookCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "StudentsVO [sid=" + sid + ", sname=" + sname + ", mobile=" + mobile + ", Address=" + Address
				+ ", yearofstu=" + yearofstu + ", BookCount=" + BookCount + ", status=" + status + "]";
	}
	
	
}
