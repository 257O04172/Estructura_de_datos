public class PracticaBusquedaBinaria {

    /**
     * Método que realiza una búsqueda binaria iterativa sobre un arreglo ordenado.
     * @param arr Arreglo ordenado de forma ascendente.
     * @param clave Valor entero a buscar.
     * @return El índice donde se encuentra clave, o -1 si no está presente.
     */
    public static int busquedaBinaria(int[] arr, int clave) {
        int izq = 0;

        // [CAMBIO REALIZADO - TODO 1]: Se inicializa el límite derecho con 'arr.length - 1',
        // ya que los índices en Java van de 0 a N-1.
        int der = arr.length - 1;

        // [CAMBIO REALIZADO - TODO 2]: El ciclo continúa mientras 'izq <= der'.
        // El signo '<=' es vital para evaluar el caso en que ambos apuntadores convergen en un solo elemento.
        while (izq <= der) {

            // [CAMBIO REALIZADO - TODO 3]: Se calcula el punto medio evitando desbordamiento de enteros (overflow)
            // mediante la fórmula estándar: izq + (der - izq) / 2 (equivalente a (izq + der) / 2).
            int mid = izq + (der - izq) / 2;

            if (arr[mid] == clave) {
                return mid; // Elemento encontrado
            } else if (arr[mid] < clave) {
                // [CAMBIO REALIZADO - TODO 4]: Como la clave es mayor que el centro, se descarta
                // la mitad izquierda incluyendo 'mid', moviendo el límite izquierdo a 'mid + 1'.
                izq = mid + 1;
            } else {
                // [CAMBIO REALIZADO - TODO 5]: Como la clave es menor que el centro, se descarta
                // la mitad derecha incluyendo 'mid', moviendo el límite derecho a 'mid - 1'.
                der = mid - 1;
            }
        }

        // [CAMBIO REALIZADO - TODO 6]: Cuando 'izq > der', el espacio de búsqueda se agotó
        // sin éxito, por lo que se retorna -1.
        return -1;
    }

    public static void main(String[] args) {
        // Arreglo previamente ordenado de menor a mayor
        int[] folios = {102, 115, 128, 140, 156, 173, 190, 205};

        int res1 = busquedaBinaria(folios, 173); // Esperado: 5
        int res2 = busquedaBinaria(folios, 130); // Esperado: -1

        System.out.println("Indice de 173: " + res1);
        System.out.println("Indice de 130: " + res2);
    }
}