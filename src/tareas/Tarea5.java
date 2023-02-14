package tareas;

import java.util.Scanner;

public class Tarea5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese un numero para saber su mes");
		int numeroMes =  scanner.nextInt();
		
		switch (numeroMes) {
		case 1:
			System.out.println(numeroMes + " == ENERO");
			System.out.println("el mes tiene 31 dias");
			break;
		
		case 2:
			System.out.println(numeroMes + " == FEBRERO");
			System.out.println("ingrese un numero para saber su mes");
			int anio =  scanner.nextInt();
			if((anio % 400 == 0) || (anio % 4 == 0) || !(anio % 100 == 0)) {
				System.out.println("este año tiene 29 dias");
			}
			else {
				System.out.println("este año tiene 28 dias");
			}
			break;
			
		case 3:
			System.out.println(numeroMes + " == MARZO");
			System.out.println("el mes tiene 31 dias");
			break;
		
		case 4:
			System.out.println(numeroMes + " == ABRIL");
			System.out.println("el mes tiene 30 dias");
			break;
		case 5:
			System.out.println(numeroMes + " == MAYO");
			System.out.println("el mes tiene 31 dias");
			break;
		case 6:
			System.out.println(numeroMes + " == JUNIO");
			System.out.println("el mes tiene 30 dias");
			break;
		case 7:
			System.out.println(numeroMes + " == JULIO");
			System.out.println("el mes tiene 31 dias");
			break;
		case 8:
			System.out.println(numeroMes + " == AGOSTO");
			System.out.println("el mes tiene 31 dias");
			break;
		case 9:
			System.out.println(numeroMes + " == SEPTIEMBRE");
			System.out.println("el mes tiene 30 dias");
			break;
		case 10:
			System.out.println(numeroMes + " == OCTUBRE");
			System.out.println("el mes tiene 31 dias");
			break;
		case 11:
			System.out.println(numeroMes + " == NOVIEMBRE");
			System.out.println("el mes tiene 30 dias");
			break;
		case 12:
			System.out.println(numeroMes + " == DICIEMBRE");
			System.out.println("el mes tiene 31 dias");
			break;
		default:
			System.out.println("El numero no representa ningun mes");
		

		}
	}
}
