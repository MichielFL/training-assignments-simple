package eu.sig.training.ch03;

import java.awt.Color;
import java.util.List;

public class FlagFactory {

    public List<Color> getFlagColors(Nationality nationality) {
        Flag flag = nationality.getFlag();
        return flag.getColors();
    }

}