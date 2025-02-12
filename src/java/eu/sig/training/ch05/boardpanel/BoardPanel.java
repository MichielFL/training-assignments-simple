package eu.sig.training.ch05.boardpanel;

import java.awt.*;
import java.util.List;

public class BoardPanel {
    private Square square;

    public BoardPanel(Square square) {
        this.square = square;
    }

    /**
     * Renders a single square on the given graphics context on the specified
     * rectangle.
     *
     * @param g
     *            The graphics context to draw on.
     * @param rectangle
     *            The rectangle on which the graphic is rendered.
     */
    private void render(Graphics g, Rectangle rectangle) {
        square.getSprite().draw(g, rectangle);
        assert square.getOccupants() != null;
        for (Unit unit : square.getOccupants()) {
            unit.getSprite().draw(g, rectangle);
        }
    }

    private class Sprite {
        @SuppressWarnings("unused")
        public void draw(Graphics g, Rectangle rectangle) {

        }
    }

    private class Unit {
        public Sprite getSprite() {
            return null;
        }
    }

    private class Square extends Unit {

        public List<Unit> getOccupants() {
            return null;
        }

    }

    private class Rectangle {
        private Point position;
        private int width;
        private int height;

        public Rectangle(Point position, int width, int height) {
            this.position = position;
            this.width = width;
            this.height = height;
        }
    }

}
