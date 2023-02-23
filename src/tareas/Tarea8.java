package tareas;

import java.util.Scanner;

public class Tarea8 {

	public static void main(String[] args) {
		int[] numerosAleatorios;
		numerosAleatorios = new int[10];
		
		System.out.println("Ingrese numeros aleatorios");
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < numerosAleatorios.length; i++) {
			numerosAleatorios[i] = s.nextInt();
		}
		int numeroRepetido = -1;
		int cantidadRepeticiones =0;
		for(int i = 0; i < numerosAleatorios.length - 1; i++) {
			for(int j = i + 1; j < numerosAleatorios.length; j++) {
				if((numerosAleatorios[i] == numerosAleatorios[j])) {
					numeroRepetido = numerosAleatorios[i];
					if(numeroRepetido == numerosAleatorios[i]) {
						cantidadRepeticiones++;
					}
				}
				
			}
		}
		System.out.println("numero repetido: " + numeroRepetido);
		System.out.println("cant repetido: " + cantidadRepeticiones);

	}

}
