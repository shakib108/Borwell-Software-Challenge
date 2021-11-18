package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class PaintCalcTest
{
    // example room dimensions
    float length = 5, width = 3, height = 3;

    // System.in backup
    InputStream sysInBackup = System.in;

    // simulated System.in user input stream
    ByteArrayInputStream in;

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
	
	@Test
    public void nonNumericInputTest()
    {
        try
        {
            // set up System.in to pass through simulated user input
            InputStream sysInBackup = System.in;
            ByteArrayInputStream in = new ByteArrayInputStream("abc\n3\n2".getBytes());
            System.setIn(in);

            PaintCalc.main(new String[0]);

        }
        catch (IllegalArgumentException e)
        {
            fail("Main method should handle non-numeric inputs");
        }
    }

    @Test
    public void negativeInputTest()
    {
        // set up System.in to pass through simulated user input
        in = new ByteArrayInputStream("4\n-3\n2".getBytes());
        System.setIn(in);

        PaintCalc.main(new String[0]);
        assertAll(
                () -> assertTrue(PaintCalc.length > 0, "length should be positive"),
                () -> assertTrue(PaintCalc.width > 0, "width should be positive"),
                () -> assertTrue(PaintCalc.height > 0, "height should be positive")
        );
    }
}