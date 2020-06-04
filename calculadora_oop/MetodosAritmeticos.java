package calculadora;

//Creamos los metodos aritmeticos para realizar las operaciones matematicas
public class MetodosAritmeticos extends Propiedades {

	public double sumar(double num1, double num2) {

		return num1 + num2;
	}

	public double restar(double num1, double num2) {

		return num1 - num2;
	}

	public double multi(double num1, double num2) {

		return num1 * num2;
	}

	public double divid(double num1, double num2) {

		return Math.floor(num1 / num2);
	}

	public double root(double num1) {

		return Math.floor(Math.sqrt(num1));

	}

}
