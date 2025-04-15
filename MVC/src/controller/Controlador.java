package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Modelo;
import view.Visao;

public class Controlador {

    public Visao visao;
    public Modelo modelo;

    public Controlador(Visao visao, Modelo modelo){
        this.visao = visao;
        this.modelo = modelo;
        this.visao.adicionarListener(new Listener());
    }
    class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int n1,n2 = 0;
            try {
                n1 = visao.getN1();
                n2 = visao.getN2();
                modelo.somarNumeros(n1, n2);
                visao.setResultado(modelo.getValor());

            } catch (Exception e2) {
                //mensagem de erro
                visao.mensagemErro("ERRO");
            }

        }

    }

}
