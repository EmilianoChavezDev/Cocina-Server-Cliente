package services;

import entity.Pedido;
import repository.ClienteRepository;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteService implements ClienteRepository {
    private int contadorPedidos = 0;

    @Override
    public int verificarCantidadClientes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podría indicar la cantidad de personas en esta mesa?");
        return scanner.nextInt();
    }

    public Pedido obtenerPedido() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrada: ");
        String entrada = scanner.nextLine();
        System.out.print("Plato Principal: ");
        String platoFondo = scanner.nextLine();
        System.out.print("Postre: ");
        String postre = scanner.nextLine();
        System.out.print("Bebida: ");
        String bebidas = scanner.nextLine();
        contadorPedidos++;
        Pedido pedido = new Pedido(entrada, platoFondo, postre, bebidas, contadorPedidos, false);
        return pedido;
    }

    public void enviarPedidoAlServidor(Pedido pedido, String serverAddress, int serverPort) {
        try (Socket socket = new Socket(serverAddress, serverPort)) {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(pedido);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
