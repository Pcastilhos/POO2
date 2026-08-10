import java.util.List;

public class ProdutoView {
    public void exibirProdutos(List<Produto> produtos) {
        for (Produto produto : produtos) {
            produto.mostrarDetalhes();
            System.out.println();
        }
    }
}