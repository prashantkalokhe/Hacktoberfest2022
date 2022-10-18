import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="KeyDemo.class" width=200 height=200> </applet>
*/

public class KeyDemo extends Applet implements KeyListener
{
	int x=30,y=40;
	String msg="";
	public void init()
	{
		addKeyListener(this);
		requestFocus();
	}

	public void keyPressed(KeyEvent ke)
	{
		showStatus("key is pressed");
	}

	public void keyReleased(KeyEvent ke)
	{
		showStatus("key is Released");
	}

	public void keyTyped(KeyEvent ke)
	{
		char ch = ke.getKeyChar();
		msg+=ch;
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}

}
