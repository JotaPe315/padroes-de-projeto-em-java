package mensagem;

public class mensagemFactory {

    public Mensagem getMensagem(int i){

        if (i == 1) {
            return new MensagemSMS();

        } else if (i == 2) {
            return new MensagemEmail();

        } else {
            return null;
        }

    }

}
