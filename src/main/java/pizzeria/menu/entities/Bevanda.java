package pizzeria.menu.entities;

public class Bevanda extends ElementoMenu {

    public Bevanda(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String descrizione() {
        return getNome() + " - €" + getPrezzo() + " (" + getCalorie() + " kcal)";
    }
}
