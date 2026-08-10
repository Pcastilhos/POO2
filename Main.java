import java.time.LocalDate;
public class Main{


public static void main(String[] args){

ProdutoController controller = new ProdutoController();
ProdutoView view = new ProdutoView();
Menu menu = new Menu();

controller.cadastrarProduto(new ProdutoNaoPerecivel(5.0, 5, "Caneta", 4));
controller.cadastrarProduto(new ProdutoNaoPerecivel(30.0, 10, "Caderno", 3));
controller.cadastrarProduto(new ProdutoPerecivel(30.0, 10, "Sorvete", LocalDate.of(2026, 9, 30)));
controller.cadastrarProduto(new ProdutoPerecivel(7.90, 12,"Leite",LocalDate.of(2026, 8, 20)));

menu.exibirMenu();
System.out.println("\n===== LISTA INICIAL =====");
view.exibirProdutos(controller.listarProdutos());

controller.reporProduto("Caneta", 5);
controller.reporProduto("Caderno", 10);
controller.reporProduto("Leite", 24);

System.out.println("\n===== APOS REPOSICAO =====");
view.exibirProdutos(controller.listarProdutos());

controller.venderProduto("Caneta", 10);
controller.venderProduto("Leite", 12);

System.out.println("\n===== APOS VENDAS =====");
view.exibirProdutos(controller.listarProdutos());
}
}