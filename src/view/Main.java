package view;

import model.Categoria;
import model.Item;
import model.Produto;
import model.Venda;

public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.adicionarItem(new Item(1, new Produto(1, "Arroz", 6.20, Categoria.ALIMENTICIO), 3));
        venda.adicionarItem(new Item(1, new Produto(2, "Calabresa", 8.50, Categoria.ALIMENTICIO), 2));
        Double valorTotal = 0.0;
        for(Item item : venda.getItens()){
            System.out.println(
                    "Nome: "
                    + item.getProduto().getDescricao()
                    + " Qtd: " + Math.round(item.getQuantidade())
                    + " Val Unit " + item.getProduto().getPreco()
                    + " Subtotal: " + item.getSubtotal() +
                    " Categoria: "
                    + item.getProduto().getCategoria());
        }
        System.out.println("Valor total: " + venda.getTotal());
    }
}