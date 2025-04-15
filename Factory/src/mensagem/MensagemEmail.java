package mensagem;

import javax.swing.*;

public class MensagemEmail implements Mensagem{

    public void enviar(String mensagem){
        JOptionPane.showMessageDialog(null,
                "Email: "+mensagem);



    }

}
