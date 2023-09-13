package mesaServer;

import entity.Pedido;
import services.ClienteService;
import services.MenuService;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Mesa {
    public static void main(String[] args) throws IOException {
        ClienteService clienteService = new ClienteService();

        // Cambia la dirección IP y el puerto para el servidor TCP
        String serverAddress = "127.0.0.1"; // Cambia a la dirección real del servidor
        int serverPort = 12345;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podría indicar la cantidad de personas en esta mesa?");
        int cantidadClientes = scanner.nextInt();

        for (int i = 0; i < cantidadClientes; i++) {
            MenuService menu = new MenuService();
            menu.mostrarMenu();

            Pedido pedido = clienteService.obtenerPedido(); // Obtener pedido de ClienteService
            clienteService.enviarPedidoAlServidor(pedido, serverAddress, serverPort);
        }
    }
}
