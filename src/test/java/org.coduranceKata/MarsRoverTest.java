package org.coduranceKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    MarsRover rover = new MarsRover();


    @Test
    public void that_it_moves_to_the_north() {
        String instructions = "M";

        Assertions.assertEquals("0:1:N", rover.processInstruction(instructions));
    }

}