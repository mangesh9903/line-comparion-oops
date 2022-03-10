package com.bridgelabz.model;

public class Coordinates {
    private final int startOfX , endOfX;
    private final int startOfY , endOfY;

    public Coordinates(int startOfX, int endOfX, int startOfY, int endOfY) {
        this.startOfX = startOfX;
        this.endOfX = endOfX;
        this.startOfY = startOfY;
        this.endOfY = endOfY;
    }


    public int getStartOfX() {
        return startOfX;
    }

    public int getEndOfX() {
        return endOfX;
    }

    public int getStartOfY() {
        return startOfY;
    }

    public int getEndOfY() {
        return endOfY;
    }
}
