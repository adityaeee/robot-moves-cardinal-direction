package com.enigma.robot;

import java.util.Scanner;

public class Helper {
    static Scanner scanner = new Scanner(System.in);

    public static String inputString (String info){
        while(true) {
            System.out.printf("%s : ", info);
            String input = scanner.next();

//            if (!input.equals("N")|| !input.equals("S")  || !input.equals("E") || !input.equals("W") ) {
//                continue;
//            }
            return input;
        }
    }

    public static Integer inputInteger(String info) {
        while(true) {
            System.out.printf("%s : ", info);
            Integer input = scanner.nextInt();

            if (input == null) {
                continue;
            }
            return input;
        }

    }

    public static Direction inputDirection (String dir){
            if (dir == "N") {
                return Direction.NORTH;
            }else if (dir.equals("S")) {
                return Direction.SOUTH;
            } else if (dir.equals("E") ) {
                return Direction.EAST;
            } else if (dir.equals("W")) {
                return Direction.WEST;
            }
            return Direction.NORTH;
    }

    public static Boolean checkRute(String rute) {
        for (int i = 0; i < rute.length(); i++) {
            if (rute.charAt(i) != 'A') {
                if (rute.charAt(i) != 'R'){
                    if (rute.charAt(i) != 'L'){
                        System.out.println("rute invalid, masukkan kembali");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static Boolean checkInputDirection(String rute) {
        for (int i = 0; i < rute.length(); i++) {
            if (rute.charAt(i) != 'N') {
                if (rute.charAt(i) != 'S'){
                    if (rute.charAt(i) != 'W'){
                        if (rute.charAt(i) != 'E'){
                            System.out.println("Direction invalid, masukkan kembali");
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

}
