import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return produtos;
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void reporProduto(String nome, int quantidade) {
        Produto produto = buscarPorNome(nome);
        if (produto != null) {
            produto.repor(quantidade);
        }
    }

    public void venderProduto(String nome, int quantidade) {
        Produto produto = buscarPorNome(nome);
        if (produto != null) {
            produto.vender(quantidade);
        }
    }
}