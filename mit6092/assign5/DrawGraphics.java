package graphk;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;
    BouncingBox box1, box2, box3;
    ArrayList<BouncingBox> boxes2 = new ArrayList<BouncingBox>();


    /** Initializes this class for drawing. */
    public DrawGraphics() {
        boxes2.add(new BouncingBox(200, 50, Color.BLUE));
        boxes2.add(new BouncingBox(600, 40, Color.RED));
        box1 = new BouncingBox(100, 250, Color.BLACK);
        box1.setMovementVector(1, 0);

        box2 = new BouncingBox(47, 78, Color.BLUE);
        box2.setMovementVector(3, 2);

        box3 = new BouncingBox(47, 78, Color.RED);
        box3.setMovementVector(1, 2);

        boxes = new ArrayList<BouncingBox>();
        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {

        // Add three different shapes
        surface.drawLine(100, 50, 150, 250);
        surface.drawLine(250, 50, 50, 250);
        surface.drawArc(15, 80, 150, 60, 4, 100);

        // Drawing bouncing box
        for (BouncingBox box : boxes) {
            box.draw(surface);
        }
    }
}
