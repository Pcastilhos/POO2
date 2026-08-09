import java.time.LocalDate;

public class ProdutoPerecivel extends Produto implements DescontoQuantidade {
    private LocalDate validade;

    // Construtor
    public ProdutoPerecivel(double preco, int qtdEstoque, String nome, LocalDate validade) {
        super(preco, qtdEstoque, nome);
        this.validade = validade;
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("===== PRODUTO PERECIVEL =====");
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + qtdEstoque);
        System.out.println("Preco: " + preco);
        System.out.println("Validade: " + this.validade);
        System.out.println("Desconto sugerido: R$ " + String.format("%.2f", calcularDesconto()));
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.10;
    }
}