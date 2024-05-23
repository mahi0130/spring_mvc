package com.rays.collection;

public class DataSource {
	private String url;
	private String name;
	private String password;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "MyDataSource{ " + "url='" + url + "', " + " name='" + name + ", password='" + password + "'}";

	}

}
