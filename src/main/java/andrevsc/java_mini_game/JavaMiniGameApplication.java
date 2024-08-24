package andrevsc.java_mini_game;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaMiniGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMiniGameApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(Menu menu) {
        return args -> {
            menu.criarPersonagem(new Personagem(), "Personagem 1");
            menu.criarPersonagem(new Personagem(), "Personagem 2");
            menu.criarPersonagem(new Personagem(), "Personagem 3");

            menu.selecionarPersonagem("Personagem 1");
            menu.exibirStatus();
            menu.subirNivel();
			menu.criarItem("espada", "Diria que afiada o suficiente para se cortar só olhar", 6, 10, 1);
			menu.criarItem("bulsola", "Enquanto estiver indo em frente nunca volte para trás", 1, 7, 1);
            menu.exibirStatus();
            menu.listarItensDoInventario();
			
            menu.selecionarPersonagem("Personagem 2");
            menu.exibirStatus();
            menu.subirNivel();
			menu.criarItem("bulsola", "Enquanto estiver indo em frente nunca volte para trás", 1, 7, 1);
			menu.criarItem("predra filosofal", "isentara os custos de mana de qualquer magia", 1, 7, 1);
			menu.criarItem("cajado", "Subestimar o inimigo pela sua arma é uma escolha fatal", 1, 7, 1);
            menu.exibirStatus();
            menu.listarItensDoInventario();

            menu.selecionarPersonagem("Personagem 3");
            menu.exibirStatus();
            menu.subirNivel();
            menu.exibirStatus();
            menu.listarItensDoInventario();
        };
    }
}