package org.coduranceKata;

public class Coordinates {


    private int xCoordinate;
    private int yCoordinate;
    private char direction;


    public Coordinates(int xCoordinate, int yCoordinate, char direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void calculateNewPosition(char instruction) {
        // Business Logic
    }

    public void calculateNewDirection(char instruction) {
        // Business Logic

        /*
        if (instruction == "R")
            turnRight();

        turnLeft();


         */
    }

    public String getFormattedOutput() {
        return this.xCoordinate +":"+ this.yCoordinate +":"+this.direction;
    }




}
