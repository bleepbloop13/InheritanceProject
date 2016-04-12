package inheritance.model;

import java.util.ArrayList;

public class SHINee extends Kpop 
{

	public SHINee()
	{
		this.criticRating = 100;
		this.setNumberOfMembers(5.0);
		this.setTypesOfConcepts(getSHINeeConcepts());
		this.setCatchy(true);
	}

	private ArrayList<String> getSHINeeConcepts()
	{
		ArrayList<String> concepts = new ArrayList<String>();
		
		concepts.add("Retro");
		concepts.add("Futuristic");
		concepts.add("Illusions");
		
		return concepts;
		
	}
	
	@Override
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		return false;
	}
	
	@Override
	public boolean isSpicy(ArrayList<String> ingredients)
	{
		return true;
	}
	
	@Override
	public boolean isHealthy(ArrayList<String> ingredients)
	{
		return false;
	}
	
	@Override
	public int calorieCounter(int calories)
	{
		return 0;
	}
	
	@Override
	public int deliciousness(int criticRating)
	{
		return criticRating;
	}

}
