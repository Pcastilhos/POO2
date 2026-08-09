import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    private LocalDate validade;

    // Construtor
    public ProdutoPerecivel(double preco, int qtdEstoque, String nome, LocalDate validade) {
        super(preco, qtdEstoque, nome);
        this.validade = validade;
    }
    @Override
    public void mostrarEstoque() {
        System.out.println("===== ESTOQUE =====" );
        if (qtdEstoque<=0){
            System.out.println("Estoque " +this.nome+ " ZERADO");
        }
        else {
            System.out.println( "Produto : "+ nome + "\nQuantidade = " + qtdEstoque + "\nPreco = "+preco +"\nValidade : "+this.validade);
        }
    }
    @Override
    public int repor(int quantidade) {
        System.out.println("===== REPOSICAO =====" );
        if (quantidade > 0) {
            qtdEstoque = this.qtdEstoque + quantidade;
            System.out.println("Estoque reposto: +" + quantidade + " unidade(s) de " + nome + ".");
        } else {
            System.out.println("A quantidade para reposição deve ser maior que zero.");
        }

        return quantidade;
    }   
    @Override
    public int vender (int quantidade) {
        System.out.println("===== VENDAS =====" );
        if (quantidade < 0 || quantidade > qtdEstoque) {
            System.out.println("A quantidade de "+this.nome+ " insuficiente .");
        } 
        else {
            this.qtdEstoque = qtdEstoque - quantidade;
            System.out.println("Vendido: " + quantidade + " unidade(s) de " + nome + ".");
        }
    return quantidade;
}
}