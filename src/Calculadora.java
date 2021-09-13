import java.util.*;
import java.lang.*;

public class Calculadora {
	
	//OPERANDOS
		//Cada uno de los números con los que el usuario operará
		//Los introducirá el usuario o serán resultados de una operación
		//De momento, declaramos las variables sin asignarles su valor
		//También creamos los métodos necesarios, que son:
		//Asignar valor a los operandos, escoger operador
	
	int x;
	int y;
	int result;
	char operadores;
	char operands;

    public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//CONSTANTES
		//Valores numéricos de uso habitual en operaciones matemáticas
    	//Los invocará el usuario
		//Son el número Pi y el número E
		//Declaramos las variables y les asignamos el valor
	
		double pi = Math.PI;
		double e = Math.E;
    
	//OPERADORES/OPERACIONES
		//Suma, resta, multip, div, raíz, exponencial, módulo
		//Creamos una variable de texto que contenga las diferentes opciones
		//Creamos los métodos necesarios
		
	    /*public Calculadora()
	    {
	        result = 0;
	        Scanner operadores = new Scanner(System.in);
	        Scanner operandos = new Scanner(System.in);
	    }*/
	
		/*enum operadores {
			suma, resta, multip, div;

		};*/
	 
	public int suma(int x, int y) 
	    { 
	       return x + y; 
	    } 
	    public int resta(int x, int y) 
	    { 
	       return x - y; 
	    } 
	    public int multip(int x, int y) 
	    {     
	       return x * y; 
	    } 
	    public int div(int x, int y) 
	    { 
	       result = x / y; 
	       return result; 
	    } 

	//MEMORIA
		//El usuario podrá guardar temporalmente un valor en memoria
		//Lo introducirá el usuario
		//De momento, declaramo las variable sin asignarle su valor
		//También creamos los métodos necesarios, que son:
		//Guardar, invocar y borrar
	
	//CALCULADORA/INTERFAZ DE USUARIO
	    //El usuario interactúa con el programa
	    //Asigna valores, solicita operaciones, obtiene resultados
	    //Usamos las variables y métodos previamente creados
	    

	    
	    public void main (String[] args)
	    {
	      System.out.println("What operation? ('+', '-', '*', '/')"); 

	      System.out.println("Insert 2 numbers to be subtracted");
	       System.out.println("operand 1: ");
	       x = operandos;
	       System.out.println("operand 2: ");
	       y = operandos.next();
	      switch(operadores)
	      {
	          case('+'):
	            addition(operandos);
	          operandos.next();
	            break;
	          case('-'):
	            subtraction(operandos);
	          operandos.next();
	            break;
	          case('*'):
	            multiplication(operandos);
	          	operandos.next();
	            break;
	          case('/'):
	            division(operandos);
	          	operandos.next();
	            break;
	       }
	  }
	}
	

}
