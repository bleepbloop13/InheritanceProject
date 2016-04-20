package inheritance.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import inheritance.controller.PizzaController;

import javax.swing.*;

public class PizzaPanel extends JPanel
{
	private PizzaController baseController;
	private SpringLayout baseLayout;
	private JTextArea sortArea;
	private JButton sortButton;
	

	public PizzaPanel(PizzaController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		sortArea = new JTextArea(baseController.showFoods());
		sortButton = new JButton("Sort objects by rating");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	/**
	 * Loads content into the panel
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(sortArea);
		this.add(sortButton);
	}

	/**
	 * Specifies the location of elements on the panel
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, sortArea, 24, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortArea, 46, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortArea, 216, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, sortArea, 361, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sortButton, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sortButton, -10, SpringLayout.SOUTH, this);
	}

	/**
	 * Sets up the listeners for any buttons
	 */
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				sortArea.setText(baseController.showFoods());
			}
		});
	}
}
