package Estructuras_lineales.COLA;

public class ColaEstaticaCircular {
    private int[] datos;
    private int frente;
    private int fin;
    private int tamanoActual;
    private int capacidad;

    public ColaEstaticaCircular(int limite) {
        this.capacidad = limite;
        this.datos = new int[capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamanoActual = 0;
    }

    public boolean estaVacia() {
        return tamanoActual == 0;
    }

    public boolean estaLlena() {
        return tamanoActual == capacidad;
    }

    public void encolar(int x) {
        if (!estaLlena()) {
            fin = (fin + 1) % capacidad;
            datos[fin] = x;
            tamanoActual++;
            System.out.println("Encolado en Cola Circular: " + x);
        } else {
            System.out.println("¡Error! Cola Circular Llena.");
        }
    }

    public int desencolar() {
        if (!estaVacia()) {
            int valor = datos[frente];
            frente = (frente + 1) % capacidad;
            tamanoActual--;
            System.out.println("Desencolado de Cola Circular: " + valor);
            return valor;
        } else {
            System.out.println("¡Error! Cola Circular Vacía.");
            return -1;
        }
    }

    public int peek() {
        if (!estaVacia()) {
            return datos[frente];
        } else {
            System.out.println("Cola Circular Vacía (peek no disponible).");
            return -1;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola Circular Actual: [Vacía]");
            return;
        }
        System.out.print("Frente -> ");
        for (int i = 0; i < tamanoActual; i++) {
            int idx = (frente + i) % capacidad;
            System.out.print("[" + datos[idx] + "] ");
        }
        System.out.println("<- Fin");
    }
}
