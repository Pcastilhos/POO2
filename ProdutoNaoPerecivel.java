public class ProdutoNaoPerecivel extends Produto {

    private int garantia; 

    // Construtor
    public ProdutoNaoPerecivel(double preco, int qtdEstoque, String nome, int garantia) {
        super(preco, qtdEstoque, nome);
        this.garantia = garantia;
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("===== PRODUTO NAO PERECIVEL =====");
        System.out.println("Produto: " + this.nome);
        System.out.println("Quantidade: " + this.qtdEstoque);
        System.out.println("Preco: " + this.preco);
        System.out.println("Garantia: " + this.garantia + " mes(es)");
    }
}