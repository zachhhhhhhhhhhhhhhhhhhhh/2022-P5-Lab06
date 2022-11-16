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
            System.out.println(rand.nextInt(390)+10);
            int x1 = rand.nextInt(390);
            int y1 = rand.nextInt(290);
            int x2 = rand.nextInt(390);
            int y2 = rand.nextInt(290);

            g.drawLine(x1, y1, x2,y2);

            // Draw Random Squares

            // Draw Random Circles


            // Draw 3-D Box


        }

    }
}


    
 