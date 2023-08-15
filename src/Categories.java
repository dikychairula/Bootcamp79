
public class Categories {
	private int id;
	private String name;
	private boolean expensive;
	
	public Categories(int id, String name, boolean expensive){
		super();
		this.id = id;
		this.name = name;
		this.expensive = expensive;
	}
	
	public Categories(){
		super();
	}
	
	//Contoh Getter dan Setter tipe data boolean
	
	public boolean isExpensive(){
		return this.expensive;
	}
	
	public void setExpensive(boolean expensive){
		this.expensive = expensive;
	}
	
	//Tipe data Object
	//Getter
	public String getName(String name){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}	
	
	//tipe data primitif(integer)
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
}
