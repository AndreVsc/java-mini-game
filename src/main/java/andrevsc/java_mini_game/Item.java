package andrevsc.java_mini_game;

public class Item {
    private String nome;
    private String descricao;
    private int peso;
    private int valor;
    private int quantidade;

    public Item(String nome, String descricao, int peso, int valor, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.peso = peso;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPeso() {
        return peso;
    }

    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", peso=" + peso +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
