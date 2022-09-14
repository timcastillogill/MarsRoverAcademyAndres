package org.coduranceKata;

public class MoveCommand implements Command {
    Coordinates coordinates;
    char instruction;

    public MoveCommand(Coordinates coordinates, char instruction) {
        this.coordinates = coordinates;
        this.instruction = instruction;
    }

    @Override
    public void execute() {
        coordinates.calculateNewPosition(instruction);
    }
}
