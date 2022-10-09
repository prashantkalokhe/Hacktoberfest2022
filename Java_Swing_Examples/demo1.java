
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JLabel l;
    JButton b;
    int count = 0;


    MyFrame(){
        super("Swing Demo 1");
        l = new JLabel("Clicked " + count + " Times");
        b = new JButton("Click Me");
        add(l);
        add(b);
        //getRootPane().setDefaultButton(b);
        b.addActionListener(this);
        //b.setIcon(new ImageIcon("C:\\Users\\viktor\\Downloads\\email.png"));
        l.setToolTipText("broo");
        setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        count++;
        l.setText("Clicked " + count + " Times");

    }
}

public class demo1 {


    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
        mf.setSize(500 , 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
