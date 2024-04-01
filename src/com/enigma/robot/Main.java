package com.enigma.robot;

import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) {

        String rute ="";
        String dir;
        Boolean loop = true;

        //INPUTAN ARAH
        System.out.println("Posisi awal arah robot (N,E,S,W)");
        do {
            dir = Helper.inputString("Masukkan arah");
            loop = Helper.checkInputDirection(dir);
        }while (loop == true);

        Direction direction = Helper.inputDirection(dir);

        //INPUTAN POSISI X DAN Y
        int x = Helper.inputInteger("Masukkan posisi sumbu x");
        int y = Helper.inputInteger("Masukkan posisi sumbu y");

        //INPUTAN RUTE ROBOT
        System.out.println("""
                \nRute Robot :
                "A" Satu langkah maju
                "R" Hadap Kanam
                "L" Hadap kanam
                """);
        do {
            rute = Helper.inputString("Masukkan rute(enter jika selesai)");
            loop = Helper.checkRute(rute);
        }while (loop == true);


        Robot robot = new Robot(direction, x, y);

        for (int i = 0; i < rute.length(); i++) {
            robot.moving(rute.charAt(i));
            System.out.println(rute.charAt(i)+" --> " +"("+ robot.X+","+robot.Y+")");
        }
    }
}
