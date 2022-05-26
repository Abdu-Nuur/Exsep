package com.company;

public class Main {

    public static void main(String[] args) {

        try {
            Car.drive();
        }catch (Exception e) {
            Car.close();
        }
    }
}
