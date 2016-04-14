package inheritance.model;

import java.util.ArrayList;

public abstract class Pizza implements Food
{
	private ArrayList<String> toppings;
	private String sauce;
	private String cheese;
	public int criticRating;
	
	public Pizza()
	{
		this.toppings.add("None");
		this.sauce = "Marinara";
		this.cheese = "Mozzarella";
	}
	
	
	public ArrayList<String> getToppings()
	{
		return toppings;
	}
	public void setToppings(ArrayList<String> toppings)
	{
		this.toppings = toppings;
	}
	public String getSauce()
	{
		return sauce;
	}
	public void setSauce(String sauce)
	{
		this.sauce = sauce;
	}
	public String getCheese()
	{
		return cheese;
	}
	public void setCheese(String cheese)
	{
		this.cheese = cheese;
	}
	
	public String toString()
	{
		String pizzaDescription = "This is a Pizza Object of type " + this.getClass().getName() + " and has a Cheese of type " + getCheese();
		
		return pizzaDescription;
	}
	
	public int compareTo(Object compared)
	{
		int comparedValue = Integer.MIN_VALUE;
		
		if(compared instanceof Food)
		{
			if(this.deliciousness(this.criticRating) < ((Food) compared).deliciousness(this.criticRating))
			{
				comparedValue = -1;
			}
			else if(this.deliciousness(this.criticRating) > ((Food) compared).deliciousness(this.criticRating))
			{
				comparedValue = 1;
			}
			else
			{
				comparedValue = 0;
			}
		}
		return comparedValue;
	}
}
