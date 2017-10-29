package com.sample.freesoft.person;

import com.sample.freesoft.person.MaritalStatus;

public class Person {
	private MaritalStatus status;
	private Integer income;
	private Integer taxRate;

	public Integer getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(Integer taxRate) {
		this.taxRate = taxRate;
	}

	public MaritalStatus getStatus() {
		return status;
	}

	public void setStatus(MaritalStatus status) {
		this.status = status;
	}

	public Integer getIncome() {
		return income;
	}

	public void setIncome(Integer income) {
		this.income = income;
	}
}
