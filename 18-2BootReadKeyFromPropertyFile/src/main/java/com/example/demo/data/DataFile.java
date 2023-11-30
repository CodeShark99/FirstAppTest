package com.example.demo.data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataFile {

	@Value("${data.driver}")
	private String driver;
	
	@Value("${data.username}")
	private String username;
	
	@Value("${data.password}")
	private int password;

	@Override
	public String toString() {
		return "DataFile [driver=" + driver + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
