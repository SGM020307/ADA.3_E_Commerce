package ecommerce;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- INICIANDO SISTEMA DE PEDIDOS ---\n");

       
        Cliente clienteVIP = new Cliente("Ana López", "ana.lopez@email.com");

   
        Long idDelPedido = 987654321L;

        Pedido pedidoAmazon = new Pedido(idDelPedido, clienteVIP);
 

     
        pedidoAmazon.agregarDetalle(2, "Zapatos Deportivos", 1250.50);
        pedidoAmazon.agregarDetalle(1, "Monitor 4K 27 pulgadas", 5400.00);
        pedidoAmazon.agregarDetalle(3, "Cables HDMI", 150.00);

      
        pedidoAmazon.imprimirTicket();

        System.out.println("\n--- SIMULACIÓN DE BORRADO ---");
        
        pedidoAmazon = null; 
        
        System.out.println("Pedido borrado exitosamente.");
       
        System.out.println("¿El cliente sigue existiendo? Sí: " + clienteVIP.getNombre() + " (" + clienteVIP.getEmail() + ")");
    }
}