package bubleSortFor;

public class BubleSortFor {

	public void bubleSortFor(int[] lista) {
		int aux = 0;
		int n = lista.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < (n - 1) - i; j++) {
				if (lista[j] > lista[j + 1]) {
					aux = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = aux;

				}

			}

		}
	}

	public void printLista(int[] lista) {
		int x = lista.length;
		for (int i = 0; i < x; i++) {
			System.out.println(lista[i] + "");

		}
	}
}
