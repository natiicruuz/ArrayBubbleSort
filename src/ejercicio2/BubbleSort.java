package ejercicio2;

class BubbleSort {
	
	void bubbleSort(int array[]) {
		
		if (array == null || array.length == 0) {
			return; // en caso del array vacío o nulo
		}

		// Ejecutar el bucle dos veces: uno para recorrer el Array y otro para
		// comparaciones
		for (int i = 0; i < array.length - 1; i++) {

			// Se genera un registro de los intercambios
			boolean enOrden= true;
			for (int j = 0; j < array.length - i - 1; j++) {

				if (array[j] > array[j + 1]) {

					// Intercambio
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

					enOrden = false; // se tuvo que cambiar, es decir, no estaba en orden, por lo que el ciclo sigue
				}
			}

			// Si no ha habido intercambio en la última comparación, entonces el array está
			// ya ordenado.
			if (enOrden == true)
				break;
		}
	}

}
