package pizzeria.menu.entities;

import java.util.List;

public class Pizza extends ElementoMenu {

    private List<Topping> toppings;

    public Pizza(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String descrizione() {
        StringBuilder descrizione = new StringBuilder(getNome() + " - €" + getPrezzo() + " (" + getCalorie() + " kcal)");

        if (!toppings.isEmpty()) {
            descrizione.append(" [Toppings: ");
            for (Topping t : toppings) {
                descrizione.append(t.getNome()).append(" ");
            }
            descrizione.append("]");
        }

        return descrizione.toString();
    }
}
