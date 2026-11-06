import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Almacena productos siguiendo el orden de sus Nombres. */
public class ArbolBinarioBusqueda {
    private Nodo inicio;

    public boolean insertar(Producto articulo) {
        Objects.requireNonNull(articulo, "Se requiere un Producto.");
        // Un alta repetida no cambia las existencias del registro anterior.
        if (buscar(articulo.getNombre()) != null) return false;
        inicio = ubicarRegistro(inicio, articulo);
        return true;
    }

    private Nodo ubicarRegistro(Nodo nodo, Producto articulo) {
        if (nodo == null) return new Nodo(articulo);
        int orden = articulo.getNombre().compareTo(nodo.articulo.getNombre());
        if (orden < 0) nodo.izquierdo = ubicarRegistro(nodo.izquierdo, articulo);
        else if (orden > 0) nodo.derecho = ubicarRegistro(nodo.derecho, articulo);
        return nodo;
    }

    public Producto buscar(String etiqueta) {
        return localizar(inicio, normalizarNombre(etiqueta));
    }

    private Producto localizar(Nodo nodo, String etiqueta) {
        if (nodo == null) return null;
        int orden = etiqueta.compareTo(nodo.articulo.getNombre());
        // Solo se Consulta la Rama en la que Puede estar el Nombre.
        if (orden < 0) return localizar(nodo.izquierdo, etiqueta);
        if (orden > 0) return localizar(nodo.derecho, etiqueta);
        return nodo.articulo;
    }

    public boolean eliminar(String etiqueta) {
        String clave = normalizarNombre(etiqueta);
        if (buscar(clave) == null) return false;
        // El primer Nodo también puede ser el que se retire.
        inicio = retirar(inicio, clave);
        return true;
    }

    private Nodo retirar(Nodo nodo, String etiqueta) {
        if (nodo == null) return null;
        int orden = etiqueta.compareTo(nodo.articulo.getNombre());
        if (orden < 0) nodo.izquierdo = retirar(nodo.izquierdo, etiqueta);
        else if (orden > 0) nodo.derecho = retirar(nodo.derecho, etiqueta);
        else {
            if (nodo.izquierdo == null && nodo.derecho == null) return null;
            // Si Falta una Rama, basta con devolver la que Queda.
            if (nodo.izquierdo == null) return nodo.derecho;
            if (nodo.derecho == null) return nodo.izquierdo;

            Nodo siguiente = obtenerMinimo(nodo.derecho);
            // Se Traslada el Artículo completo, incluyendo Stock y Precio.
            nodo.articulo = siguiente.articulo;
            nodo.derecho = retirar(nodo.derecho, siguiente.articulo.getNombre());
        }
        return nodo;
    }

    private Nodo obtenerMinimo(Nodo nodo) {
        // El sucesor está en el Extremo Izquierdo de la Rama Derecha.
        while (nodo.izquierdo != null) nodo = nodo.izquierdo;
        return nodo;
    }

    public List<Producto> inOrder() {
        List<Producto> listado = new ArrayList<>();
        reunirEnOrden(inicio, listado);
        return listado;
    }

    private void reunirEnOrden(Nodo nodo, List<Producto> listado) {
        if (nodo == null) return;
        reunirEnOrden(nodo.izquierdo, listado);
        listado.add(nodo.articulo);
        reunirEnOrden(nodo.derecho, listado);
    }

    private String normalizarNombre(String etiqueta) {
        if (etiqueta == null || etiqueta.trim().isEmpty()) {
            throw new IllegalArgumentException("Escribe un Nombre de Producto.");
        }
        return etiqueta.trim();
    }
}