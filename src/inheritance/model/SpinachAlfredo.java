package inheritance.model;

import java.util.ArrayList;

public class SpinachAlfredo extends Pizza
{
	public SpinachAlfredo()
	{
		super();
		this.setCheese("Parmesan");
		this.setSauce("Alfredo");
		this.setToppings(spinachAlfredoToppings());
	}
	
	private ArrayList<String> spinachAlfredoToppings()
	{
		ArrayList<String> toppings = new ArrayList<String>();
		
		toppings.add("Spinach");
		toppings.add("Bowtie Noodles");
		
		return toppings;
	}

}
