package org.coduranceKata;

import java.util.Objects;

public class MarsRover {


	CommandManager cm = new CommandManager();
	Coordinates coordinates = new Coordinates(0, 0, 'N');

	public String processInstruction(String instructions) {



		char[] instructionsArray = instructions.toCharArray();

		String newPosition = "";

		for (char instruction: instructionsArray) {
			 newPosition = cm.figureOutWTFToDoWithThis(coordinates, instruction);
		}

		return newPosition;
	}
}