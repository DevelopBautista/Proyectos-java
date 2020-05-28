package calculadora;

import javax.swing.JOptionPane;

public class MenuOPciones extends MetodosAritmeticos {
	// Aqui creamos un pequeño menu de opciones
	boolean bandera = false;// Sirve para romper el cliclo 'while'
	int op;// Captura la opcion tomada por el usuario

	public void getMenu() {
		JOptionPane.showMessageDialog(null,
				"===Bievenid@s===\nCalculadora hecha en java utilizando 'POO'\nby DeveloperBautista");
		do {
			op = Integer.parseInt(
					JOptionPane.showInputDialog(null, "**Menu**\n1-Sumar\n2-Restar\n3-Multiplicar\n4Dividir\n5-Salir"));

			switch (op) {
			case 1:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				JOptionPane.showMessageDialog(null, "La suma fue: " + sumar(getNum1(), getNum2()));

				break;
			case 2:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				JOptionPane.showMessageDialog(null, "La resta fue: " + restar(getNum1(), getNum2()));

				break;
			case 3:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				JOptionPane.showMessageDialog(null, "La multiplicacion fue: " + multi(getNum1(), getNum2()));

				break;
			case 4:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				JOptionPane.showMessageDialog(null, "La division fue: " + divid(getNum1(), getNum2()));

				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Hasta luego..!!");
				bandera = true;
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcion invalidad", "error", 3);
			}

		} while (bandera = true);
	}

}
