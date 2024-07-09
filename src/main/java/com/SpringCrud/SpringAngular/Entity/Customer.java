package com.SpringCrud.SpringAngular.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "customer")
@Entity
public class Customer {
	@Id
	@Column(name = "customer_id", length = 50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;

	@Column(name = "customer_name", length = 50)
	private String customername;

	@Column(name = "mobile", length = 50)
	private int mobile;

	@Column(name = "customer_address", length = 50)
	private String customeraddress;

	public Customer(int customerId, String customerName, String customerAddress, int mobile) {
		super();
		this.customerid = customerId;
		this.customername = customerName;
		this.customeraddress = customerAddress;
		this.mobile = mobile;
	}

	public Customer() {
		super();
	}

	public Customer(String customerName, String customerAddress, int mobile) {
		
		this.customername = customerName;
		this.customeraddress = customerAddress;
		this.mobile = mobile;
	}

	public int getCustomerId() {
		return customerid;
	}

	public void setCustomerId(int customerId) {
		this.customerid = customerId;
	}

	public String getCustomerName() {
		return customername;
	}

	public void setCustomerName(String customerName) {
		this.customername = customerName;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getCustomerAddress() {
		return customeraddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customeraddress = customerAddress;
	}

}
