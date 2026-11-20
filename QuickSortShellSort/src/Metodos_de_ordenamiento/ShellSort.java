package Metodos_de_ordenamiento;

/**
 * Clase que implementa el algoritmo de ordenamiento Shellsort.
 * Es una optimización del ordenamiento por inserción que compara elementos
 * separados por intervalos (gaps) mayores a uno, reduciéndolos progresivamente.
 */
public class ShellSort {

    /**
     * Ordena un arreglo de enteros de forma ascendente usando Shellsort.
     */
    public static void ordenar(int[] arr) {
        int n = arr.length;

        // 1. Reducción del salto: Empieza en n/2 y se divide entre 2 en cada vuelta hasta ser 0
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {

            // 2. Recorrido tipo inserción pero saltando según el 'intervalo' actual
            for (int i = intervalo; i < n; i++) {
                int temp = arr[i]; // Elemento que vamos a acomodar
                int j = i;

                // Desplazamiento por saltos mientras haya elementos mayores a la izquierda
                while (j >= intervalo && arr[j - intervalo] > temp) {
                    arr[j] = arr[j - intervalo];
                    j -= intervalo;
                }

                // Insertamos el valor temporal en el hueco que quedó libre
                arr[j] = temp;
            }
        }
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
