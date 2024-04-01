package com.enigma.robot;

import javax.swing.text.Position;

public class Robot {
    public Direction direction;
    public Integer X;
    public Integer Y;

//    public Integer[] position = new Integer[2];

    Robot (Direction direction, Integer X, Integer Y) {
        this.direction = direction;
        this.X = X;
        this.Y = Y;
    };

    public void moving (Character rute) {

        if (rute.equals('L')) {
            this.direction = direction.turnLeft();

        } else if (rute.equals('R')) {
            this.direction = direction.turnRight();

        } else if (rute.equals('A')) {

//            arah NORTH
            if (this.direction.equals(Direction.NORTH)) {
                this.Y += 1;

//            arah SOUTH
            } else if (this.direction.equals(Direction.SOUTH)) {
                this.Y -= 1;

//            arah EAST
            }else if (this.direction.equals(Direction.EAST)) {
                this.X += 1;

            } else if (this.direction.equals(Direction.WEST)) {
                this.X -= 1;
            }
        }
    };

}
