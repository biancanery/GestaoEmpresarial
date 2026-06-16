package services;
import model.*;

public class RelatorioServices {

    public void gerarRelatorio(
            TipoRelatorio tipo,
            Produto produto,
            Funcionario funcionario,
            Venda venda) {

        switch (tipo) {

            case VENDAS:
                System.out.println("\n=== RELATÓRIO DE VENDAS ===");
                System.out.println(venda);
                break;

            case ESTOQUE:
                System.out.println("\n=== RELATÓRIO DE ESTOQUE ===");
                System.out.println(produto);
                break;

            case FALTAS:
                System.out.println("\n=== RELATÓRIO DE FALTAS ===");
                System.out.println("Funcionário: " + funcionario.getNome());
                System.out.println("Faltas: " + funcionario.getFaltas());
                break;
        }
    }
}
