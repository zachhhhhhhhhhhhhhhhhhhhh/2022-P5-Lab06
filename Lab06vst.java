// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet {

    public void paint(Graphics g) {
        // Draw Grid
        g.drawRect(10, 10, 780, 580);
        g.drawLine(400, 10, 400, 590);
        g.drawLine(10, 300, 790, 300);
//box is 800 by 600


        // Draw Random Lines


        Random rand = new Random();

        for (int k = 0; k <= 100; k++) {

            int x1 = rand.nextInt(391) + 10;
            int y1 = rand.nextInt(291) + 10;
            int x2 = rand.nextInt(391) + 10;
            int y2 = rand.nextInt(291) + 10;

            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);

            g.setColor(new Color(red, green, blue));
            g.drawLine(x1, y1, x2, y2);

            // Draw Random Squares
        }
            for (int b = 0; b <= 100; b++) {

                int b1 = rand.nextInt(341) + 400;
                int c1 = rand.nextInt(241) + 10;


                int red = rand.nextInt(255);
                int green = rand.nextInt(255);
                int blue = rand.nextInt(255);

                g.setColor(new Color(red,green,blue));
                g.fillRect(b1, c1, 50, 50);
            }
                // Draw Random Circles
                for (int c = 0; c <=100; c++) {
                    int circle = rand.nextInt(200);
                    int x = rand.nextInt(391-circle) + 10;
                    int y = rand.nextInt(291-circle) + 300;


                    int red = rand.nextInt(255);
                    int green = rand.nextInt(255);
                    int blue = rand.nextInt(255);

                    g.setColor(new Color(red,green,blue));
                    g.drawOval(x, y, circle, circle);
                }
                // Draw 3-D Box



                Polygon cube = new Polygon();
                cube.addPoint(750, 450);
                cube.addPoint(525, 825);
                cube.addPoint(750, 450);
                g.fillPolygon(cube);



    }
}


    
 