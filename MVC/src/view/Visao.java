package view;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Visao extends JFrame {

    private JTextField n1 = new JTextField(3);
    private JTextField n2 = new JTextField(3);
    private JTextField resultado = new JTextField(6);
    private JButton somar = new JButton("Somar");
    public JLabel nome = new JLabel("João Pedro");


    public Visao(){
        JPanel painel = new JPanel();
        painel.add(n1);
        painel.add(n2);
        painel.add(somar);
        painel.add(resultado);
        painel.add(nome);


        this.add(painel);

    }
    public int getN1(){
        return Integer.parseInt(n1.getText());

    }
    public int getN2(){
        return Integer.parseInt(n2.getText());

    }
    public void setResultado(int valor){
        resultado.setText(Integer.toString(valor));
    }
    public void adicionarListener(ActionListener listener){
        somar.addActionListener(listener);
    }
    public void mensagemErro (String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
