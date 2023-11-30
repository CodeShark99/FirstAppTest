package my.app.myconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import my.app.controller.MyController;

@Component
public class Test {
	public static void main(String[] args) {

	ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
	MyController ob = ac.getBean("myController", MyController.class);
	System.out.println(ob);
	}	
}


