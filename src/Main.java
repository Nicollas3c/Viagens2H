import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Classe Objeto         Construtor
        Turista mochileiro = new Turista("Miles Morales");
        Turista mochileira = new Turista();

        //Definir formato dos objetos
        mochileira.setNome("Gwen Stacy");
        mochileira.setCpf(Validacao.cpf("987.654.321-0"));

        //Definir comportamento
        String retorno = mochileira.viajar();
        JOptionPane.showMessageDialog(null, retorno);




    }
}