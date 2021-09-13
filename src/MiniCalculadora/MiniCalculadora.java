package MiniCalculadora;
import java.util.Scanner;

public class MiniCalculadora {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String Pi = Double.toString(Math.PI);
	String E = Double.toString(Math.E);
    
    System.out.print("Indica la operación: [+] [-] [x] [/] [%] ");
    String entrada = sc.next();
    char oper = entrada.charAt(0);

    System.out.print("Introduce un número: [x] [Pi] [E]\n\t[x] = el número que escojas\n\t[Pi] = " + Pi + "\n\t[E] = " + E);
    entrada = sc.next();
    if (entrada.equals("Pi")) {entrada = Pi;}
    if (entrada.equals("E")) {entrada = E;}
    double num1 = Double.parseDouble(entrada);

    System.out.print("Introduce otro número: [y] [Pi] [E]\n\t[y] = el número que escojas\n\t[Pi] = " + Pi + "\n\t[E] = " + E);
    entrada = sc.next();
    if (entrada.equals("Pi")) {entrada = Pi;}
    if (entrada.equals("E")) {entrada = E;}
    double num2 = Double.parseDouble(entrada);
    
    if(oper == '+') {
        double resultado = num1 + num2;
        System.out.println("SUMA");
        System.out.println("La operación es: " + num1 + " + " + num2);
        System.out.println("El resultado es: " + resultado);
    } else if(oper == '-') {
        double resultado = num1 - num2;
        System.out.println("RESTA");
        System.out.println("La operación es: " + num1 + " - " + num2);
        System.out.println("El resultado es: " + resultado);
    } else if(oper == 'x') {
        double resultado = num1 * num2;
        System.out.println("MULTIPLICACIÓN");
        System.out.println("La operación es: " + num1 + " x " + num2);
        System.out.println("El resultado es: " + resultado);
    } else if(oper == '/') {
        double resultado = num1 / num2;
        System.out.println("DIVISIÓN");
        System.out.println("La operación es: " + num1 + " / " + num2);
        System.out.println("El resultado es: " + resultado);
    } else {
        double resultado = num1 % num2;
        System.out.println("MÓDULO/RESTO DE LA DIVISIÓN");
        System.out.println("La operación es: " + num1 + " - (" + num2 + " x [" + num1 + "/" + num2 + "])");
        System.out.println("El resultado es: " + resultado);
    }
        System.out.println("Dale al play si quieres realizar otro cálculo ;)");
}}
