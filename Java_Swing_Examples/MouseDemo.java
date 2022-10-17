
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="MouseDemo.class" width=500 height=500> </applet>
*/

public class MouseDemo extends Applet implements MouseListener,MouseMotionListener
{
	int mx=0,my=0;
	String msg="";
	public void init()
	{
		// setBackground(Color.red);
		// setForeground(Color.blue);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me)
	{
		mx=10;
		my=20;
		msg="you have clicked the mouse";
		repaint();
	}

	public void mousePressed(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="you have pressed the mouse";
		repaint();	
	}

	public void mouseReleased(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		msg="you have Released the mouse";
		repaint();	
	}

	public void mouseEntered(MouseEvent me)
	{
		mx=60;
		my=40;
		msg="mouse is entered into applet";
		repaint();	
	}

	public void mouseExited(MouseEvent me)
	{
		mx=70;
		my=40;
		msg="mouse is exited from applet";
		repaint();	
	}

	public void mouseDragged(MouseEvent me)
	{
		showStatus("mouse is Dragged from ("+me.getX()+","+me.getY()+")");
	}

	public void mouseMoved(MouseEvent me)
	{
		showStatus("mouse is Moved from ("+me.getX()+","+me.getY()+")");
	}

	public void paint(Graphics g)
	{
		g.drawString(msg,mx,my);
	}
	

}
