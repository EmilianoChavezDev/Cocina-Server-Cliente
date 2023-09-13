package entity;

public class Cocinero {
    private String nombreCocinero;

    // Constructor
    public Cocinero() {
        // Constructor por defecto
    }

    // Constructor que recibe nombreCocinero como argumento
    public Cocinero(String nombreCocinero) {
        this.nombreCocinero = nombreCocinero;
    }

    // Getter para nombreCocinero
    public String getNombreCocinero() {
        return nombreCocinero;
    }

    // Setter para nombreCocinero
    public void setNombreCocinero(String nombreCocinero) {
        this.nombreCocinero = nombreCocinero;
    }
}
