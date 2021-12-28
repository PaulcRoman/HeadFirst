package cap13;

import javax.swing.*;
import java.awt.*;

//Border layout (Est, West, North, South, Center)

public class BorderLayoutPanel {

    public static void main(String[] args) {

        BorderLayoutPanel gui = new BorderLayoutPanel();
        gui.go();

    }

    public void go(){
        JFrame frame = new JFrame();
        JButton east = new JButton("East");
        JButton west = new JButton("West");
        JButton north = new JButton("North");
        JButton south = new JButton("South");
        JButton center = new JButton("Center");

        frame.getContentPane().add(BorderLayout.EAST,east);
        frame.getContentPane().add(BorderLayout.WEST,west);
        frame.getContentPane().add(BorderLayout.NORTH,north);
        frame.getContentPane().add(BorderLayout.SOUTH,south);
        frame.getContentPane().add(BorderLayout.CENTER,center);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
