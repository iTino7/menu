package pizzeria.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pizzeria.menu.entities.Menu;
import pizzeria.menu.entities.MenuConfig;

@SpringBootApplication
public class MenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(MenuApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);

        Menu menu = context.getBean(Menu.class);
        menu.stampaMenu();
    }

}
