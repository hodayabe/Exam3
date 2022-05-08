import java.io.Serializable;
import java.time.LocalDate;

public class Dragon implements Serializable{

	//fields
	private String name;
	private LocalDate birthDate;
	private int flame; //(ranged from 0 to 10)
	
	
	
	//constructor
	public Dragon(String name, LocalDate birthDate, int flame) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.flame = flame;
	}


	//methods

	@Override
	public String toString() {
		return "Dragon [name=" + name + ", birthDate=" + birthDate + ", flame=" + flame + "]";
	}
	
	
	
	
}
