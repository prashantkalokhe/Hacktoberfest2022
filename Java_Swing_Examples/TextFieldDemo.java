import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

class MyFrame2  extends JFrame{
    JFormattedTextField tf , tf2 , tf3;

    MyFrame2(){
        super("Demo");
        DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");
        tf = new JFormattedTextField(df);
        tf.setValue(0);
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        tf2 = new JFormattedTextField(nft);
        tf2.setColumns(15);
        add(tf);
        add(tf2);
        setLayout(new FlowLayout());
    }
}

public class TextFieldDemo {


    public static void main(String[] args) {
        MyFrame2 mf = new MyFrame2();
        mf.setSize(500 , 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
