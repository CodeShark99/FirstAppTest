package my.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import my.app.MyService;

@Component
public class MyController {

	@Autowired
	private MyService service;

	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}

}
