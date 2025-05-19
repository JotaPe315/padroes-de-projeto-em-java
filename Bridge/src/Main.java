public class Main {
    public static void main(String[] args) {

        Forma f1 = new Quadrado(new Azul());
        f1.desenhar();
        Forma f2 = new Triangulo(new Verde());
        f2.desenhar();
        Forma f3 = new Circulo(new Verde());
        f3.desenhar();
        System.out.println("Desenvolvido por João Pedro Araújo da Silva.");
    }
}