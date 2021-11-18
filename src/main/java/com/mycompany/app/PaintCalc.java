package com.mycompany.app;

/**
 Class that contains functions to calculate various properties of a room.
 Assumptions: Room is a simple rectangular prism
 */
public class PaintCalc {

    /**
     * Calculate area of the room's floor
     * @param length of room
     * @param width of room
     * @return area of floor
     */
    public static float area(float length, float width)
    {
        return length * width;
    }

    /**
     * Calculate surface area of the walls of the room.
     * @param length of room
     * @param width of room
     * @param height of room
     * @return surface area of walls
     */
    public static float surfaceArea(float length, float width, float height)
    {
        float longWalls = 2 * (length * height);
        float shortWalls = 2 * (width * height);

        return longWalls + shortWalls;
    }

    /**
     * Calculate volume of the room
     * @param length of room
     * @param width of room
     * @param height of room
     * @return volume of room
     */
    public static float volume(float length, float width, float height)
    {
        return length * width * height;
    }


    public static void main(String[] args)
    {

    }
}