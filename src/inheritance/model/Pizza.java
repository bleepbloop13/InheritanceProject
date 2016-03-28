package inheritance.model;

import java.util.ArrayList;

public abstract class Pizza
{
	private ArrayList<String> toppings;
	private String sauce;
	private String cheese;
	
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
}
