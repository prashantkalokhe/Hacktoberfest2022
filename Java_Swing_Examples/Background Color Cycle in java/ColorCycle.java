
import java.awt.*;
import java.awt.event.*;

public class ColorCycle extends Frame implements ActionListener
{
	Button b1;

	ColorCycle(String m)
	{
		setLayout(null);
		
		b1 = new Button("red");	
		b1.setBounds(30,70,80,20);
		add(b1);
		b1.addActionListener(this);
		setSize(500,500);
		setVisible(true);
		setTitle(m);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String msg = ae.getActionCommand();

		if (msg.equals("red")) 
		{	
			setBackground(Color.red);
			b1.setLabel("green");
		}

		if (msg.equals("green")) 
		{
			setBackground(Color.green);	
			b1.setLabel("blue");
		}

		if (msg.equals("blue")) 
		{
			setBackground(Color.blue);
			b1.setLabel("red");
		}
	}

	public static void main(String[] args) 
	{
		ColorCycle c = new ColorCycle("My Color Cycle Frame");	
	}
}