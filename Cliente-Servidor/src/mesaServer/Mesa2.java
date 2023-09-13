package mesaServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Mesa2 {
    public static void main(String[] args) {
        try {
            InetAddress group = InetAddress.getByName("239.0.0.1");
            int port = 1111;
            while (true) {
                String pedido = "Pedido de mesa 2"; // Mensaje de ejemplo
                byte[] buffer = pedido.getBytes();

                DatagramSocket socket = new DatagramSocket();
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, port);
                socket.send(packet);

                Thread.sleep(1000); // Simular un pedido cada segundo
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
