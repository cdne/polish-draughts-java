package com.game;
import java.awt.Color;

class Pawn {
    Coordinates coordinates;

    Pawn() {
        coordinates = new Coordinates();
    }

    Color getColor() {
        return new Color(0,0,0);
    }

    boolean isCrowned() {
        return false;
    }


}
