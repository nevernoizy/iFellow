package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Введите часы:");
            int hours = in.nextInt();
            System.out.println("Введите минуты:");
            int minutes = in.nextInt();
            clockDegree(hours, minutes);
        } catch (Exception ex){
            System.err.println("wrong input data");
        }
    }

    private static void clockDegree(int hours, int minutes){
        if(hours>24 || hours < 0 || minutes<0 || minutes>60){
            System.err.println("wrong input data");
            return;
        }
        double minutesDegree = minutes*6;
        double hoursDegree = (hours % 12) * 30 + minutes * 0.5;
        System.out.println(Math.abs(minutesDegree - hoursDegree));
    }
}