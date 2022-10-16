import java.awt.*;
import javax.swing.*;
public class tiranga {
	public static void main(String args[]) {
		JFrame f =new JFrame("India");
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,600,120);
		p1.setBackground(Color.orange);
		
		JPanel p2 = new JPanel();
		p2.setBounds(0,120,600,120);
		p2.setBackground(Color.white);
		
		JPanel p3 = new JPanel();
		p3.setBounds(0,230,600,140);
		p3.setBackground(Color.green);
		
		JLabel b = new JLabel(
				new ImageIcon(
						"D:\\ac.png"));
		p2.add(b);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.setSize(600,410);
		f.setSize(600,410);
		f.setLayout(null);
		f.setVisible(true);
	}

}

package AWTP;

import java.applet.*;
import java.awt.*;
public class Flag extends Applet
{
    @Override
public void paint(Graphics g)
{
g.fillOval(60,450,120,50);
g.fillRect(110,60,10,400);
g.setColor(Color.red);
g.fillRect(120,80,150,30);
g.setColor(Color.white);
g.fillRect(120,110,150,30);
g.setColor(Color.green);
g.fillRect(120,140,150,30);
g.setColor(Color.black);
g.drawRect(120,80,150,90);
g.setColor(Color.blue);

g.drawOval(180,110,30,30);
int t=0;
int x=195,y=125;
double x1,y1;
double r=15;
double d;
for(int i=1;i<=24;i++)
{
d=(double)t*3.14/180.0;
x1=x+(double)r*Math.cos(d);
y1=y+(double)r*Math.sin(d);
g.drawLine(x,y,(int)x1,(int)y1);
t+=360/24;
}
}
}

