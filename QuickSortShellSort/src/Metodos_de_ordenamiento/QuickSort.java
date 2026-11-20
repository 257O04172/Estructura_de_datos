package Metodos_de_ordenamiento;

/**
 * Clase que implementa el algoritmo de ordenamiento Quicksort (Rápido)
 * utilizando la estrategia de "Divide y Vencerás".
 */
public class QuickSort {

    public static void ordenar(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            int pivote = particionar(arr, bajo, alto);
            ordenar(arr, bajo, pivote - 1);
            ordenar(arr, pivote + 1, alto);
        }
    }

    private static int particionar(int[] arr, int bajo, int alto) {
        int valorPivote = arr[alto];
        int i = (bajo - 1);

        for (int j = bajo; j < alto; j++) {
            if (arr[j] <= valorPivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;

        return i + 1;
    }

    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}
