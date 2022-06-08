public abstract class Livro implements LivroInterface {  //classe livro esta assinando contrato c a interface livroInterface

    private String nome;

    private int quantidade;

    public Livro(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public Livro(String nome) {  //gerando um construtor só com nome p usar no ebook
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
