package inheritance.model;

import java.util.ArrayList;

public class SpinachAlfredo extends Pizza
{
	public SpinachAlfredo()
	{
		super();
		this.criticRating = 3;
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
	

	public int calorieCounter(int calories)
	{
		return calories * 10;
	}
	
	public boolean isSpicy(ArrayList<String> ingredients)
	{
		for(String ingredient : ingredients)
		{
			for(String topping : getToppings())
			{
				if(ingredient.equalsIgnoreCase(topping))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean isHealthy(ArrayList<String> ingredients)
	{
		return true;
	}
	
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		return true;
	}
	
	public int deliciousness(int criticRating)
	{
		return criticRating * 2;
	}

}
