import child.Doctor;
import child.Programmer;
import child.Teacher;
import parents.Person;


public class mainApp {
	
	public static void main(String[] args){
	
		Person person1 = new Programmer("Rizky","Bandung,","Net Core");
		Person person2 = new Teacher("Januar","Cimahi","Fisika");
		Person person3 = new Doctor("Eki","Surabaya","Pedistrician");
		
		
		//penggunaan set
		Person person4 = new Person();
		person4.setName("Agus");
		person4.setAddress("Jakarta");

		sayHello(person1);
		sayHello(person2);
		sayHello(person3);
		sayHello(person4);
		
	}
		
	static void sayHello(Person person){
		String message;
		if(person instanceof Programmer){
			Programmer programmer = (Programmer) person;
				message = "Hello, "+programmer.getName()+". Seorang programmer"+programmer.getTechnology()+".";
		}else if(person instanceof Teacher){
			Teacher teacher = (Teacher) person;
			message = "Hello, "+teacher.getName()+". Seorang guru"+teacher.getSubject()+".";
		}else if(person instanceof Doctor){
			Doctor doctor = (Doctor) person;
			message = "Hello, "+doctor.getName()+". Seorang guru"+doctor.getSpecialist()+".";
		}else{
			message = "Hello, "+ person.getName()+".";
		}
		System.out.println(message);
	}
}
