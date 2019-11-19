package com.cg.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")

public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer custId;
	private String username;
	private Long mobile;
	private String mailId;
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	public Customer(){}
	public Customer(Integer custId, String username, Long mobile, String mailId) {
		super();
		this.custId = custId;
		this.username = username;
		this.mobile = mobile;
		this.mailId = mailId;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", username=" + username + ", mobile=" + mobile + ", mailId=" + mailId
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
