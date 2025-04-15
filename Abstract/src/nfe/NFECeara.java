package nfe;

import modelo.Produto;

import java.math.BigDecimal;

public class NFECeara implements NFE {

    @Override
    public Double calcularImposto(Produto produto) {
        Double imposto = new BigDecimal(0.20);

        Double valor = produto.valor;
        imposto = imposto*valor;

        return imposto;
    }
}
