package interfaces;

import javax.swing.JOptionPane;

public class Metodos extends Propiedades {

	public void opciones() {
		if (getClave() == 1) {// Operario
			if (getAntiguedad() == 1) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 6 dias de vacaciones:");

			} else if (getAntiguedad() >= 2 && getAntiguedad() <= 6) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 14 dias de vacaciones:");
			} else if (getAntiguedad() == 7) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 20 dias de vacaciones:");
			} else {
				JOptionPane.showMessageDialog(null,
						"El trabajador  " + getNombre() + ", no tiene derecho a vacaciones:");
			}

		} else if (getClave() == 2) {
			if (getAntiguedad() == 1) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 7 dias de vacaciones:");

			} else if (getAntiguedad() >= 2 && getAntiguedad() <= 6) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 15 dias de vacaciones:");
			} else if (getAntiguedad() == 7) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 22 dias de vacaciones:");
			} else {
				JOptionPane.showMessageDialog(null,
						"El trabajador  " + getNombre() + ", no tiene derecho a vacaciones:");
			}

		} else if (getClave() == 3) {// Gerente
			if (getAntiguedad() == 1) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 10 dias de vacaciones:");

			} else if (getAntiguedad() >= 2 && getAntiguedad() <= 6) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 20 dias de vacaciones:");
			} else if (getAntiguedad() == 7) {
				JOptionPane.showMessageDialog(null,
						"El trabajador " + super.getNombre() + ", tiene derecho a 30 dias de vacaciones:");
			} else {
				JOptionPane.showMessageDialog(null,
						"El trabajador  " + getNombre() + ", no tiene derecho a vacaciones:");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Error, clave invalidad");
		}
	}

	public Metodos() {

	}

}
