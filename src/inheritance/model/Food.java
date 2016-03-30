package inheritance.model;

import java.util.ArrayList;

public interface Food
{
	public boolean isCheezy(ArrayList<String> ingredients);
	
	public boolean isHealthy(ArrayList<String> ingredients);
	
	public boolean isSpicy(ArrayList<String> ingredients);
	
	public int calorieCounter(int calories);
	
	public int deliciousness(int criticRating);
}
