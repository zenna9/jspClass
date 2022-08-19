package org.comstudy21.myweb.model;

public class SaramDTO {
	private int id;
	private String name;
	private String phone;
	private String email;
	
	public SaramDTO(int id, String name, String phone, String email) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public SaramDTO() {
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return String.format("{\"id\":%d,\"name\":\"%s\",\"phone\":\"%s\",\"email\":\"%s\"}", id,name,phone,email);
	}
	
}
