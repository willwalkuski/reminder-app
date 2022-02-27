package classes;

import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {

    private HeaderBar headerBar;
    private ButtonBar buttonBar;
    private List list;

    // Constructor
    AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        //this.setBackground(Color.black);

        headerBar = new HeaderBar();
        buttonBar = new ButtonBar();
        list = new List();
        this.add(headerBar, BorderLayout.NORTH);
    }

}
