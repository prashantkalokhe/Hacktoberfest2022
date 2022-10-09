import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;


class MyFrame10 extends JFrame implements ChangeListener {

    JSlider sl;
    JPanel p1 , p2;
    JProgressBar pb;
int w =50;
    MyFrame10(){
        sl = new JSlider(0 , 100 , 50);
        sl.setMajorTickSpacing(10);
        sl.setMinorTickSpacing(1);
        sl.setPaintTicks(true);
        sl.setPaintLabels(true);
        sl.addChangeListener(this);

        pb = new JProgressBar();
        pb.setString("50%");
        pb.setStringPainted(true);
        pb.setIndeterminate(true);

        p1 = new JPanel(){
            @Override
            public void paintComponent(Graphics g) {
                g.drawOval(100 , 100 , w , w);
            }
        };

        p2 = new JPanel();
        p2.add(pb);

        add(sl , BorderLayout.NORTH);
        add(p1 , BorderLayout.CENTER);
        add(p2 ,BorderLayout.SOUTH);



    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w = sl.getValue();
        p1.repaint();
        pb.setString(w +"%");
        pb.setIndeterminate(false);
        pb.setValue(w);
        pb.setStringPainted(true);

    }
}


public class SliderDemo {
    public static void main(String[] args) {
        MyFrame10 mf = new MyFrame10();
        mf.setSize(500 , 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
