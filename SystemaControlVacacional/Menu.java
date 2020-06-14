package interfaces;

import javax.swing.JOptionPane;

public class Menu extends Metodos {
	private String op = "si";

	public void getMenu() {
		JOptionPane.showMessageDialog(null, "Bienvenidos al sistema de vacaciones de Coca-Cola Company");
		do {

			setNombre(JOptionPane.showInputDialog("Cuales el nombre del empleado ? "));

			setAntiguedad(Integer.parseInt(JOptionPane.showInputDialog("Cuantos años tienes en la compañia ?")));

			setClave(Integer.parseInt(JOptionPane.showInputDialog("Clave del departamento")));

			super.opciones();// llamando al metodo 'opciones' de la clase 'Metodos'

			op = JOptionPane.showInputDialog("Desea consultar otro empleado ?");
			if (op.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Hasta luego...!!");

			}
		} while (op.equalsIgnoreCase("si"));

	}

	public Menu() {
	}

}
