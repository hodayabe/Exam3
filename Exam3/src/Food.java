

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.time.LocalDate;

public class Food implements Serializable{

	//fields
	private String name;
	private Taste taste;
	private MacronutrientsCategory catagory;
	
	
	//constructor
	public Food(String name, Taste taste, MacronutrientsCategory catagory) {
		super();
		this.name = name;
		this.taste = taste;
		this.catagory = catagory;
	}


	
	
	
	public boolean isDesert() {
		if( this.taste != Taste.SWEET || this.catagory != MacronutrientsCategory.CARBOHYDRATE)
			return false;
			
			return true;
	}
	

	
	public void setBirthDate(LocalDate date) {
		
	}
	
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", taste=" + taste + ", catagory=" + catagory + "]";
	}
	
	
	
}
