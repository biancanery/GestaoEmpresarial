package services;

import model.Produto;

public class EstoqueServices {

    public void adicionarEstoque(Produto produto, int quantidade) {
        produto.setQuantidadeEstoque(
                produto.getQuantidadeEstoque() + quantidade
        );

        System.out.println("Estoque atualizado: " +
                produto.getQuantidadeEstoque());
    }

    public void retirarEstoque(Produto produto, int quantidade) {

        if (quantidade <= produto.getQuantidadeEstoque()) {

            produto.setQuantidadeEstoque(
                    produto.getQuantidadeEstoque() - quantidade
            );

            System.out.println("Venda realizada.");
        } else {
            System.out.println("Estoque insuficiente.");
        }
    }

    public void consultarEstoque(Produto produto) {
        System.out.println(produto);
    }
}
