package loja;

import boleto.Boleto;
import boleto.BoletoBB;
import nfe.NFE;
import nfe.NFECeara;
import venda.VendaAbstract;

public class LojaJP implements VendaAbstract {

    public NFE criarNFE(){
        NFE nfe = new NFECeara();
        return nfe;

    }

    public Boleto emitirBoleto(){
        Boleto emitirBoleto = new BoletoBB();
        return null;
    }

}
