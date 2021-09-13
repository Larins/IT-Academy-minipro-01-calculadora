package MiniCalculadora;
import java.util.Scanner;

public class MiniCalculadora {
	
	public static void main(String[] args) {
	    	
		//Constantes Pi y número E
		String Pi = Double.toString(Math.PI);
		String E = Double.toString(Math.E);
	    
		//El usuario puede introducir la operación deseada
	    System.out.println("Indica la operación");
	    System.out.println("\tBásicas: [+] [-] [x] [/] [%]");
	    System.out.println("\tPotencias y Raíces: [P] [R]");
	    System.out.println("\tValor absoluto: [A]");
	    System.out.println("\tLogaritmo en base 10 o en base E: [L] [E]");
	    System.out.println("\tConversión a radianes: [C]");
	    System.out.println("\tTrigonometría: [1]Seno [2]Coseno [3]Tangente [4]Cotangente [5]Secante [6]Cosecante ");
	    
	    //El usuario puede introducir el primer operando
	    try {
	    	
			//Variable de escáner para que el usuario introduzca la información
			Scanner sc = new Scanner(System.in);
		    String entrada = sc.next();
		    char oper = entrada.charAt(0);
		    
	    	System.out.println("Introduce un número: [x] [Pi] [E]\n\t[x] = el número que escojas o la base de la raíz/potencia/logaritmo\n\t[Pi] = " + Pi + "\n\t[E] = " + E);
		    entrada = sc.next();
		    if (entrada.equals("Pi")) {entrada = Pi;}
		    if (entrada.equals("E")) {entrada = E;}
		    double num1 = Double.parseDouble(entrada);
	
	    //El usuario puede introducir el segundo operando en caso de desearlo
		    System.out.println("Introduce otro número: [y] [Pi] [E]\n\t[y] = el número que escojas o el exponente de la raíz/potencia\n\t[Pi] = " + Pi + "\n\t[E] = " + E);
		    System.out.println("Si solo necesitas un operando, introduce cualquier número.");
		    entrada = sc.next();
		    if (entrada.equals("Pi")) {entrada = Pi;}
		    if (entrada.equals("E")) {entrada = E;}
		    double num2 = Double.parseDouble(entrada);

	    
	    //Ejecución de la operación, que se muestra por pantalla, así como su resultado
	    if(oper == '+') {
	        double resultado = num1 + num2;
	        System.out.println("SUMA");
	        System.out.println("La operación es: " + num1 + " + " + num2);
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if(oper == '-') {
	        double resultado = num1 - num2;
	        System.out.println("RESTA");
	        System.out.println("La operación es: " + num1 + " - " + num2);
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if(oper == 'x') {
	        double resultado = num1 * num2;
	        System.out.println("MULTIPLICACIÓN");
	        System.out.println("La operación es: " + num1 + " x " + num2);
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if(oper == '/') {
	        double resultado = num1 / num2;
	        System.out.println("DIVISIÓN");
	        System.out.println("La operación es: " + num1 + " / " + num2);
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if (oper == '%'){
	        double resultado = num1 % num2;
	        System.out.println("MÓDULO/RESTO DE LA DIVISIÓN");
	        System.out.println("La operación es: " + num1 + " - (" + num2 + " x [" + num1 + "/" + num2 + "])");
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if (oper == 'P'){
	    	double resultado = Math.pow(num1, num2);
	        System.out.println("POTENCIA");
	        System.out.println("La operación es: " + num1 + " elevado a " + num2);
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if (oper == 'R'){
	    	double resultado = Math.pow(num1, 1/num2);
	        System.out.println("RAÍZ CUADRADA");
	        System.out.println("La operación es: Raíz de " + num1 + " en índice de " + num2);
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if (oper == 'A'){
	    	double resultado = Math.abs(num1);
	        System.out.println("VALOR ABSOLUTO");
	        System.out.println("La operación es: Valor absoluto de " + num1);
	        System.out.println("El resultado es: " + Math.round(resultado));
	    } else if (oper == 'L'){
	    	double resultado = Math.log10(num1);
	        System.out.println("LOGARITMO DE 10");
	        System.out.println("La operación es: Logaritmo de " + num1 + " en base 10");
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == 'E'){
	    	double resultado = Math.log(num1);
	        System.out.println("LOGARITMO DE E");
	        System.out.println("La operación es: Logaritmo de " + num1 + " en base 10");
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == 'C'){
	    	double resultado = Math.toRadians(num1);
	        System.out.println("CONVERSIÓN A RADIANES");
	        System.out.println("La operación es: Convertir " + num1 + " a radianes");
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == '1'){
	    	double resultado = Math.sin(num1);
	        System.out.println("SENO");
	        System.out.println("La operación es: Seno de " + num1);
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == '2'){
	    	double resultado = Math.cos(num1);
	        System.out.println("COSENO");
	        System.out.println("La operación es: Coseno de " + num1);
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == '3'){
	    	double resultado = Math.tan(num1);
	        System.out.println("TANGENTE");
	        System.out.println("La operación es: Tangente de " + num1);
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == '4'){
	    	double resultado = 1/Math.tan(num1);
	        System.out.println("COTANGENTE");
	        System.out.println("La operación es: Cotangente de " + num1);
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == '5'){
	    	double resultado = Math.cos(num1);
	        System.out.println("SECANTE");
	        System.out.println("La operación es: Secante de " + num1);
	        System.out.println("El resultado es: " + resultado);
	    } else if (oper == '6'){
	    	double resultado = 1/Math.sin(num1);
	        System.out.println("COSECANTE");
	        System.out.println("La operación es: Cosecante de " + num1);
	        System.out.println("El resultado es: " + resultado);
	    }
	        System.out.println("\nDale al play si quieres realizar otro cálculo ;)");
	
    } catch(Exception ex) {
        ex.printStackTrace();
    }}
}
