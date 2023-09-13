package entity;

public class Cocina {
    private String nombreCocina;
    private Cocinero cocinero;

    // Constructor
    public Cocina() {
        // Constructor por defecto
    }

    // Constructor que recibe nombreCocina y cocinero como argumentos
    public Cocina(String nombreCocina, Cocinero cocinero) {
        this.nombreCocina = nombreCocina;
        this.cocinero = cocinero;
    }

    // Getter para nombreCocina
    public String getNombreCocina() {
        return nombreCocina;
    }

    // Setter para nombreCocina
    public void setNombreCocina(String nombreCocina) {
        this.nombreCocina = nombreCocina;
    }

    // Getter para cocinero
    public Cocinero getCocinero() {
        return cocinero;
    }

    // Setter para cocinero
    public void setCocinero(Cocinero cocinero) {
        this.cocinero = cocinero;
    }
}
