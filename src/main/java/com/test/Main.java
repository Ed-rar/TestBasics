package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1=0, num2=0, result=0;
        Calculator calculator = new Calculator();

        System.out.println("Esta é uma calculadora, escolha o primeiro número: ");
        num1 = Util.scannerChooseNumber();

        System.out.println("Agora escolha o segundo número: ");
        num2 = Util.scannerChooseNumber();

        System.out.println("por último, escolha a operação que deseja efetuar:\n" +
                "'+' para adição\n" +
                "'-' para subtração\n" +
                "'*' para multiplicação\n" +
                "'/' para divisão");

        switch (Util.scannerChooseOperation()){

            case '+': result = calculator.addition(num1, num2);
                break;

            case '-': result = calculator.subtraction(num1, num2);
                break;

            case '*': result = calculator.multiplication(num1, num2);
                break;

            case '/': result = calculator.division(num1, num2);
                break;

            default:
                System.out.println("escolha uma opção válida");
        }

        Util.scannerCloseConnection();
        System.out.println("O resultado da sua operação é: " + result);
    }



}
