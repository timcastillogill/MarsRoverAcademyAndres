package org.coduranceKata;

import java.rmi.UnexpectedException;

public class Coordinates {


    private int xCoordinate;
    private int yCoordinate;
    private char direction;

    private char facingTo;


    public Coordinates() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.direction = 'N';
    }

    public Coordinates(int xCoordinate, int yCoordinate, char direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public void calculateNewPosition() {
        if (direction == 'N') {
            yCoordinate += 1;
        }
        if (direction == 'S') {
            yCoordinate -= 1;
        }
        if (direction == 'E') {
            xCoordinate += 1;
        }
        if (direction == 'W') {
            xCoordinate -= 1;
        }
    }

    public void calculateNewDirection(char instruction) throws Exception {

        if (instruction == 'R') {
            // IntelliJ 'Ennhances' it to the other switch shown below, in the next if stmt
            switch (direction) {
                case 'N':
                    direction = 'E';
                    break;
                case 'E':
                    direction = 'S';
                    break;
                case 'S':
                    direction = 'W';
                    break;
                case 'W':
                    direction = 'N';
                    break;
                default:
                    throw new Exception();
            }
        }

        if (instruction == 'L') {
            switch (direction) {
                case 'N' -> direction = 'W';
                case 'W' -> direction = 'S';
                case 'S' -> direction = 'E';
                case 'E' -> direction = 'N';
                default -> throw new Exception();
            }
        }
    }

    public String getFormattedOutput() {
        return this.xCoordinate +":"+ this.yCoordinate +":"+this.direction;
    }




}
