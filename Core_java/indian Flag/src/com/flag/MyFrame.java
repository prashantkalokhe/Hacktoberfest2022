package com.flag;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame { 
	private FlagPanel panel=new FlagPanel();

public MyFrame() throws HeadlessException {
	setTitle("Happy 75th Independence Day !!");
	setSize(440,600); 
	setLocationRelativeTo(null); 
	setDefaultCloseOperation (EXIT_ON_CLOSE);

    add(panel);
    setVisible(true);
}
}
