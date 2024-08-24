package andrevsc.java_mini_game;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class Menu {
    private Set<Personagem> personagens = new HashSet<>();
    private Personagem personagemSelecionado;

    public void criarPersonagem(Personagem personagem, String nome) {
        personagem.setNome(nome);
        personagens.add(personagem);
    }

    public void criarItem(String nome, String descricao, int peso, int valor, int quantidade) {
        Item item = new Item(nome, descricao, peso, valor, quantidade);
        personagemSelecionado.adicionarItemAoInventario(item);
    }

    public void excluirPersonagem(String nome) {
        personagens.removeIf(personagem -> personagem.getNome().equals(nome));
    }

    public void selecionarPersonagem(String nome) {
        for (Personagem personagem : personagens) {
            if (personagem.getNome().equals(nome)) {
                personagemSelecionado = personagem;
                break;
            }
        }
    }

    public void exibirStatus() {
        if (personagemSelecionado != null) {
            personagemSelecionado.exibirStatus();
        } else {
            System.out.println("Nenhum personagem selecionado.");
        }
    }

    public void subirNivel() {
        if (personagemSelecionado != null) {
            personagemSelecionado.subirNivel();
        } else {
            System.out.println("Nenhum personagem selecionado.");
        }
    }

    public void listarItensDoInventario() {
        if (personagemSelecionado != null) {
            personagemSelecionado.listarItensDoInventario();
        } else {
            System.out.println("Nenhum personagem selecionado.");
        }
    }

    public void voltarAoMenu() {
        personagemSelecionado = null;
    }

    public void listarPersonagens() {
        System.out.println("\n----------------------- Personagens ---------------------");
        if (personagens.isEmpty()) {
            System.out.println("                 Nenhum personagem criado                    ");
        } else {
            for (Personagem personagem : personagens) {
                System.out.println(personagem);
                System.out.println("----------------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Criar Personagem");
            System.out.println("2. Excluir Personagem");
            System.out.println("3. Selecionar Personagem");
            System.out.println("4. Listar Personagens");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Nome do personagem:");
                    String nome = scanner.nextLine();
                    Personagem personagem = new Personagem();
                    menu.criarPersonagem(personagem, nome);
                    break;
                case 2:
                    System.out.println("Nome do personagem a excluir:");
                    nome = scanner.nextLine();
                    menu.excluirPersonagem(nome);
                    break;
                case 3:
                    System.out.println("Nome do personagem a selecionar:");
                    nome = scanner.nextLine();
                    menu.selecionarPersonagem(nome);
                    while (menu.personagemSelecionado != null) {
                        System.out.println("1. Exibir Status");
                        System.out.println("2. Subir Nível");
                        System.out.println("3. Listar Itens do Inventário");
                        System.out.println("4. Voltar ao Menu");
                        int subOpcao = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        switch (subOpcao) {
                            case 1:
                                menu.exibirStatus();
                                break;
                            case 2:
                                menu.subirNivel();
                                break;
                            case 3:
                                menu.listarItensDoInventario();
                                break;
                            case 4:
                                menu.voltarAoMenu();
                                break;
                        }
                    }
                    break;
                case 4:
                    menu.listarPersonagens();
                    break;
                case 5:
                    scanner.close();
                    return;
            }
        }
    }
}