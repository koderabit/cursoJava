import javax.swing.JOptionPane;

package exercicio008;

public class JavaGui {
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        String secondNumber = JOptionPane.showInputDialog("Digite o segundo número inteiro");

        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        int soma = number1 + number2;

        JOptionPane.showMessageDialog(null, "A soma entre eles é" + soma, "Soma entre 2 inteiros", JOptionPane.PLAIN_MESSAGE);
    }
}
