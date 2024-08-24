package andrevsc.java_mini_game;

import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Component
public class Inventario {
    Set<Item> itens = new HashSet<>();

    void adicionarItem(Item item) {
        itens.add(item);
    }

    void removerItem(Item item) {
        itens.remove(item);
    }

    void listarItens() {
        System.err.println("\n--------------------------- Inventário ---------------------------\n");
        if (itens.isEmpty()) {
            System.out.println("                         Inventário vazio                         \n");
        } else {
            for (Item item : itens) {
                System.out.println(item.getNome() + " x " + item.getQuantidade() + " - " + item.getDescricao());
                System.out.println("-------------------------------------------------------------------");
            }
        }
    }

    void listarItensPorNome(String nome) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                System.out.println(item);
            }
        }
    }

    void listarItensPorPeso(int peso) {
        for (Item item : itens) {
            if (item.getPeso() == peso) {
                System.out.println(item);
            }
        }
    }

    void listarItensPorValor(int valor) {
        for (Item item : itens) {
            if (item.getValor() == valor) {
                System.out.println(item);
            }
        }
    }

    void listarItensPorQuantidade(int quantidade) {
        for (Item item : itens) {
            if (item.getQuantidade() == quantidade) {
                System.out.println(item);
            }
        }
    }
}