import Estructuras_lineales.COLA.ColaEstatica;

public class MainColaEstatica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA ESTÁTICA LINEAL ===");
        ColaEstatica cola = new ColaEstatica(5);

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());

        cola.desencolar();
        cola.mostrar();

        System.out.println("Nuevo elemento al frente (peek): " + cola.peek());
    }
}
