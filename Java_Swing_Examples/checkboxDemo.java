import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Locale;

class MyFrame3 extends JFrame implements ActionListener
{
    JCheckBox c1 , c2;
    JRadioButton r1 , r2 ;
    JTextField tf;

    MyFrame3(){
        super("Demo");
        c1 = new JCheckBox("Bold");
        c1.setMnemonic(KeyEvent.VK_B);
        c2 = new JCheckBox("Italic");

        r1 = new JRadioButton("lower");
        r2 = new JRadioButton("upper");

        tf = new JTextField("Demo Text" , 20);
        tf.setBounds(10 ,20 ,100 ,80);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        c1.addActionListener(this);
        c2.addActionListener(this);
        r1.addActionListener(this);
        r2.addActionListener(this);

        setLayout(new FlowLayout());

        add(tf);
        add(c1);
        add(c2);
        add(r1);
        add(r2);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()){
            case "lower" : tf.setText(tf.getText().toLowerCase()); break;
            case "upper" : tf.setText(tf.getText().toUpperCase()); break;

        }
        int b = 0 , i = 0;
        if (c1.isSelected()) b = Font.BOLD;
        if (c2.isSelected()) i = Font.ITALIC;
        Font f = new Font("Times New Roman" , b | i , 15);
        tf.setFont(f);
    }
}
public class checkboxDemo {


    public static void main(String[] args) {
        MyFrame3 mf = new MyFrame3();
        mf.setSize(500 , 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}
