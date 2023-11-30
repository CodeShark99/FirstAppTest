package my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {

	@Value("MyService obj value")
	private String code;

	@Override
	public String toString() {
		return "MyService [code=" + code + "]";
	}
	
}
