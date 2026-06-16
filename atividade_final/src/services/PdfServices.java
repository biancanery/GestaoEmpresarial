package services;
import model.*;
public class PdfServices {

    public void gerarPdf(TipoPdf tipo) {

        switch (tipo) {

            case FOLHA_PAGAMENTO:
                System.out.println("\nPDF: Folha de Pagamento gerada.");
                break;

            case NOTA_FISCAL:
                System.out.println("\nPDF: Nota Fiscal gerada.");
                break;
        }
    }
}
