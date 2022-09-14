package org.coduranceKata;

public class MarsRover {


	CommandManager cm = new CommandManager();
	Coordinates coordinates = new Coordinates(0, 0, 'N');

	public String processInstructions(String instructions) throws Exception {



		char[] instructionsArray = instructions.toCharArray();

		String newPosition = "";

		for (char instruction: instructionsArray) {
			 newPosition = cm.figureOutWTFToDoWithThis(coordinates, instruction);
		}

		return newPosition;
	}
}