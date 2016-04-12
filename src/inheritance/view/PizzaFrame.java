package inheritance.view;

import javax.swing.JFrame;

import inheritance.controller.PizzaController;
import inheritance.view.PizzaPanel;

public class PizzaFrame extends JFrame
{
	private PizzaController baseController;
	private PizzaPanel basePanel;

	public PizzaFrame(PizzaController baseController)
	{
		this.baseController = baseController; // Assign parameter to data member.
		basePanel = new PizzaPanel(baseController); // Creates an instance of the GUIPanel with a reference to the controller.
		setupFrame();
	}
	/**
	 * Helper method to setup the Frame and its structure.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel); // Sets the panel in the GUIFrame, this is REQUIRED!!!
		this.setResizable(false); // Usually a good idea, but not required.
		this.setSize(400, 400); // Sets the size.
		this.setVisible(true); // Always must be the last line of code in setupFrame method.
	}
	
	public PizzaController getBaseController()
	{
		return baseController;
	}
}
