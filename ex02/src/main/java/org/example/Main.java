package org.example;

public class Main {
    public static void main(String[] args) {
        String word = "Hello";
        String lowerWord = word.toLowerCase();
        char first = lowerWord.charAt(0);
        char second;
        for(int i = 1; i < lowerWord.length(); i++){
            second = lowerWord.charAt(i);
            if(first == second){
                System.out.println(first);
                break;
            }
            first = second;
        }
    }
}