package com.ppp.db.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CUSTOMER")
public class CustomerVO  {
	@Id
	@GeneratedValue
	private int customer_num;
	private String customer_name;
	private String customer_phonenum;
	private String customer_address;
	
	public int getCustomer_num() {
		return customer_num;
	}
	public void setCustomer_num(int customer_num) {
		this.customer_num = customer_num;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_phonenum() {
		return customer_phonenum;
	}
	public void setCustomer_phonenum(String customer_phonenum) {
		this.customer_phonenum = customer_phonenum;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	@Override
	public String toString(){
		return "CustomerVO [customer_num=" + customer_num + ", customer_name="
				+ customer_name + ", customer_phonenum="+ customer_phonenum
				+", customer_address=" + customer_address +"]";
	} 
}