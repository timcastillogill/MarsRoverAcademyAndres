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

    public void calculateNewPosition() {
        if (direction == 'N' || direction == 'S') {
            yCoordinate += 1;
        }
        if (direction == 'E' || direction == 'W') {
            xCoordinate += 1;
        }
    }

    public void calculateNewDirection(char instruction) {
        if (instruction == 'R' && direction == 'N') {
            direction = 'E';
        }
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
