
public class tuna {
	//public variables, any class can use this variable
	//private variables, only the methods within this class can use it 
	private String girlName;
	public void setName(String name) {
		girlName = name;
		
	}
	public String getName() {
		return girlName;
	}
	public void saying() {
		//printf supports string interpolation
		System.out.printf("Your gf is %s", getName());
	}
}
