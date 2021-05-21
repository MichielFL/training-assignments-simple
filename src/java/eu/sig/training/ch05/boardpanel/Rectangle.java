package eu.sig.training.ch05.boardpanel;

import java.awt.*;

/**
 * @author Michiel Flinkenflögel
 * @version 1.1 21-5-2021
 */
public class Rectangle {
    private Point position;
    private int width;
    private int height;

    public Rectangle(Point position, int width, int height) {
        this.position = position;
        this.width = width;
        this.height = height;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
