import mensagem.Mensagem;
import mensagem.mensagemFactory;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String msg = JOptionPane.showInputDialog(null, "Tipo");
        int msgF = Integer.parseInt(msg);
        String texto = JOptionPane.showInputDialog(null, "Mensagem");
        Mensagem mf = new mensagemFactory().getMensagem(msgF);
        mf.enviar(texto);

    }
}