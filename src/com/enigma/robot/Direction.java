package com.enigma.robot;

public enum Direction {
//          N
//          |
//    W <---+---> E
//          |
//          S

    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction turnRight(){
        return Direction.values()[(this.ordinal()+1) % values().length];
    }public Direction turnLeft(){
        return Direction.values()[(this.ordinal() + values().length - 1) % values().length];
    }
}
