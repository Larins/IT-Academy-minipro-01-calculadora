package MiniCalculadora;
import java.util.Scanner;

public class MiniCalculadora {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Indica la operaci�n: [+] [-] [x] [/] [%] ");
    String in = sc.next();
    char oper = in.charAt(0);

    System.out.print("Introduce un n�mero: ");
    in = sc.next();
    double num1 = Double.parseDouble(in);

    System.out.print("Introduce otro n�mero: ");
    in = sc.next();
    double num2 = Double.parseDouble(in);

    if(oper == '+') {
        double resultado = num1 + num2;
        System.out.println("SUMA");
        System.out.println("La operaci�n es: " + num1 + " + " + num2);
        System.out.println("El resultado es: " + resultado);
    } else if(oper == '-') {
        double resultado = num1 - num2;
        System.out.println("RESTA");
        System.out.println("La operaci�n es: " + num1 + " - " + num2);
        System.out.println("El resultado es: " + resultado);
    } else if(oper == 'x') {
        double resultado = num1 * num2;
        System.out.println("MULTIPLICACI�N");
        System.out.println("La operaci�n es: " + num1 + " x " + num2);
        System.out.println("El resultado es: " + resultado);
    } else if(oper == '/') {
        double resultado = num1 / num2;
        System.out.println("DIVISI�N");
        System.out.println("La operaci�n es: " + num1 + " / " + num2);
        System.out.println("El resultado es: " + resultado);
    } else {
        double resultado = num1 % num2;
        System.out.println("M�DULO/RESTO DE LA DIVISI�N");
        System.out.println("La operaci�n es: " + num1 + " - (" + num2 + " x [" + num1 + "/" + num2 + "])");
        System.out.println("El resultado es: " + resultado);
    }
        System.out.println("Dale al play si quieres realizar otro c�lculo ;)");
}}
