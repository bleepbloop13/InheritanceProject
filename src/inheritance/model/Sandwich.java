package inheritance.model;

public abstract class Sandwich implements Food
{
 public int numberOfCalories;
 private String mainIngredient;
 private boolean isCold;
 
 
public int getNumberOfCalories()
{
	return numberOfCalories;
}
public void setNumberOfCalories(int numberOfCalories)
{
	this.numberOfCalories = numberOfCalories;
}
public String getMainIngredient()
{
	return mainIngredient;
}
public void setMainIngrediant(String mainIngredient)
{
	this.mainIngredient = mainIngredient;
}
public boolean getisCold()
{
	return isCold;
}
public void setCold(boolean isCold)
{
	this.isCold = isCold;
}
public int compareTo(Object compared)
{
	int comparedValue = Integer.MIN_VALUE;
	if(compared instanceof Food)
	{
		if(this.calorieCounter(this.numberOfCalories) < ((Food) compared).calorieCounter(this.numberOfCalories)) 
		{
			comparedValue = -1;
		}
		else if(this.calorieCounter(this.numberOfCalories)> ((Food) compared).calorieCounter(this.numberOfCalories))
		{
			comparedValue = 1;
		}
	}
	return comparedValue;
}

public String toString()
{
	String sandwitchDescription = "This sandwich is " + getMainIngredient() + "and is cold" + getisCold() + "and has " + getNumberOfCalories() +" Calories ";
	return sandwitchDescription;
}
}