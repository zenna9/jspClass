package org.zen.rest.datas;

public class PeopleDTO {
	private int number;
	private String name;
	private String phone;
	private String rpay;
	private int rno;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRpay() {
		return rpay;
	}
	public void setRpay(String rpay) {
		this.rpay = rpay;
	}
	public int getRno() {
		return rno;
	}
	@Override
	public String toString() {
		return "PeopleDTO [number=" + number + ", name=" + name + ", phone=" + phone + ", rpay=" + rpay + ", rno=" + rno
				+ "]";
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	
}
