package eu.sig.training.ch03;

import java.awt.*;

public enum Nationality {
    DUTCH(Color.RED, Color.WHITE, Color.BLUE),
    GERMAN(Color.BLACK, Color.RED, Color.YELLOW),
    BELGIAN(Color.BLACK, Color.YELLOW, Color.RED),
    LUXEMBOURGER(Color.RED, Color.WHITE, Color.BLUE),
    FRENCH(Color.BLUE, Color.WHITE, Color.RED),
    ITALIAN(Color.GREEN, Color.WHITE, Color.RED),
    ROMANIA(Color.BLUE, Color.YELLOW, Color.RED),
    IRELAND(Color.GREEN, Color.WHITE, Color.ORANGE),
    HUNGARIAN(Color.RED, Color.WHITE, Color.GREEN),
    BULGARIAN(Color.WHITE, Color.GREEN, Color.RED),
    RUSSIA(Color.WHITE, Color.BLUE, Color.RED),
    UNCLASSIFIED(Color.GRAY);

    private Flag flag;

    Nationality(Color...colors) {
        this.flag = new Flag(colors);
    }

    public Flag getFlag() {
        return flag;
    }
}