package entity;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Plato> platosDisponibles;

    public Menu() {
        // Inicializar el menú con los platos disponibles
        platosDisponibles = new ArrayList<>();
    }

    public List<Plato> getPlatosDisponibles() {
        return platosDisponibles;
    }
}