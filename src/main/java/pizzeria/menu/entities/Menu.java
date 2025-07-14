package pizzeria.menu.entities;

import java.util.List;

public class Menu {

    private List<ElementoMenu> elements;

    public Menu(List<ElementoMenu> elements) {
        this.elements = elements;
    }

    public void stampaMenu() {
        System.out.println("Menu della pizzeria: ");
        for (ElementoMenu e : elements) {
            System.out.println("- " + e.descrizione());
        }
    }
}
