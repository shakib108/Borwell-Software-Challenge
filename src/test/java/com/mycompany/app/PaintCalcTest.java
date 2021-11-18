package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class PaintCalcTest
{
    float length = 5, width = 3, height = 3;

    @Test
    public void areaTest()
    {
        assertEquals(15.0, PaintCalc.area(length, width), 0.0);
    }

    @Test
    public void surfaceAreaTest()
    {
        assertEquals(48.0, PaintCalc.surfaceArea(length, width, height), 0.0);
    }

    @Test
    public void volumeTest()
    {
        assertEquals(45.0, PaintCalc.volume(length, width, height), 0.0);
    }
}