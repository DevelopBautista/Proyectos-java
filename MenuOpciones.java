package pruebas;

import javax.swing.JOptionPane;

public class MenuOpciones extends Metodos {

	private int op;

	public int getOp() {
		return op;
	}

	public void setOp(int op) {
		this.op = op;
	}

	public void opciones() {
		do {
			setOp(Integer.parseInt(JOptionPane.showInputDialog("Menu\n1-AgregarClientes\n2-Mostrarclientes\n3-Salir")));

			switch (getOp()) {
			case 1:
				agregarClientes();
				break;
			case 2:
				listarPerosnas();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Hasta luego...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion no validad!!");
			}
		} while (getOp() != 3);

	}

}
