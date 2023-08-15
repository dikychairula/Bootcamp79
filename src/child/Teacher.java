package child;


import parents.Person;

//konsep inheritance from class Person using extends

public class Teacher extends Person{
	private String subject;

	public Teacher(){
		super();
	}
	
	public Teacher(String name, String address, String subject){
		super(name,address);//get from parent class
		this.subject = subject;
	}
	public void Teaching(){
		System.out.println("I can teach" +subject+"so anyone how wants to learn can talk to me");
	}
	
	public void greeting(){
		System.out.println("hello my name is "+getName()+".");
		System.out.println("i come from "+getAddress()+".");
		System.out.println("My job is a "+subject+" teacher.");
	}
	
	public String getSubject(){
		return this.subject;
	}
	
	public void setSubject(String subject){
		this.subject = subject;
	}
}
