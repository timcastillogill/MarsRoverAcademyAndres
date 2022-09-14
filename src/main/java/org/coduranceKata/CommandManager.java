package org.coduranceKata;

public class CommandManager {



    public String figureOutWTFToDoWithThis(Coordinates coordinates, char instruction) {



        if (instruction == 'M') {
            MoveCommand moveCommand = new MoveCommand(coordinates, instruction);

            moveCommand.execute();
        }

        if (instruction == 'R' || instruction == 'L') {
            TurnCommand turnCommand = new TurnCommand(coordinates, instruction);

            turnCommand.execute();
        }

        return coordinates.getFormattedOutput();
    }

}
