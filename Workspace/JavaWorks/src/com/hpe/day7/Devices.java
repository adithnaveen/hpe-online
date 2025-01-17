package com.hpe.day7;

// bean 
public class Devices implements Comparable<Devices> {

	@Override
	public int hashCode() {
		return this.dName.charAt(0);

	}

	@Override
	public boolean equals(Object obj) {

		Devices temp = (Devices) obj;
		if (this.dId == temp.dId && this.dName.equals(temp.dName) && this.dPrice == temp.dPrice) {
			return true;
		}
		return false;
	}

	private int dId;
	private String dName;
	private double dPrice;

	public Devices(int dId, String dName, double dPrice) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dPrice = dPrice;
	}

	@Override
	public String toString() {
		return "Devices [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public double getdPrice() {
		return dPrice;
	}

	public void setdPrice(double dPrice) {
		this.dPrice = dPrice;
	}

	@Override
	public int compareTo(Devices o) {
		return this.dId - o.dId; 
	}

}
