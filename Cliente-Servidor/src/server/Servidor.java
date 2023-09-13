package server;

import entity.Pedido;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        // Cambia el número de puerto según tu configuración
        int serverPort = 12345;

        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            System.out.println("El servidor ha arrancado");

            while (true) {
                Socket clientSocket = serverSocket.accept();

                // Crear un nuevo hilo para manejar la solicitud del cliente
                Thread clientHandler = new Thread(() -> {
                    try {
                        ObjectInputStream inputStream = new ObjectInputStream(clientSocket.getInputStream());
                        Pedido pedido = (Pedido) inputStream.readObject();

                        System.out.println("Pedido recibido - Entrada: " + pedido.getEntrada() +
                                ", Plato Principal: " + pedido.getPlatoFondo() +
                                ", Postre: " + pedido.getPostre() +
                                ", Bebidas: " + pedido.getBebidas() +
                                ", Número de Pedido: " + pedido.getNumeroPedido());


                        // Aquí puedes procesar el pedido según tus necesidades

                        inputStream.close();
                        clientSocket.close();
                    } catch (IOException | ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                });

                clientHandler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
