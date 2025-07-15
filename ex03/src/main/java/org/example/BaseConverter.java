package org.example;

public class BaseConverter {
    public static double convert(int degree, boolean isCalvin){
        if(isCalvin){
            return (degree + 273.15);
        } else{
            return(degree*1.8 + 32);
        }
    }
}
