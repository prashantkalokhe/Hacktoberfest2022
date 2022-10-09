import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

class MyFrame5 extends JFrame implements TreeSelectionListener
{
    JTree tree;
    JLabel l;
    
    MyFrame5()
    {
        super("Demo");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\xampp");
        File f =new File("C:\\xampp");

        for (File x : f.listFiles()){

            if (x.isDirectory()){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for (File y : x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(y.getName()));

                }
                root.add(temp);


            }else
            root.add(new DefaultMutableTreeNode(x.getName()));

        }

        l = new JLabel("No File Selected");
        tree = new JTree(root);
        tree.addTreeSelectionListener(this);
        JScrollPane sp = new JScrollPane(tree);

        add(sp , BorderLayout.CENTER);
        add(l , BorderLayout.SOUTH);

    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
       l.setText(e.getPath().toString());
    }
}

public class treeDemo {

    public static void main(String[] args) {
        MyFrame5 mf = new MyFrame5();
        mf.setSize(500 , 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    
}
