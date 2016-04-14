package inheritance.controller;

import java.util.ArrayList;

import inheritance.model.Food;
import inheritance.view.PizzaFrame;

public class PizzaController
{
	
	private ArrayList<Food> foods;
	private PizzaFrame pFrame;
	
	public PizzaController()
	{
		pFrame = new PizzaFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void swap(int firstLocation, int secondLocation)
	{
		Food temp = foods.get(firstLocation);
		foods.set(firstLocation, foods.get(secondLocation));
		foods.set(secondLocation, temp);
	}
	
	public void insertionSort()
	{
		for(int outerLoop = 1; outerLoop < foods.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop > 0 && (foods.get(innerLoop-1).compareTo(foods.get(innerLoop))) > 0)
			{
				swap(innerLoop, innerLoop-1);
				innerLoop--;
			}
		}
	}
	
	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint= partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	private int partition(int low, int high)
	{
		int position = low;
		Food pivot = foods.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(foods.get(spot).compareTo(pivot) <= 0)
			{
				swap(position, spot);
				position++;
			}
		}
		swap(position, high);
		
		return position;
	}
}

