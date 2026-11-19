package OrdenamientoB;

public class OrdenamientoBurbuja {

    /**
     * Ordena un arreglo de enteros en forma ascendente mediante el método de Burbuja.
     * Incluye optimización con bandera booleana para detener el ciclo si ya está ordenado.
     *
     * @param arreglo Arreglo de números enteros a ordenar.
     */
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio;

        // Ciclo externo: controla el número de pasadas sobre el arreglo
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            // Ciclo interno: compara elementos adyacentes hasta la parte no ordenada
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos mediante variable auxiliar
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambio = true;
                }
            }

            // Si no hubo intercambios en la pasada actual, el arreglo ya está ordenado
            if (!intercambio) {
                break;
            }
        }
    }

    /**
     * Imprime en consola los elementos del arreglo separados por espacios.
     *
     * @param arreglo Arreglo a mostrar.
     */
    public static void mostrarArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Arreglo de prueba con valores desordenados
        int[] datos = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("=== ALGORITMO DE ORDENAMIENTO POR BURBUJA ===");
        System.out.print("Arreglo original: ");
        mostrarArreglo(datos);

        // Ejecución del algoritmo de ordenamiento
        ordenarBurbuja(datos);

        System.out.print("Arreglo ordenado: ");
        mostrarArreglo(datos);
    }
}