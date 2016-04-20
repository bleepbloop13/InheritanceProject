package inheritance.model;

import java.util.ArrayList;

public class Panini extends Sandwich
{
	private int Calories;
	private int criticRating;
	private String name;
	private ArrayList<String> containsList;
	public Panini()
	{
		this.setNumberOfCalories(576);
		this.setMainIngrediant("Chicken");
		this.setCold(false);
		containsList = new ArrayList<String>();
		setupContainsList();
		Calories = numberOfCalories;
		criticRating = 4;
		name = "Panini";
	}
private void setupContainsList()
{
	containsList.add("Flat Bread");
	containsList.add("Cheddar Cheese");
	containsList.add("Turkey");
	containsList.add("Health Crap");
}
	@Override
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		boolean isCheesey = false;
		if(containsList.contains("Cheese"))
		{
			isCheesey = true;
		}
		return isCheesey;
	}

	@Override
	public boolean isSpicy(ArrayList<String> ingredients)
	{
		boolean isSpicey = false;
		if(containsList.contains("Spice"))
		{
			isSpicey = true;
		}
		return isSpicey;
	}

	@Override
	public boolean isHealthy(ArrayList<String> ingredients)
	{
		boolean isHealthy = false;
		if(containsList.contains("Health Crap"))
		{
			isHealthy = true;
		}
		return isHealthy;
	}

	@Override
	public int calorieCounter(int Calories)
	{
		return this.Calories;
	}

	@Override
	public int deliciousness(int stars)
	{
	return stars * 2;	
	}

	public ArrayList<String> getContainsList()
	{
		return containsList;
	}

	public void setContainsList(ArrayList<String> containsList)
	{
		this.containsList = containsList;
	}
	@Override
	public int compareTo(Object thing)
	{
		// TODO Auto-generated method stub
		return 0;
	}
	public int getCalories()
	{
		return Calories;
	}
	public void setCalories(int calories)
	{
		Calories = calories;
	}
	public int getCriticRating()
	{
		return criticRating;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}
