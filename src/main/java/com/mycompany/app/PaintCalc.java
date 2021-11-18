package com.mycompany.app;

import java.util.Scanner;

/**
 Class that contains functions to calculate various properties of a room.
 Assumptions: Room is a simple rectangular prism
 */
public class PaintCalc {

    public static float length;
    public static float width;
    public static float height;

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
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter room length: ");
                String l = scanner.nextLine();
                length = Float.parseFloat(l);

                System.out.print("Enter room width: ");
                String w = scanner.nextLine();
                width = Float.parseFloat(w);

                System.out.print("Enter room height: ");
                String h = scanner.nextLine();
                height = Float.parseFloat(h);

                if (length <= 0 || width <= 0 || height <= 0)
                {
                    throw new Exception();
                }

                System.out.println(length + width + height);

                break;

            } catch (Exception e)
            {
                System.out.println("\nInput must be a positive, non-zero real number!");
            }
        }

        float floorArea = area(length, width);
        float wallSurfaceArea = surfaceArea(length, width, height);
        float roomVolume = volume(length, width, height);

        System.out.println(
                "\nRoom Properties:\n"
                        + "Floor Area        : " + floorArea + " m^2" +
                        "\nWall Surface Area : " + wallSurfaceArea + " m^2" +
                        "\nRoom Volume       : " + roomVolume + " m^3"
        );


    }
}