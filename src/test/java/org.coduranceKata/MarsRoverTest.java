package org.coduranceKata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MarsRoverTest {

    MarsRover rover = new MarsRover();


    @Test
    public void that_it_moves_to_the_north() throws Exception {
        String instructions = "M";

        Assertions.assertEquals("0:1:N", rover.processInstructions(instructions));
    }

    @Test
    public void that_it_moves_to_the_east() throws Exception {
        String instructions = "RM";

        Assertions.assertEquals("1:0:E", rover.processInstructions(instructions));
    }
    @Test
    public void that_it_moves_to_the_south() throws Exception {
        String instructions = "MMMRRM";

        Assertions.assertEquals("0:2:S", rover.processInstructions(instructions));
    }
}