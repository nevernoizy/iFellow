package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите градусы");
        int celsius = 0;
        int toCalvinOrFarenghate = 0;
        try {
            celsius = in.nextInt();
        } catch (Exception ex){
            System.err.println("error");
            System.exit(0);
        }
        System.out.println();
        System.out.println("введите 1 если хотите перевести в кельвины и 2 если в фаренгейты");
        try {
            toCalvinOrFarenghate = in.nextInt();
        } catch (Exception ex){
            System.err.println("error");
            System.exit(0);
        }
        if(toCalvinOrFarenghate==1){
            System.out.println(BaseConverter.convert(celsius, true));
        } else if (toCalvinOrFarenghate==2){
            System.out.println(BaseConverter.convert(celsius, false));
        } else {
            System.out.println("wrong input");
        }
    }
}