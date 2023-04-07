package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		MessageBean messageBean = (MessageBean) context.getBean("messageBeanImpl2");
		messageBean.helloCall();
	
	
	}

}
