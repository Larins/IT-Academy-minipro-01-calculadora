package Calculadora;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) throws Exception {
		boolean continuar = true;
		int opciomenu;
		String Pi = Double.toString(Math.PI);
		String E = Double.toString(Math.E);
		Scanner opcio = new Scanner(System.in);
		do {
			System.out.println("-------------------------------------");
		    System.out.println("Indica la operaci�n");
			System.out.println("-------------------------------------");
			System.out.println("\tB�sicas: [1]Suma [2]Resta [3]Multip [4]Div [5]Resto");
			System.out.println("\tExponentes: [6]Potencia [7]Ra�z");
			System.out.println("\tLogaritmos: [8]Base10 [9]BaseE");
			System.out.println("\tTrigonometr�a: [10]Seno [11]Coseno [12]Tangente [13]Cotangente [14]Secante [15]Cosecante");
			System.out.println("\tConversiones: [16]Rad>Grad [17]Grad>Rad [18]ValorAbs");
			System.out.println("\tMemoria: []Guardar []Usar []Borrar");
			System.out.println("\tSalir: [0]");

			try {
				opciomenu = opcio.nextInt();

				
				if (opciomenu > 0 && opciomenu <= 7) { 
					//Operaciones con 2 operandos
					
					String n1 = JOptionPane.showInputDialog("Introduce un n�mero: [x] [Pi] [E]\n\t[x] = el n�mero que escojas o la base de la ra�z/potencia/logaritmo\n\t[Pi] = " + Pi.substring(0, Math.min(Pi.length(), 6)) + "\n\t[E] = " + E.substring(0, Math.min(E.length(), 6)));
					String n2 = JOptionPane.showInputDialog("Introduce un n�mero: [x] [Pi] [E]\n\t[x] = el n�mero que escojas o la base de la ra�z/potencia/logaritmo\n\t[Pi] = " + Pi.substring(0, Math.min(Pi.length(), 6)) + "\n\t[E] = " + E.substring(0, Math.min(E.length(), 6)));
					
					switch (opciomenu) {			
					case 1:// Suma
				        double suma = Double.parseDouble(n1) + Double.parseDouble(n2);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " + n1 + " + " + n2);
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						break;

					case 2:// Resta

				        double resta = Double.parseDouble(n1) - Double.parseDouble(n2);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " + n1 + " - " + n2);
				        System.out.printf("El resultado es: %.3f ", resta);
				        System.out.println("\n\n");
						break;
						
					case 3:// Multiplicaci�n

				        double multip = Double.parseDouble(n1) * Double.parseDouble(n2);
				        System.out.println("MULTIPLICACI�N");
				        System.out.println("La operaci�n es: " + n1 + " x " + n2);
				        System.out.printf("El resultado es: %.3f ", multip);
				        System.out.println("\n\n");
						break;
						
					case 4:// Divisi�n

				        double div = Double.parseDouble(n1) / Double.parseDouble(n2);
				        System.out.println("DIVISI�N");
				        System.out.println("La operaci�n es: " + n1 + " / " + n2);
				        System.out.printf("El resultado es: %.3f ", div);
				        System.out.println("\n\n");
						break;
					
					case 5:// Resto

				        double resto = Double.parseDouble(n1) % Double.parseDouble(n2);
				        System.out.println("M�DULO / RESTO DE LA DIVISI�N");
				        System.out.println("La operaci�n es: " + n1 + " - (" + n2 + " x [" + n1 + "/" + n2 + "])");
				        System.out.printf("El resultado es: %.3f ", resto);
				        System.out.println("\n\n");
						break;
						
					case 6:// Potencia

				        double pot =  Math.pow(Double.parseDouble(n1), Double.parseDouble(n2));
				        System.out.println("POTENCIA");
				        System.out.println("La operaci�n es: " + n1 + " elevado a " + n2);
				        System.out.printf("El resultado es: %.3f ", pot);
				        System.out.println("\n\n");
						break;				
						
					case 7:// Ra�z

				        double raiz =  Math.pow(Double.parseDouble(n1), 1/Double.parseDouble(n2));
				        System.out.println("POTENCIA");
				        System.out.println("La operaci�n es: Ra�z de " + n1 + " en �ndice de " + n2);
				        System.out.printf("El resultado es: %.3f ", raiz);
				        System.out.println("\n\n");
						break;	
					
					}
				
				} else if (opciomenu > 7 && opciomenu <= 18) {
					//Operaciones con 1 operando
					
					String n1 = JOptionPane.showInputDialog("Introduce un n�mero: [x] [Pi] [E]\n\t[x] = el n�mero que escojas o la base de la ra�z/potencia/logaritmo\n\t[Pi] = " + Pi.substring(0, Math.min(Pi.length(), 6)) + "\n\t[E] = " + E.substring(0, Math.min(E.length(), 6)));
					
					switch (opciomenu) {			
					
					case 8:// Logaritmo de 10
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;
					
					case 9:// Logaritmo de E
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;
					
					case 10:// Seno
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;
					
					case 11:// Coseno
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;
					
					case 12:// Tangente
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;
						
					case 13:// Cotangente
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;
					
					case 14:// Secante
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;

					case 15:// Cosecante
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;

					case 16:// Radianes a grados
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;

					case 17:// Grados a radianes
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;

					case 18:// Valor absoluto
						
				        /*double suma = Double.parseDouble(n1);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " );
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n\n");
						*/break;
					}
					
				} else {
					System.out.println("No has introducido una opci�n correcta\n");
				}
			} catch (NumberFormatException n) {
				System.out.println("Debes introducir un valor num�rico\n");
			} catch (InputMismatchException i) {

				System.out.println("Por favor, escoge una de las opciones del men�\n");
				opcio.nextLine();
			}
		} while (continuar);

	}
}
