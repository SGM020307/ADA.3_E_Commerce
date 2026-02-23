package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Long id;
    private Double total;


    private Cliente cliente;

    private List<LineaDeDetalle> detalles;

    public Pedido(Long id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        

        this.detalles = new ArrayList<>(); 
        this.total = null; 
    }

 
    public void agregarDetalle(int cantidad, String producto, double precioUnitario) {
        double subtotal = cantidad * precioUnitario;
        LineaDeDetalle nuevaLinea = new LineaDeDetalle(cantidad, producto, subtotal);
        this.detalles.add(nuevaLinea);
        
        recalcularTotal();
    }

    private void recalcularTotal() {
        double suma = 0.0;
        for (LineaDeDetalle linea : detalles) {
            suma += linea.getSubtotal();
        }
        this.total = suma; 
    }

    public void imprimirTicket() {
        System.out.println("=== Pedido #" + id + " ===");
        

        System.out.println("Cliente: " + cliente.getNombre() + " | Contacto: " + cliente.getEmail());
        
        System.out.println("--- Detalles ---");
        for (LineaDeDetalle d : detalles) {
            System.out.println("- " + d.toString());
        }
        System.out.println("TOTAL: $" + (total != null ? total : "ERROR DE CÁLCULO"));
    }
}
