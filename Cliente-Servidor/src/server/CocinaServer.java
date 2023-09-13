package server;

package services;

import entity.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CocinaServer {
    private List<Pedido> pedidosPendientes;
    private ExecutorService chefs;

    public CocinaServer(int numChefs) {
        pedidosPendientes = new ArrayList<>();
        chefs = Executors.newFixedThreadPool(numChefs);
    }

    public void recibirPedido(Pedido pedido) {
        synchronized (pedidosPendientes) {
            pedidosPendientes.add(pedido);
        }

        // Asigna el pedido a un chef disponible
        chefs.submit(() -> {
            prepararPedido(pedido);
        });
    }

    private void prepararPedido(Pedido pedido) {
        // Simula el tiempo de preparación del pedido
        try {
            Thread.sleep(5000); // Simula 5 segundos de preparación
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Marca el pedido como completado
        pedido.setCompletado(true);

        // Devuelve el pedido completado a la mesa del cliente
        ClienteService clienteService = new ClienteService();
        clienteService.enviarPedidoAlCliente(pedido);
    }
}
