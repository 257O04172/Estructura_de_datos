import Estructuras_lineales.COLA.ColaDinamica;

public class MainColaDinamica {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");
        ColaDinamica cola = new ColaDinamica();

        System.out.println("Total de elementos iniciales: " + cola.contarElementos());

        cola.encolar(15);
        cola.encolar(25);
        cola.encolar(35);
        cola.encolar(45);
        cola.mostrar();

        System.out.println("Elemento al frente (peek): " + cola.peek());
        System.out.println("Total de elementos activos: " + cola.contarElementos());

        cola.desencolar();
        cola.mostrar();

        System.out.println("Nuevo frente (peek): " + cola.peek());
        System.out.println("Total de elementos tras desencolar: " + cola.contarElementos());
    }
}
