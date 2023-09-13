package services;

import repository.MenuRepository;

public class MenuService implements MenuRepository {


    @Override
    public void mostrarMenu() {
        System.out.println("----- Menú de Comida -----");
        System.out.println("1. Pizza");
        System.out.println("2. Hamburguesa");
        System.out.println("3. Sushi");
        System.out.println("4. Tacos");
        System.out.println("5. Ensalada César");
        System.out.println("6. Pasta Alfredo");
        System.out.println("7. Pollo a la Parrilla");
        System.out.println("8. Tofu Salteado");
        System.out.println("9. Tarta de Manzana");
        System.out.println("10. Helado de Chocolate");
        System.out.println("--------------------------");
        System.out.println("Que desea pedir? ");
    }

}
