import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

class MyFrame4 extends JFrame
{

 JLabel l;
 JTextField tf;
 JButton b;
 JPanel p;

 MyFrame4(){

   l = new JLabel("Name");
   tf = new JTextField(20);
   p = new JPanel();
   b = new JButton("Save");
   p.add(l);
   p.add(tf);
   p.add(b);

  Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.YELLOW) , "Login" , TitledBorder.CENTER , TitledBorder.CENTER);
  p.setBorder(br);

   setLayout(new FlowLayout());
   add(p);
 }
}

public class borderDemo {
 public static void main(String[] args) {
  MyFrame4 mf = new MyFrame4();
  mf.setSize(500 , 500);
  mf.setVisible(true);
  mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

 }
}
