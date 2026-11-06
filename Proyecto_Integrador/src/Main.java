import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/** Punto de entrada del control de existencias. */
public class Main {
    public static void main(String[] argumentos) {
        ArbolBinarioBusqueda catalogo = new ArbolBinarioBusqueda();
        try (Scanner lector = new Scanner(System.in, StandardCharsets.UTF_8)) {
            boolean continuar = true;
            while (continuar) {
                presentarOpciones();
                if (!lector.hasNextLine()) break;
                String seleccion = lector.nextLine().trim().toUpperCase(Locale.ROOT);
                try {
                    switch (seleccion) {
                        case "A": {
                            String etiqueta = solicitar(lector, "Nombre del Producto: ");
                            int unidades = Integer.parseInt(solicitar(lector, "Unidades Disponibles: "));
                            // Se acepta la coma decimal, pero no separadores de miles.
                            double importe = Double.parseDouble(solicitar(lector, "Precio Unitario: ").replace(',', '.'));
                            boolean alta = catalogo.insertar(new Producto(etiqueta, unidades, importe));
                            System.out.println(alta ? "Alta Guardada." : "Nombre Duplicado: Se conserva el Registro Anterior.");
                            break;
                        }
                        case "B": {
                            Producto coincidencia = catalogo.buscar(solicitar(lector, "Producto a Consultar: "));
                            if (coincidencia == null) System.out.println("No hay un Producto con ese Nombre.");
                            else { titulosListado(); imprimir(coincidencia); }
                            break;
                        }
                        case "C": {
                            String retirada = solicitar(lector, "Producto que se Retira: ");
                            boolean baja = catalogo.eliminar(retirada);
                            System.out.println(baja ? "Baja Realizada: " + retirada + "." : "No hay un Producto con ese Nombre.");
                            break;
                        }
                        case "D": {
                            List<Producto> listado = catalogo.inOrder();
                            if (listado.isEmpty()) System.out.println("No hay Existencias Registradas.");
                            else {
                                titulosListado();
                                for (Producto registro : listado) imprimir(registro);
                            }
                            break;
                        }
                        case "E":
                            System.out.println("Sesión Finalizada.");
                            continuar = false;
                            break;
                        default:
                            System.out.println("Selecciona una letra de A a E.");
                    }
                } catch (NumberFormatException datoIncorrecto) {
                    // El menú sigue disponible después de un dato mal escrito.
                    System.out.println("Captura Inválida: Usa un Entero para Unidades y un Número para el Precio.");
                } catch (IllegalArgumentException registroIncorrecto) {
                    System.out.println(registroIncorrecto.getMessage());
                } catch (EntradaAgotada fin) {
                    System.out.println("\n Entrada Terminada. Sesión Finalizada.");
                    continuar = false;
                }
            }
        }
    }

    private static void presentarOpciones() {
        System.out.println("\n----------------------------------------------");
        System.out.println("  ALMACÉN | CONTROL DE EXISTENCIAS");
        System.out.println("  Organización por Árbol Binario de Búsqueda  ABB ");
        System.out.println("----------------------------------------------");
        System.out.println("  A  Alta de Producto      B  Consulta por Nombre");
        System.out.println("  C  Baja de Producto      D  Listado Ordenado");
        System.out.println("  E  Cerrar Sesión");
        System.out.print("Seleccionar > ");
    }

    private static String solicitar(Scanner lector, String aviso) {
        System.out.print(aviso);
        if (!lector.hasNextLine()) throw new EntradaAgotada();
        return lector.nextLine().trim();
    }

    private static void titulosListado() {
        System.out.printf("%n%-24s | %8s | %10s%n", "ARTÍCULO", "UNIDADES", "PRECIO");
        System.out.println("-------------------------+----------+-----------");
    }

    private static void imprimir(Producto registro) {
        System.out.printf(Locale.ROOT, "%-24s | %8d | %10.2f%n",
                registro.getNombre(), registro.getStock(), registro.getPrecio());
    }

    private static class EntradaAgotada extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }
}