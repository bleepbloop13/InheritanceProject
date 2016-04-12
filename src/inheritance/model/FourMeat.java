package inheritance.model;

import java.util.ArrayList;

public class FourMeat extends Pizza
{

	
	public FourMeat()
	{
		super();
		this.criticRating = 4;
		this.setToppings(fourMeatToppings());
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
		if(ingredients.contains("Bacon") != true)
		{
			return true;
		}
		return false;
	}
	
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		return true;
	}
	
	public int deliciousness(int criticRating)
	{
		return criticRating * 2;
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
