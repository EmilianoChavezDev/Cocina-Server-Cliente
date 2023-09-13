package entity;

import java.util.ArrayList;

public class Mozo {
    private String nombreMozo;
    private ArrayList<Pedido> pedidos;

    // Constructor
    public Mozo() {
        // Constructor por defecto
        pedidos = new ArrayList<>();
    }

    // Constructor que recibe nombreMozo como argumento
    public Mozo(String nombreMozo) {
        this.nombreMozo = nombreMozo;
        pedidos = new ArrayList<>();
    }

    // Getter para nombreMozo
    public String getNombreMozo() {
        return nombreMozo;
    }

    // Setter para nombreMozo
    public void setNombreMozo(String nombreMozo) {
        this.nombreMozo = nombreMozo;
    }

    // Getter para pedidos
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    // Setter para pedidos
    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
