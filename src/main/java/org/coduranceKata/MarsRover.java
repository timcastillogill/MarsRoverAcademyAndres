package org.coduranceKata;

import java.util.Objects;

public class MarsRover {

	public String processInstruction(String instructions) {

		if (Objects.equals(instructions, "M"))
			return "0:1:N";


		return "";
	}
}