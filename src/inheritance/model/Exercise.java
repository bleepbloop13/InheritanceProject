package inheritance.model;

import java.util.ArrayList;

public abstract class Exercise implements Food
{
	private ArrayList<String> workouts;
	private int sets;
	private int reps;
	public int calories;
	public int criticRating;
	
	public ArrayList<String> getWorkouts()
	{
		return workouts;
	}
	public void setWorkouts(ArrayList<String> workouts)
	{
		this.workouts = workouts;
	}
	public int getSets()
	{
		return sets;
	}
	public void setSets(int sets)
	{
		this.sets = sets;
	}
	public int getReps()
	{
		return reps;
	}
	public void setReps(int reps)
	{
		this.reps = reps;
	}
	public String toString()
	{
		String excersizeDescription = "this is a excersise object of type" + this.getClass().getName() + " and has " + getReps() + "reps";
		return excersizeDescription;
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
