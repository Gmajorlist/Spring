package sample05;

public class MessageBeanImpl implements MessageBean {
	private String name;
	private String phone;
	private Outputter outputter;
	
	
	
	public void setOutputter(Outputter outputter) {
		System.out.println("setOutputter(Outputter outputter)");
		this.outputter = outputter;
	}

	public MessageBeanImpl(String name) { //생성자
		System.out.println("MessageBeanImpl(String name)");
		this.name = name;
	}

	public void setPhone(String phone) { //setter 
		System.out.println("setPhone(String phone)");
		this.phone = phone;
	}




	@Override
	public void helloCall() {
		System.out.println("helloCall");
		outputter.output(name + "\t" + phone);
		
		
	}

}
