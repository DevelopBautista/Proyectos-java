package interfaces;

import java.util.Scanner;

public class Menu extends Metodos {
	private String op = "si";

	Scanner entrada = new Scanner(System.in);

	public void getMenu() {
		System.out.println("***********************************************************");
		System.out.println("*Bienvenidos al sistema de vacaciones de Coco-Cola Company*");
		System.out.println("***********************************************************");
		do {
			System.out.println("");
			System.out.print("Cual es el nombre del trabajador: ?");
			setNombre(entrada.next());
			System.out.println("");

			System.out.print("Cuantos años tienes en la compañia: ?");
			setAntiguedad(entrada.nextInt());
			System.out.println("");

			System.out.print("Digite la clave del departamento: ?");
			setClave(entrada.nextInt());
			System.out.println("************");

			super.opciones();// llamando al metodo 'opciones' de la clase 'Metodos'
			System.out.println("");

			System.out.print("Desea consultar otro empleado: ");
			op = entrada.next();
			if (op.equalsIgnoreCase("no")) {
				System.out.println("Hasta luego...!!");

			}
		} while (op.equalsIgnoreCase("si"));

	}

	public Menu() {

	}

}
