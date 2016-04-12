package inheritance.model;

import java.util.ArrayList;
/**
 * 
 * @author Rory Baker, Nick Haynes, Emily Orton, Sydney Nemelka
 *
 */
public interface Food
{	
	boolean isCheezy(ArrayList<String> ingredients);
	
	boolean isHealthy(ArrayList<String> ingredients);
	
	boolean isSpicy(ArrayList<String> ingredients);
	
	int calorieCounter(int calories);
	
	int deliciousness(int criticRating);
}
