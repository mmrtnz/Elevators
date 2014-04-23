
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class InputPanel extends JPanel
{
	private final int WIDTH  = (int)(GUI.WIDTH*0.25);
	private final int HEIGHT = (int)(GUI.HEIGHT*1);
	
	public InputPanel()
	{
		this.setBackground(new Color(90,50,200));
		this.setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
		
		this.setLayout(new GridLayout(2,1));
		this.add(new CounterWidget("FLOORS"));
		this.add(new CounterWidget("ELEVATORS"));
	}
}

// A counter widget has two buttons allowing the user to increase or 
// decrease a value. 
class CounterWidget extends JPanel
{
	// Used for formatting components
	private GridBagConstraints gbc;
	
	public CounterWidget(String title)
	{
		// Setting layout
		setLayout(new GridBagLayout());
		gbc = new GridBagConstraints();
		
		modifyGBC(0,0,3,1);
		add(new JButton(title), gbc);

		modifyGBC(0,1,1,1);
		add(new JButton("-"), gbc);

		modifyGBC(1,1,1,1);
		add(new JButton("0"), gbc);

		modifyGBC(2,1,1,1);
		add(new JButton("+"), gbc);
	}
	
	// Handles repetitive methods calls to GridBagConstraints variable
	private void modifyGBC(int x, int y, int width, int height)
	{
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		
		//if (width > 1 && height > 1)
		//	gbc.fill = GridBagConstraints.BOTH;
		//else if (width > 1 && height == 1)
			gbc.fill = GridBagConstraints.HORIZONTAL;
		//else if (height > 1 && width == 1)
		//	gbc.fill = GridBagConstraints.VERTICAL;
		//else
		//	gbc.fill = GridBagConstraints.HORIZONTAL;
	}
}