package Calculadora;

import java.util.Scanner;

public class Calculadora {

	// OPERANDOS
		// Cada uno de los n�meros con los que el usuario operar�
		// Los introducir� el usuario o ser�n resultados de una operaci�n
		// De momento, declaramos las variables sin asignarles su valor
		// Tambi�n creamos los m�todos necesarios, que son:
		// Asignar valor a los operandos, escoger operador

	int num1;
	int num2;
	int resultado;
	char operadores;
	char operandos;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	// CONSTANTES
		// Valores num�ricos de uso habitual en operaciones matem�ticas
		// Los invocar� el usuario pero su valor es siempre el mismo
		// Son el n�mero Pi num2 el n�mero E
		// Declaramos las variables num2 les asignamos el valor

	double pi = Math.PI;
	double e = Math.E;

	// OPERADORES/OPERACIONES
		// Creamos una variable de tenum1to que contenga las diferentes opciones
		// Creamos los m�todos necesarios

	enum operadores {
		suma, resta, multip, div, mod, abs, exp, root, log10, logE, convRad, sin, cosin, tan, cotan, sec, cosec;
	};

	public Calculadora() {
		{
			resultado = 0;
			Scanner operadores = new Scanner(System.in);
			Scanner operandos = new Scanner(System.in);
		}}
		
	public int suma(int num1, int num2) 
    { 
       return num1 + num2; 
    } 
    
	public int resta(int num1, int num2) 
    { 
       return num1 - num2; 
    } 
    
	public int multip(int num1, int num2) 
    {     
       return num1 * num2; 
    } 
    
	public int div(int num1, int num2) 
    { 
       resultado = num1 / num2; 
       return resultado; 
    } 
	
	public int mod(int num1, int num2) 
    {     
		return num1 % num2;
    } 

}
