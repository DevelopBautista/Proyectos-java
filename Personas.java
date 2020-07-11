package pruebas;

public class Personas {
	public static int id = 0;// pertenece a clase
	private int idCliente;// pertenece las instacias de clases
	private String nombre;
	private String apellidos;
	private String tel;
	private String dire;

	public Personas() {
		idCliente = Personas.id++;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDire() {
		return dire;
	}

	public void setDire(String dire) {
		this.dire = dire;
	}

	// para que me admita el idCliente que es un in(tambien es un objecto)
	public Object getDatos() {
		return "Id :" + idCliente + "\nNombre :" + this.nombre + "\nApellidos: " + this.apellidos + "\nTel: " + this.tel
				+ "\nDireccion: " + this.dire + "\n";
	}

}
