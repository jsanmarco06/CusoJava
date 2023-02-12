package tareas;

import java.util.Scanner;

public class Tarea4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nombreUno, nombreDos, nombreTres;
		
		System.out.println("Ingrese el primer nombre:");
		nombreUno = scanner.nextLine();
		
		System.out.println("Ingrese el segundo nombre:");
		nombreDos = scanner.nextLine();
		
		System.out.println("Ingrese el tercer nombre:");
		nombreTres = scanner.nextLine();
		
		if((nombreUno.length() > nombreDos.length()) && (nombreUno.length() > nombreTres.length()) && (nombreDos.length() > nombreTres.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreUno + "\n"+ nombreDos + "\n"+ nombreTres + "\n");
		}
		if((nombreUno.length() > nombreDos.length()) && (nombreUno.length() > nombreTres.length()) && (nombreDos.length() < nombreTres.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreUno + "\n"+ nombreTres + "\n"+ nombreDos + "\n");
		}
		if((nombreDos.length() > nombreUno.length()) && (nombreDos.length() > nombreTres.length()) && (nombreUno.length() < nombreTres.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreDos + "\n"+ nombreTres + "\n"+ nombreUno + "\n");
		}
		if((nombreDos.length() > nombreUno.length()) && (nombreDos.length() > nombreTres.length()) && (nombreUno.length() > nombreTres.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreDos + "\n"+ nombreUno + "\n"+ nombreTres + "\n");
		}
		if((nombreTres.length() > nombreUno.length()) && (nombreTres.length() > nombreDos.length()) && (nombreUno.length() < nombreDos.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreTres + "\n"+ nombreDos + "\n"+ nombreUno + "\n");
		}
		if((nombreTres.length() > nombreUno.length()) && (nombreTres.length() > nombreDos.length()) && (nombreUno.length() > nombreDos.length())) {
			System.out.println("Nombres Ordenados por longitud:\n" + nombreTres + "\n"+ nombreUno + "\n"+ nombreDos + "\n");
		}
	}
}
