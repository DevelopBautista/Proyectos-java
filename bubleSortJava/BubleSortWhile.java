package bubleSortWhile;

public class BubleSortWhile {

	public void bubleSortWhile(int lista[]) {
		boolean cambio = false;
		int aux = 0;

		while (true) {
			cambio = false;
			for (int i = 1; i < lista.length; i++) {
				if (lista[i] < lista[i - 1]) {
					aux = lista[i];
					lista[i] = lista[i - 1];
					lista[i - 1] = aux;
					cambio = true;

				}

			}
			if (cambio == false) {
				break;

			}

		}

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);

		}
	}

}
