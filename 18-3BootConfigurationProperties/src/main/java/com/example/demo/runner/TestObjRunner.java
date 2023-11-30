package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.FileData;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	private FileData con;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub		
		System.out.println(con);
	}

}
