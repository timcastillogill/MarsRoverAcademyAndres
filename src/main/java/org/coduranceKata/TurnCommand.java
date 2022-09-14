package org.coduranceKata;

public class TurnCommand implements Command{

    Coordinates coordinates;
    char instruction;

    public TurnCommand(Coordinates coordinates, char instruction) {
        this.coordinates = coordinates;
        this.instruction = instruction;
    }

    @Override
    public void execute() throws Exception {
        coordinates.calculateNewDirection(instruction);
    }
}
