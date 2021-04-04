package com.company;
public class Calculator {
    public static int sum(int x, int y){
        return x+y;
    }
    public static int multiply(int x, int y){
        return x*y;
    }
    public static int divide(int x, int y){
        return x/y;

    }
    public static int  modulus(int x, int y){

        return x%y;
    }
    public static void sin(int x){
        System.out.println(" sin@ :-"+Math.sin(x));
    }
    public static void cos(int x){
        System.out.println("the cos@:-"+Math.cos(x));
    }
    public static void tan(int x){
        System.out.println("the tan@-"+Math.tan(x));
    }

}
