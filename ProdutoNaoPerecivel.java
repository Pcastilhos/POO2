public class ProdutoNaoPerecivel extends Produto{

    private int garantia; 

    // Construtor
    public ProdutoNaoPerecivel(double preco, int qtdEstoque, String nome, int garantia) {
        super(preco, qtdEstoque, nome);
        this.garantia = garantia;
    }
    @Override public void mostrarEstoque() {
        System.out.println("===== ESTOQUE =====" );
        if (this.qtdEstoque<=0){
            System.out.println("Estoque " +this.nome+ " ZERADO");
        }
        else {
            System.out.println( "Produto : "+ this.nome + "\nQuantidade = " + this.qtdEstoque + "\nPreco = "+this.preco + "\nGarantia : "+this.garantia);
        }
    }
    @Override
    public int repor(int quantidade) {
        System.out.println("===== REPOSICAO =====" );
        if (quantidade > 0) {
            this.qtdEstoque = this.qtdEstoque + quantidade;
            System.out.println("Estoque reposto: +" + quantidade + " unidade(s) de " + this.nome + ".");
        } else {
            System.out.println("A quantidade para reposição deve ser maior que zero.");
        }

        return quantidade;
    }   
    @Override
    public int vender (int quantidade) {
        System.out.println("===== VENDAS =====" );
        if (quantidade < 0 || quantidade > this.qtdEstoque) {
            System.out.println("A quantidade de "+this.nome+ " insuficiente .");
        } 
        else {
            this.qtdEstoque = this.qtdEstoque - quantidade;
            System.out.println("Vendido: " + quantidade + " unidade(s) de " + this.nome + ".");
        }
    return quantidade;
}
}