public abstract class Produto {
    protected String nome;
    protected double preco;
    protected int qtdEstoque;

    public Produto(double preco, int qtdEstoque, String nome) {
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void repor(int quantidade) {
        if (quantidade > 0) {
            this.qtdEstoque += quantidade;
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= this.qtdEstoque) {
            this.qtdEstoque -= quantidade;
        }
    }

    public abstract void mostrarDetalhes();
}