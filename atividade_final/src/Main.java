import model.*;
import services.*;
public class Main {

    public static void main(String[] args) {

        Cliente cliente =
                new Cliente(1,
                        "Luis",
                        "123456789",
                        "83999999999");

        Funcionario funcionario =
                new Funcionario(1,
                        "Joao",
                        "Vendedor",
                        2500,
                        2);

        Produto produto =
                new Produto(1,
                        "Notebook",
                        3500,
                        10);

        Venda venda = new Venda(
                        1,
                        cliente,
                        produto,
                        2);

        EstoqueServices estoqueService =
                new EstoqueServices();

        VendaServices vendaService =
                new VendaServices();

        RelatorioServices relatorioService =
                new RelatorioServices();

        PdfServices pdfService =
                new PdfServices();

        estoqueService.consultarEstoque(produto);

        vendaService.realizarVenda(venda);

        estoqueService.consultarEstoque(produto);

        relatorioService.gerarRelatorio(
                TipoRelatorio.VENDAS,
                produto,
                funcionario,
                venda
        );

        relatorioService.gerarRelatorio(
                TipoRelatorio.ESTOQUE,
                produto,
                funcionario,
                venda
        );

        relatorioService.gerarRelatorio(
                TipoRelatorio.FALTAS,
                produto,
                funcionario,
                venda
                );

        pdfService.gerarPdf(
                TipoPdf.FOLHA_PAGAMENTO);

        pdfService.gerarPdf(
                TipoPdf.NOTA_FISCAL);
    }
}