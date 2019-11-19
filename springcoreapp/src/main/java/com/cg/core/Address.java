package com.cg.core;

public class Address {
	
	private String state;
	private Long pincode;
	
	Address() { }

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", pincode=" + pincode + "]";
	}

}
