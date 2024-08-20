import javax.swing.JOptionPane;

/*
 * Desenvolvido por:
 * Arthur Morais Sousa
 * Luiz Henrique
 */

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Bem vindo(a): " + nome, "Bem vindo(a)", 1);
    }
}
