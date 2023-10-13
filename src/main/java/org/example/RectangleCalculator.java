package org.example;

public class RectangleCalculator {

    public int area (int length, int width) {
        return length * width;
    }

    public int perimeter (int length, int width) {
        return (length + width) * 2;
    }

    public boolean isTriangle(int a, int b, int c) {
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            return true;
        }
        else {
            return false;
        }
    }
}
