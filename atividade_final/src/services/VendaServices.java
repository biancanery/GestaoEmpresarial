package services;
import model.*;
public class VendaServices {

    private EstoqueServices estoqueService;

    public VendaServices() {
        estoqueService = new EstoqueServices();
    }

    public void realizarVenda(Venda venda) {

        estoqueService.retirarEstoque(
                venda.getProduto(),
                venda.getQuantidade()
        );

        System.out.println("\n=== VENDA REGISTRADA ===");
        System.out.println(venda);
    }
}
