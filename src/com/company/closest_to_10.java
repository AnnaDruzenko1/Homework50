package com.company;

public class closest_to_10 {
    public static void main(String[] args) {
        double n=7.5;
        double m=13.45;
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);
        if (b==c){
            System.out.println("Числа "+n+" и "+m + " равноудалены от "+a);
        }
        else if(b>c){
            System.out.println("Число "+m+" ближе к "+a);
        }
        else if (b<c) {
            System.out.println("Число "+n+" ближе к "+a);
        }
    }
}
