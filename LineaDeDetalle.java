package ecommerce;

public class LineaDeDetalle {
    private int cantidad;
    private String producto;
    private double subtotal;

    
    public LineaDeDetalle(int cantidad, String producto, double subtotal) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = subtotal;
    }

    public double getSubtotal() { return subtotal; }
    
    @Override
    public String toString() {
        return cantidad + "x " + producto + " ($" + subtotal + ")";
    }
}