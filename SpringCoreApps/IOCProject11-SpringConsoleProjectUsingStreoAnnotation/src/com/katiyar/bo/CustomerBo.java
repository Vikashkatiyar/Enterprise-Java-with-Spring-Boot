package com.katiyar.bo;

public class CustomerBo {
	private String customerName;
	private String customerAddres;
	private float pamt;
	private float rate;
	private float time;

	private float interestAmt;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddres() {
		return customerAddres;
	}

	public void setCustomerAddres(String customerAddres) {
		this.customerAddres = customerAddres;
	}

	public float getPamt() {
		return pamt;
	}

	public void setPamt(float pamt) {
		this.pamt = pamt;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public float getInterestAmt() {
		return interestAmt;
	}

	public void setInterestAmt(float interestAmt) {
		this.interestAmt = interestAmt;
	}

	@Override
	public String toString() {
		return "CustomerBo [customerName=" + customerName + ", customerAddres=" + customerAddres + ", pamt=" + pamt
				+ ", rate=" + rate + ", time=" + time + ", interestAmt=" + interestAmt + "]";
	}

}