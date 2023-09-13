package entity;

import java.util.ArrayList;

public class Mesa {
    private String nombreMesa;
    private Pedido pedido;
    private ArrayList<Cliente> clientes;

    // Constructor que recibe nombreMesa, pedido y clientes como argumentos
    public Mesa(String nombreMesa, Pedido pedido, ArrayList<Cliente> clientes) {
        this.nombreMesa = nombreMesa;
        this.pedido = pedido;
        this.clientes = clientes;
    }

    // Getter para nombreMesa
    public String getNombreMesa() {
        return nombreMesa;
    }

    // Setter para nombreMesa
    public void setNombreMesa(String nombreMesa) {
        this.nombreMesa = nombreMesa;
    }

    // Getter para pedido
    public Pedido getPedido() {
        return pedido;
    }

    // Setter para pedido
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    // Getter para clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    // Setter para clientes
    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
