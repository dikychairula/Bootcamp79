package child;
import parents.Person;


public class Programmer extends Person{
	private String technology;
	
	public Programmer(){
		super();
	}
	
	public Programmer(String name, String address, String technology){
		super(name,address);//get from parent class
		this.technology = technology;
	}
	
	public void hacking(){
		System.out.println("I can hack a website");
	}
	
	public void coding(){
		System.out.println("I can create a appliacation using technolohy :"+technology+".");
	}
	
	public void greeting(){
		System.out.println("hello my name is "+ getName()+".");
		System.out.println("i come from "+getAddress()+".");
		System.out.println("My job is a "+technology+" programmer.");
	}
	
	public String getTechnology(){
		return this.technology;
	}
	
	public void setTechnology(String technology){
		this.technology = technology;
	}
}
