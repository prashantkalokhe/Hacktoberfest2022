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
