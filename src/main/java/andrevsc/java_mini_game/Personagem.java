package andrevsc.java_mini_game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Personagem {
    private Inventario inventario;
    private Status status;
    private String nome;
    private String raca;
    private String classe;
    private int nivel;

    @Autowired
    public Personagem(Inventario inventario, Status status) {
        this.inventario = inventario;
        this.status = status;
        this.raca = "Desconhecida";
        this.classe = "Desconhecida";
        this.nivel = 1;
    }

    public Personagem() {
        this.inventario = new Inventario();
        this.status = new Status();
        this.raca = "Desconhecida";
        this.classe = "Desconhecida";
        this.nivel = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirStatus() {
        System.err.println("\n----------------------------- Status -----------------------------");
        System.err.println("Nome: " + nome + " | Raça: " + raca + "    | Classe: " + classe);
        System.err.println("------------------------------------------------------------------");
        status.listarStatus();
        System.err.println("------------------------------------------------------------------\n");
    }

    void subirNivel() {
        nivel++;
        status.subirNivel();
        System.out.println("\nParabéns, você subiu de nível! Seu nível atual é: " + nivel);
    }

    public void adicionarItemAoInventario(Item item) {
        inventario.adicionarItem(item);
    }

    public void removerItemDoInventario(Item item) {
        inventario.removerItem(item);
    }

    public void listarItensDoInventario() {
        inventario.listarItens();
    }
}