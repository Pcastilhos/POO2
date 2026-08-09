public class Produto{
    public String nome;
    public double preco;
    public int qtdEstoque;

    // Construtor
    public Produto(double preco, int qtdEstoque, String nome) {
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
        this.nome = nome;
    }

    public void mostrarEstoque() {
        System.out.println("===== ESTOQUE =====" );
        if (qtdEstoque<=0){
            System.out.println("Estoque ZERADO");
        }
        else {
            System.out.println( "Produto : "+ this.nome + "\nQuantidade = " + this.qtdEstoque + "\nPreço = "+this.preco);
        }
    }
    public int repor(int quantidade) {
        System.out.println("===== REPOSICAO =====" );
        if (quantidade > 0) {
            this.qtdEstoque = this.qtdEstoque + quantidade;
            System.out.println("Estoque reposto: +" + quantidade + " unidade(s) de " + nome + ".");
        } else {
            System.out.println("A quantidade para reposição deve ser maior que zero.");
        }

        return quantidade;
    }   

    public int vender (int quantidade) {
        System.out.println("===== VENDAS =====" );
        if (quantidade < 0 || quantidade > this.qtdEstoque) {
            System.out.println("A quantidade insuficiente .");
        } 
        else {
            this.qtdEstoque = this.qtdEstoque - quantidade;
            System.out.println("Vendido: " + quantidade + " unidade(s) de " + this.nome + ".");
        }
    return quantidade;
}
}