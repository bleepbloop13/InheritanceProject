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
		sortArea = new JTextArea("The sorted list appears here.");
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
				
			}
		});
	}
}
