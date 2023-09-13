package entity;

class Plato {
    private String nombre;
    private Double precio;

    public Plato(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}


