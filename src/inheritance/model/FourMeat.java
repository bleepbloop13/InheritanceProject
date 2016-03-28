package inheritance.model;

import java.util.ArrayList;

public class FourMeat extends Pizza
{
	public FourMeat()
	{
		super();
		this.setToppings(fourMeatToppings());
	}
	
	private ArrayList<String> fourMeatToppings()
	{
		ArrayList<String> toppings = new ArrayList<String>();
		
		toppings.add("Bacon");
		toppings.add("Italian Sausage");
		toppings.add("Pepperoni");
		toppings.add("Ham");
		
		return toppings;
	}
}
