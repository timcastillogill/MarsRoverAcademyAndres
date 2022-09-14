package org.coduranceKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoordinatesTest {

    Coordinates coordinates = new Coordinates();

    @Test
    public void that_it_moves_to_the_north() {
        coordinates.calculateNewPosition();
        Assertions.assertEquals("0:1:N", coordinates.getFormattedOutput());
    }

    @Test
    public void that_it_moves_to_the_south() {
        coordinates.calculateNewPosition();
        Assertions.assertEquals("0:2:S", coordinates.getFormattedOutput());
    }

}