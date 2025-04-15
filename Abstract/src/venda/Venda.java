package venda;

import boleto.Boleto;
import modelo.Produto;
import nfe.NFE;

import java.math.BigDecimal;

public class Venda {

    private NFE notaFiscal;
    private Boleto boleto;

    public Venda(VendaAbstract vendaAbstract){
        this.notaFiscal = vendaAbstract.criarNFE();
        this.boleto = vendaAbstract.emitirBoleto();
    }

    public void realizarVenda(Produto produto){
        Double imposto = notaFiscal.calcularImposto(produto);
        boleto.emitirBoleto(produto, imposto);
    }

}
