import Estructuras_lineales.COLA.ColaEstaticaCircular;

public class MainColaCircular {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA CIRCULAR ===");
        ColaEstaticaCircular cola = new ColaEstaticaCircular(4);

        cola.encolar(100);
        cola.encolar(200);
        cola.encolar(300);
        cola.encolar(400);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());

        cola.desencolar(); // Libera una posición al frente
        cola.mostrar();

        cola.encolar(500); // Reutiliza el espacio mediante el envoltorio circular (%)
        cola.mostrar();

        System.out.println("Elemento al frente final (peek): " + cola.peek());
    }
}
