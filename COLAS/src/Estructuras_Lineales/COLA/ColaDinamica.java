package Estructuras_lineales.COLA;

import Estructuras_lineales.Nodo;

public class ColaDinamica {
    private Nodo frente;
    private Nodo fin;

    public ColaDinamica() {
        this.frente = null;
        this.fin = null;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void encolar(int x) {
        Nodo nuevo = new Nodo(x);
        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
        System.out.println("Encolado en Cola Dinámica: " + x);
    }

    public int desencolar() {
        if (estaVacia()) {
            System.out.println("¡Error! La cola dinámica está vacía");
            return -1;
        }
        int valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null;
        }
        System.out.println("Desencolado de Cola Dinámica: " + valor);
        return valor;
    }

    public int peek() {
        if (!estaVacia()) {
            return frente.dato;
        } else {
            System.out.println("La cola dinámica está vacía (peek no disponible).");
            return -1;
        }
    }

    public int contarElementos() {
        int contador = 0;
        Nodo actual = frente;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola Dinámica Actual: [Vacía]");
            return;
        }
        Nodo actual = frente;
        System.out.print("Frente -> ");
        while (actual != null) {
            System.out.print("[" + actual.dato + "] ");
            actual = actual.siguiente;
        }
        System.out.println("<- Fin");
    }
}
