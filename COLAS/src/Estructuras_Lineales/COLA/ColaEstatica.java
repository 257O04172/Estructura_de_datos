package Estructuras_lineales.COLA;

public class ColaEstatica {
    private int[] datos;
    private int frente;
    private int fin;
    private int limite;

    public ColaEstatica(int tamano) {
        this.limite = tamano;
        this.datos = new int[limite];
        this.frente = 0;
        this.fin = -1;
    }

    public boolean estaVacia() {
        return frente > fin;
    }

    public boolean estaLlena() {
        return fin == limite - 1;
    }

    public void encolar(int x) {
        if (!estaLlena()) {
            fin++;
            datos[fin] = x;
            System.out.println("Encolado en Cola Estática: " + x);
        } else {
            System.out.println("¡Error! Cola Estática Llena.");
        }
    }

    public int desencolar() {
        if (!estaVacia()) {
            int valor = datos[frente];
            frente++;
            System.out.println("Desencolado de Cola Estática: " + valor);
            return valor;
        } else {
            System.out.println("¡Error! Cola Estática Vacía.");
            return -1;
        }
    }

    public int peek() {
        if (!estaVacia()) {
            return datos[frente];
        } else {
            System.out.println("Cola Estática Vacía (peek no disponible).");
            return -1;
        }
    }

    public void mostrar() {
        if (estaVacia()) {
            System.out.println("Cola Estática Actual: [Vacía]");
            return;
        }
        System.out.print("Frente -> ");
        for (int i = frente; i <= fin; i++) {
            System.out.print("[" + datos[i] + "] ");
        }
        System.out.println("<- Fin");
    }
}
