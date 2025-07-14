package pizzeria.menu.entities;

public class Topping {

    protected String nome;
    protected int calorie;

    public Topping(String nome, int calorie) {
        this.nome = nome;
        this.calorie = calorie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
