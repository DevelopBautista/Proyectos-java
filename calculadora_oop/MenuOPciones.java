package calculadora;

import javax.swing.JOptionPane;

public class MenuOPciones extends MetodosAritmeticos {
	boolean bandera = false;
	int op;

	public void getMenu() {
		do {
			op = Integer.parseInt(
					JOptionPane.showInputDialog(null, "**Menu**\n1-Sumar\n2-Restar\n3-Multiplicar\n4Dividir\n5-Salir"));

			switch (op) {
			case 1:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				setResultados(getNum1() + getNum2());

				JOptionPane.showMessageDialog(null, "La suma fue " + getResultados());

				break;
			case 2:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				setResultados(getNum1() - getNum2());

				JOptionPane.showMessageDialog(null, "La resta fue " + getResultados());

				break;
			case 3:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				setResultados(getNum1() * getNum2());

				JOptionPane.showMessageDialog(null, "La multiplicacion fue " + getResultados());

				break;
			case 4:
				setNum1(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 1ro numero ")));
				setNum2(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 2do numero ")));

				setResultados(getNum1() / getNum2());

				JOptionPane.showMessageDialog(null, "La division fue " + getResultados());

				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Hasta luego..!!");
				bandera = true;
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcion invalidad", "error", 3);
				break;
			}

		} while (bandera = true);
	}

}
