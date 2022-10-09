import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class MyFrame9 extends JFrame implements ListSelectionListener {

    JSplitPane sp;
    JList list;
    JLabel lbl;

    MyFrame9(){
        String[] colors = {"RED" , "GREEN" , "BLUE" , "MAGENTA" , "ORANGE" , "BLACK"};
        list = new JList(colors);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane sp1 = new JScrollPane(list);

        lbl = new JLabel("  ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        JScrollPane sp2 = new JScrollPane(lbl);

       JTabbedPane tp = new JTabbedPane();
       tp.addTab("Colors" , sp1);
       tp.addTab("Label" , sp2);
       add(tp);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String str = (String)list.getSelectedValue();
        switch (str){
            case "RED" : lbl.setBackground(Color.red);
                break;
            case "GREEN" : lbl.setBackground(Color.green);
                break;
            case "BLUE" : lbl.setBackground(Color.blue);
                break;
            case "MAGENTA" : lbl.setBackground(Color.magenta);
                break;
            case "ORANGE" : lbl.setBackground(Color.orange);
                break;
            case "BLACK" : lbl.setBackground(Color.black);
                break;

        }
    }
}
public class TabbedPaneDemo {

    public static void main(String[] args) {
        MyFrame9 mf = new MyFrame9();
        mf.setSize(800 , 800);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
