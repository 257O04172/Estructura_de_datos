public class PracticaBusquedaSecuencial {

    /**
     * Método que realiza una búsqueda lineal sobre un arreglo de enteros.
     * @param arr Arreglo donde se buscará el elemento (no requiere orden).
     * @param clave Valor entero que se desea localizar.
     * @return El índice de la primera ocurrencia de clave, o -1 si no existe.
     */
    public static int busquedaSecuencial(int[] arr, int clave) {

        // [CAMBIO REALIZADO - TODO 1]: Se estableció la condición 'i < arr.length'
        // para recorrer desde el índice 0 hasta el último elemento válido sin desbordar el arreglo.
        for (int i = 0; i < arr.length; i++) {

            // [CAMBIO REALIZADO - TODO 2]: Se compara el elemento en la posición actual 'i'
            // con el valor buscado ('clave') usando el operador de igualdad '=='.
            if (arr[i] == clave) {

                // [CAMBIO REALIZADO - TODO 3]: Al encontrar coincidencia, se retorna 'i',
                // que representa la posición exacta (índice) donde se ubica el dato.
                return i;
            }
        }

        // [CAMBIO REALIZADO - TODO 4]: Si el ciclo termina sin hallar el dato,
        // se retorna -1 como bandera estándar de "elemento no encontrado".
        return -1;
    }

    public static void main(String[] args) {
        int[] calificaciones = {78, 92, 65, 88, 95, 70};

        int pos1 = busquedaSecuencial(calificaciones, 88);  // Esperado: 3
        int pos2 = busquedaSecuencial(calificaciones, 100); // Esperado: -1

        System.out.println("Posicion de 88: " + pos1);
        System.out.println("Posicion de 100: " + pos2);
    }
}