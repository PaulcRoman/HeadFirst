package cap12;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {

    public void paintComponent(Graphics g){

        g.setColor(Color.orange);

        g.fillRect(20, 50, 100, 100);

    }

    public void paintComponent1(Graphics g){ //metoda pt imagini

        Image image = new ImageIcon("catzila.jpeg").getImage();

        g.drawImage(image, 3, 4,this);
    }

    public void paintComponent2(Graphics g){  //metoda pentru un cerc pe background negru

        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red = (int) (Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);

        Color randomColor = new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);

    }

    public void paintCompenent3(Graphics g){  //metoda pentru un cerc gradient blend

        Graphics2D g2d =  (Graphics2D) g;

        GradientPaint gradientPaint = new GradientPaint(70,70,Color.blue,150,150,Color.orange);

        g2d.fillOval(70,70,100,100);

    }

    public void paintComponent4(Graphics g){

        Graphics2D g2d = (Graphics2D) g;

        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        Color startColor = new Color(red,green,blue);

        red = (int)(Math.random()*256);
        green = (int)(Math.random()*256);
        blue = (int)(Math.random()*256);
        Color endColor = new Color(red,green,blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor,150,150,endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70,70,100,100);
    }


}
