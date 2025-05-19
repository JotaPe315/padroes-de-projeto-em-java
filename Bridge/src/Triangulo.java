public class Triangulo extends Forma{


    public Triangulo(Cor cor) {
        super(cor);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um triangulo...");
        cor.aplicarCor();
    }
}
