package boleto;

import modelo.Produto;

import java.math.BigDecimal;

public interface Boleto {

    public void emitirBoleto(Produto produto, Double imposto);

}
