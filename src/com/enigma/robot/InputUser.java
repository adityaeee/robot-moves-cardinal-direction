package com.enigma.robot;

public class InputUser {
    public static Integer inputPosition(String position) {
        Integer value = Helper.inputInteger("Masukkan posisi sumbu " +position);
        try{
            if(value instanceof Integer){
                return value;
            }
        }catch (Exception e) {
            System.out.println("Inputan harus number");
        }
        return value;
    }
}
