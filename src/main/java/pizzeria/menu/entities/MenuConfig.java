package pizzeria.menu.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {


    //Toppings
    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 80);
    }

    @Bean
    public Topping ananas() {
        return new Topping("ananas", 200);
    }

    //Pizze

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 700, 5.0, List.of());
    }

    @Bean
    public Pizza hawaiianPizza() {
        return new Pizza("Hawaiian Pizza", 840, 7.5, Arrays.asList(prosciutto(), ananas()));
    }

    //Bevande
    public Bevanda cocaCola() {
        return new Bevanda("Coca Cola", 140, 2.0);
    }

    public Bevanda acquaNaturale() {
        return new Bevanda("San Benedetto", 40, 1.50);
    }

    //Menu finale
    @Bean
    public Menu menu() {
        return new Menu(List.of(
                margherita(),
                hawaiianPizza(),
                acquaNaturale()
        ));
    }

}

