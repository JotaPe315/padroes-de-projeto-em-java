import controller.Controlador;
import model.Modelo;
import view.Visao;

public class Main {
    public static void main(String[] args) {

        Modelo modelo = new Modelo();
        Visao visao = new Visao();
        Controlador controlador = new Controlador(visao, modelo);

        controlador.visao.setVisible(true);

    }
}