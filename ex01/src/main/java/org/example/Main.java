package org.example;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Math.random();
        }
        double min = 1.0;
        double max = 0.0;
        double sum = 0.0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
            }
            sum+=numbers[i];
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + (sum/numbers.length));
    }
}