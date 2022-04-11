package com;

import java.util.Scanner;

public class ComplexCalculator {

public static void main(String[] args) {
	String op = getInput("Choose operator (+, -, *, /)"); 
	String s1 = getInput("Enter first numeric value");
    String s2 = getInput("Enter second numeric value");


double result = 0;
try {
    switch (op) {
                case "+":
                result = addValues(s1, s2);
                break;
                
                case "-":
                result = subtractValues(s1, s2);
                break;

                case "*":
                result = multiplyValues(s1, s2);
                break;

                case "/":
                result = divideValues(s1, s2);
                break;

                default:
                System.out.println("invalid operation");
                return;

                }
           System.out.println("_________________________");
           System.out.println("Answer is: " + result);
           System.out.println("_________________________");
} 
catch (Exception e) {
System.out.println("Number formatiing exception" + e.getMessage());
}
}

private static double addValues(String s1,String s2){
double d1=Double.parseDouble(s1);
double d2=Double.parseDouble(s2);
return d1+d2;
}

private static double subtractValues(String s1,String s2){
double d1=Double.parseDouble(s1);
double d2=Double.parseDouble(s2);
return d1-d2;
}

private static double multiplyValues(String s1,String s2){
double d1=Double.parseDouble(s1);
double d2=Double.parseDouble(s2);
return d1*d2;
}

private static double divideValues(String s1,String s2){
double d1=Double.parseDouble(s1);
double d2=Double.parseDouble(s2);
return d1/d2;
}

private static String getInput(String prompt){
System.out.println(prompt);
Scanner sc=new Scanner(System.in);
return sc.nextLine();
}
}
