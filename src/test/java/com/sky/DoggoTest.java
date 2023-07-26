package com.sky;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DoggoTest {

    @Test
    void emptyTest() {
    }

    @Test
    void secondTest() {
        assertEquals("1st", Placements.getPlacementString(1));
    }

    @Test
    void thirdTest() {
        assertEquals("22nd", Placements.getPlacementString(22));
    }

    @Test
    void fourthTest() {
        assertEquals("77th", Placements.getPlacementString(77));
    }

    @Test
    void fifthTest() {
        assertEquals("100th", Placements.getPlacementString(100));
    }


}
