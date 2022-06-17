package com.test;

import java.util.Scanner;

public class Util {

    public static Scanner input = new Scanner(System.in);

    public static void scannerCloseConnection (){
        input.close();
    }

    public static double scannerChooseNumber (){

        double number = input.nextDouble();

        return number;
    }

    public static char scannerChooseOperation (){

        char operation = input.next().charAt(0);

        return operation;
    }
}
