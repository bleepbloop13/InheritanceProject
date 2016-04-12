 package inheritance.model;

import java.util.ArrayList;

public class FreeWeights extends Exercise
{
	public FreeWeights()
	{
		this.criticRating = 0;
		
		this.setSets(3);
		this.setReps(18);
		
		this.setWorkouts(getFreeWeightWorkouts());
		
		
	}
	private ArrayList<String> getFreeWeightWorkouts()
	{
		ArrayList<String> workouts = new ArrayList<String>();
		
		workouts.add("Bench Press");
		workouts.add("hammer curls");
		workouts.add("Squats");
		workouts.add("Tire Rolls");
		
		return workouts;
	}
	@Override
	public boolean isCheezy(ArrayList<String> ingredients)
	{
		
		return false;
	}
	@Override
	public boolean isSpicy(ArrayList<String> ingredients)
	{
		
		return false;
	}
	@Override
	public boolean isHealthy(ArrayList<String> ingredients)
	{
		
		return false;
	}
	@Override
	public int calorieCounter(int calories)
	{
		
		return -5000;
	}
	@Override
	public int deliciousness(int criticRating)
	{
		
		return criticRating;
	}
	

}
