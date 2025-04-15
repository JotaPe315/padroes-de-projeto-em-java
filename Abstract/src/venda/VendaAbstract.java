package venda;

import boleto.Boleto;
import nfe.NFE;

public interface VendaAbstract {

    public NFE criarNFE();
    public Boleto emitirBoleto();

}
