package Metodos_de_ordenamiento;

public class MainShell {
    public static void main(String[] args) {
        // Usamos el mismo arreglo de ejemplo de clase
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("Arreglo original:");
        ShellSort.imprimirArreglo(arreglo);

        // Llamamos al método de ordenamiento ShellSort
        ShellSort.ordenar(arreglo);

        System.out.println("Arreglo ordenado con ShellSort:");
        ShellSort.imprimirArreglo(arreglo);
    }
}
