import java.time.LocalDate;
import java.util.ArrayList;
public class Main{


public static void main(String[] args){

ArrayList<Produto> produtos = new ArrayList<>();

produtos.add(new ProdutoNaoPerecivel(5.0, 5, "Caneta", 4));
produtos.add(new ProdutoNaoPerecivel(30.0, 10, "Caderno", 3));
produtos.add(new ProdutoPerecivel(30.0, 10, "Sorvete", LocalDate.of(2026, 9, 30)));
produtos.add(new ProdutoPerecivel(7.90, 12,"Leite",LocalDate.of(2026, 8, 20)));
produtos.add(new Produto(500.00,3,"Polystation"));


for (Produto p : produtos) {
    p.mostrarEstoque();
}

//REPOR 
for (Produto p : produtos) {
    if (p.getNome().equals("Caneta")) {
        p.repor(5);
    }
}
for (Produto p : produtos) {
    if (p.getNome().equals("Caderno")) {
        p.repor(10);
    }
}
for (Produto p : produtos) {
    if (p.getNome().equals("Leite")) {
        p.repor(24);
    }
}
for (Produto p : produtos) {
    p.mostrarEstoque();
}    


for (Produto p : produtos) {
    if (p.getNome().equals("Caneta")) {
        p.vender(10);
    }
}
for (Produto p : produtos) {
    if (p.getNome().equals("Polystation")) {
        p.vender(4);
    }
}
for (Produto p : produtos) {
    if (p.getNome().equals("Leite")) {
        p.vender(12);
    }
}
for (Produto p : produtos) {
    p.mostrarEstoque();
}    
/*
produto1.vender(7);
produto2.vender(1);
produto3.vender(2);

produto1.mostrarEstoque();
produto2.mostrarEstoque();
produto3.mostrarEstoque();
*/
}
}