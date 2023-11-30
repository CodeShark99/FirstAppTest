package com.example.demo;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.app")
public class FileData {

	private String Driver;
	private String Username;
	private int Password;
	private List<String> data;
	
	private Process pob;

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public String getDriver() {
		return Driver;
	}

	public void setDriver(String driver) {
		Driver = driver;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	public Process getPob() {
		return pob;
	}

	public void setPob(Process pob) {
		this.pob = pob;
	}

	@Override
	public String toString() {
		return "FileData [Driver=" + Driver + ", Username=" + Username + ", Password=" + Password + ", data=" + data
				+ ", pob=" + pob + "]";
	}

}
