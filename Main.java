public class Main{


public static void main(String[] args){

Produto produto1 = new Produto(5.0,5,"Caneta");
Produto produto2 = new Produto(30.0,10,"Caderno");

produto1.mostrarEstoque();

produto2.mostrarEstoque();

produto1.repor(20);

produto2.repor(10);

produto1.mostrarEstoque();

produto2.mostrarEstoque();

produto1.vender(3);
produto2.vender(30);

produto1.mostrarEstoque();
produto2.mostrarEstoque();

produto1.vender(7);
produto2.vender(1);

produto1.mostrarEstoque();
produto2.mostrarEstoque();

}
}