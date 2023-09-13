package entity;

import java.io.Serializable;

public class Pedido implements Serializable {
    private String entrada;
    private String platoFondo;
    private String postre;
    private String bebidas;
    private int numeroPedido;
    private Boolean completado;

    // Constructor que recibe todos los campos como argumentos
    public Pedido(String entrada, String platoFondo, String postre, String bebidas, int numeroPedido, Boolean completado) {
        this.entrada = entrada;
        this.platoFondo = platoFondo;
        this.postre = postre;
        this.bebidas = bebidas;
        this.numeroPedido = numeroPedido;
        this.completado = completado;
    }

    // Constructor por defecto
    public Pedido() {
        // Puedes dejarlo vacío o configurar valores por defecto si lo deseas
    }

    // Getter para entrada
    public String getEntrada() {
        return entrada;
    }

    // Setter para entrada
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    // Getter para platoFondo
    public String getPlatoFondo() {
        return platoFondo;
    }

    // Setter para platoFondo
    public void setPlatoFondo(String platoFondo) {
        this.platoFondo = platoFondo;
    }

    // Getter para postre
    public String getPostre() {
        return postre;
    }

    // Setter para postre
    public void setPostre(String postre) {
        this.postre = postre;
    }

    // Getter para bebidas
    public String getBebidas() {
        return bebidas;
    }

    // Setter para bebidas
    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    // Getter para numeroPedido
    public int getNumeroPedido() {
        return numeroPedido;
    }

    // Setter para numeroPedido
    public void setNumeroPedido(Integer numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    // Getter para completado
    public Boolean getCompletado() {
        return completado;
    }

    public boolean isCompletado() {
        return completado;
    }

    public void setCompletado(boolean completado) {
        this.completado = completado;
    }

    @Override
    public String toString() {
        return "Pedido {" +
                "Entrada: '" + entrada + '\'' +
                ", Plato Principal: '" + platoFondo + '\'' +
                ", Postre: '" + postre + '\'' +
                ", Bebidas: '" + bebidas + '\'' +
                ", Número de Pedido: " + numeroPedido +
                ", Completado: " + completado +
                '}';
    }
}
