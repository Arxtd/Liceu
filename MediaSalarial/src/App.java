/*
 * Exercício feito por:
 * Arthur Morais Sousa
 * Luiz Henrique
 */

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Calcular média salarial");
        
        float totalSalario = 0;
        for (int i = 1; i < 6; i++) {
            String input = JOptionPane.showInputDialog("Informe o salário do funcionário " + i);
            totalSalario += Float.parseFloat(input);
        }

        float media = totalSalario / 5;
        JOptionPane.showMessageDialog(null, "A média salarial é: R$" + media);
    }
}
