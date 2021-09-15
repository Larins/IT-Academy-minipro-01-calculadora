package Calculadora;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) throws Exception {
		
		// Variables que necesitar�n los m�todos m�s adelante
		
		boolean continuar = true;
		int opcionmenu;
		String Pi = Double.toString(Math.PI);
		String E = Double.toString(Math.E);
		Scanner opcion = new Scanner(System.in);
		
		// Men� principal: operaciones disponibles
		// Con un bucle do-while el programa seguir� pidiendo al usuario si desea realizar una nueva operaci�n
		// El programa termina solo si se pulsa la opci�n "Salir" o si salta error de try-catch
		
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
				
				opcionmenu = opcion.nextInt();

				// Divido el bucle en dos partes
				// En esta primera parte, aparecen las operaciones con 2 operandos
				// El programa solicitar� al usuario que introduzca ambos operandos
				
				if (opcionmenu > 0 && opcionmenu <= 7) { 	
					
					String n1 = JOptionPane.showInputDialog("Introduce un n�mero: [x] [Pi] [E]\n\t[x] = el n�mero que escojas o la base de la ra�z/potencia/logaritmo\n\t[Pi] = " + Pi.substring(0, Math.min(Pi.length(), 6)) + "\n\t[E] = " + E.substring(0, Math.min(E.length(), 6)));
					String n2 = JOptionPane.showInputDialog("Introduce un n�mero: [x] [Pi] [E]\n\t[x] = el n�mero que escojas o la base de la ra�z/potencia/logaritmo\n\t[Pi] = " + Pi.substring(0, Math.min(Pi.length(), 6)) + "\n\t[E] = " + E.substring(0, Math.min(E.length(), 6)));
					
					switch (opcionmenu) {			
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
				
				} else if (opcionmenu > 7 && opcionmenu <= 18) {
					
					// Segunda parte del bucle
					// En esta segunda parte, aparecen las operaciones con 1 operando
					// El programa solicitar� al usuario que introduzca 1 operando
					
					String n1 = JOptionPane.showInputDialog("Introduce un n�mero: [x] [Pi] [E]\n\t[x] = el n�mero que escojas o la base de la ra�z/potencia/logaritmo\n\t[Pi] = " + Pi.substring(0, Math.min(Pi.length(), 6)) + "\n\t[E] = " + E.substring(0, Math.min(E.length(), 6)));
					
					switch (opcionmenu) {			
					
					case 8:// Logaritmo de 10
						
				        double log10 = Math.log10(Double.parseDouble(n1));
				        System.out.println("LOGARITMO (BASE 10)");
				        System.out.println("La operaci�n es: Logaritmo de " + n1 + " en base 10" );
				        System.out.printf("El resultado es: %.3f ", log10);
				        System.out.println("\n\n");
						break;
					
					case 9:// Logaritmo de E
						
				        double logE = Math.log(Double.parseDouble(n1));
				        System.out.println("LOGARITMO (BASE E)");
				        System.out.println("La operaci�n es: Logaritmo de " + n1 + " en base E" );
				        System.out.printf("El resultado es: %.3f ", logE);
				        System.out.println("\n\n");
						break;
					
					case 10:// Seno
						
				        double seno = Math.sin(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("SENO");
				        System.out.println("La operaci�n es: Seno de " + n1);
				        System.out.printf("El resultado es: %.3f ", seno);
				        System.out.println("\n\n");
						break;
					
					case 11:// Coseno
						
				        double coseno = Math.cos(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("COSENO");
				        System.out.println("La operaci�n es: Coseno de " + n1 );
				        System.out.printf("El resultado es: %.3f ", coseno);
				        System.out.println("\n\n");
						break;
					
					case 12:// Tangente
						
				        double tan = Math.tan(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("TANGENTE");
				        System.out.println("La operaci�n es: Tangente de " + n1 );
				        System.out.printf("El resultado es: %.3f ", tan);
				        System.out.println("\n\n");
						break;
						
					case 13:// Cotangente
						
				        double cotan = 1/Math.tan(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("COTANGENTE");
				        System.out.println("La operaci�n es: Cotagente de " + n1 );
				        System.out.printf("El resultado es: %.3f ", cotan);
				        System.out.println("\n\n");
						break;
					
					case 14:// Secante
						
				        double sec = 1/Math.cos(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("SECANTE");
				        System.out.println("La operaci�n es: Secante de " + n1 );
				        System.out.printf("El resultado es: %.3f ", sec);
				        System.out.println("\n\n");
						break;

					case 15:// Cosecante
						
				        double csc = 1/Math.sin(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("COSECANTE");
				        System.out.println("La operaci�n es: Cosecante de " + n1 );
				        System.out.printf("El resultado es: %.3f ", csc);
				        System.out.println("\n\n");
						break;

					case 16:// Radianes a grados
						
				        double radToGrad = Double.parseDouble(n1)*180/Math.PI;
				        System.out.println("RADIANES A GRADOS");
				        System.out.println("La operaci�n es: Conversi�n de " + n1 + " radianes a grados" );
				        System.out.printf("El resultado es: %.3f ", radToGrad);
				        System.out.println("\n\n");
						break;

					case 17:// Grados a radianes
						
				        double gradToRad = Double.parseDouble(n1)*Math.PI/180;
				        System.out.println("GRADOS A RADIANES");
				        System.out.println("La operaci�n es: Conversi�n de " + n1 + " grados a radianes" );
				        System.out.printf("El resultado es: %.3f ", gradToRad);
				        System.out.println("\n\n");
						break;

					case 18:// Valor absoluto
						
				        double abs = Math.abs(Double.parseDouble(n1));
				        System.out.println("VALOR ABSOLUTO");
				        System.out.println("La operaci�n es: Valor absoluto de " + n1 );
				        System.out.printf("El resultado es: %.3f ", abs);
				        System.out.println("\n\n");
						break;
					}
					
				} else {
					System.out.println("No has introducido una opci�n correcta\n");
				}
			} catch (NumberFormatException n) {
				System.out.println("Debes introducir un valor num�rico\n");
			} catch (InputMismatchException i) {

				System.out.println("Por favor, escoge una de las opcionnes del men�\n");
				opcion.nextLine();
			}
		} while (continuar);

	}
}
