package cap13;

import cap3.Hobbits;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPanel {

    public static void main(String[] args) {
        FlowLayoutPanel gui = new FlowLayoutPanel();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button = new JButton("shock me");
        JButton button1 = new JButton("bliss");
        JButton button2 = new JButton("huh?");
        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }
}
