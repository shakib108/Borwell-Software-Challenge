package com.mycompany.app;

public class PaintCalc {

    public static float area(float length, float width)
    {
        return length * width;
    }

    public static float surfaceArea(float length, float width, float height)
    {
        float longWalls = 2 * (length * height);
        float shortWalls = 2 * (width * height);

        return longWalls + shortWalls;
    }

    public static float volume(float length, float width, float height)
    {

        return 0;
    }


    public static void main(String[] args)
    {

    }
}