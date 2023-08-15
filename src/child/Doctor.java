package child;
import parents.Person;


public class Doctor extends Person {
	private String specialist;
	
	public Doctor(){
		super();
	}

	public Doctor(String name, String address, String specialist){
		super(name,address);//get from parent class
		this.specialist = specialist;
	}
	
	public void surgery(){
		System.out.println("I can surgery operation patients");
	}
	
	public void greeting(){
		System.out.println("hello my name is "+ getName() +".");
		System.out.println("i come from "+ getAddress() +".");
		System.out.println("My job is a "+specialist+" doctor.");
	}
	
	//setter and getter
	public String getSpecialist(){
		return this.specialist;
	}
	public void setSpecialist(String specialist){
		this.specialist = specialist;
	}
	
}
