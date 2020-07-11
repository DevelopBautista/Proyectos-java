package pruebas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Metodos extends Personas {
	private String nombre;
	private String ap;
	private String tel;
	private String dir;

	ArrayList<Personas> persona = new ArrayList<Personas>();

	public Metodos() {

	}

	public void agregarClientes() {
		nombre = JOptionPane.showInputDialog("Digite el nombre");
		ap = JOptionPane.showInputDialog("Digite el apellido");
		tel = JOptionPane.showInputDialog("Digite el numero telefonico");
		dir = JOptionPane.showInputDialog("Digite la direccion");
		Personas p = new Personas();
		p.setNombre(nombre);
		p.setApellidos(ap);
		p.setTel(tel);
		p.setDire(dir);

		persona.add(p);
		JOptionPane.showMessageDialog(null, "Cliente guardado con exito...");

	}

	public void listarPerosnas() {
		for (Personas aux : persona) {
			JOptionPane.showMessageDialog(null, aux.getDatos(), "Datos de Persona", 1);

		}
	}

}
