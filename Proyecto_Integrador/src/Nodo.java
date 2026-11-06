/** Enlaza un artículo con sus dos Ramas Posibles. */
final class Nodo {
    Producto articulo;
    Nodo izquierdo;
    Nodo derecho;

    Nodo(Producto articulo) {
        // Las Ramas quedan Vacías hasta que se inserten Otros Nombres.
        this.articulo = articulo;
    }
}