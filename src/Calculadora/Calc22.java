package Calculadora;
import java.util.Scanner;

public class Calc22 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an Operator: ");
    String in = sc.next();
    char oper = in.charAt(0);

    System.out.print("Enter a number: ");
    in = sc.next();
    double num1 = Double.parseDouble(in);

    System.out.print("Enter another number: ");
    in = sc.next();
    double num2 = Double.parseDouble(in);

    if(oper == '+') {
        double result = num1 + num2;
        System.out.println(result);
    } else if(oper == '-') {
        double result = num1 - num2;
        System.out.println(result);
    } else if(oper == 'x') {
        double result = num1 * num2;
        System.out.println(result);
    } else if(oper == '/') {
        double result = num1 / num2;
        System.out.println(result);
    } else {
        double result = num1 % num2;
        System.out.println(result);
    }
        System.out.println("Hope this helped your mathmatical troubles!");
}}
