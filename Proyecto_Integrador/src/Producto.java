/** Un Registro del Almacén; el Nombre Identifica al Producto. */
public final class Producto {
    private final String nombre;
    private final int stock;
    private final double precio;

    public Producto(String nombre, int stock, double precio) {
        // Los datos se validan juntos antes de crear el registro.
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (stock < 0) throw new IllegalArgumentException("El stock no puede ser Negativo.");
        if (!Double.isFinite(precio) || precio < 0) {
            throw new IllegalArgumentException("El precio debe ser Finito y no Negativo.");
        }
        this.nombre = nombre.trim();
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public int getStock() { return stock; }
    public double getPrecio() { return precio; }
}