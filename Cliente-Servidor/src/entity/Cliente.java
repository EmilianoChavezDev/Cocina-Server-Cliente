package entity;


public class Cliente {
    private String nombreCliente;
    private Mesa mesa;
    private Menu menu;

    // Constructor
    public Cliente(String nombreCliente, Mesa mesa, Menu menu) {
        this.nombreCliente = nombreCliente;
        this.mesa = mesa;
        this.menu = menu;
    }

    // Getters y setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Menu getMenu() {
        return menu;
    }

}
