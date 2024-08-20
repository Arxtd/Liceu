import javax.swing.JOptionPane;

/*Feito por:
 * Arthur Morais Sousa
 * Luiz Henrique
 */

public class App {
    public static void main(String[] args) throws Exception {

        String valorText = JOptionPane.showInputDialog("Informe o valor que deseja dividir:");
        String denominadorText = JOptionPane.showInputDialog("Informe por qual valor deseja dividir:");
        
        float denominador = Float.parseFloat(denominadorText);
        float valor = Float.parseFloat(valorText);
        float resultado = valor / denominador;

        JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + resultado, "Resultado", 1);
        
    }
}
