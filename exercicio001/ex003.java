/*
 * Faça um programa que mostre na tela as seguintes informações:
 * mensagem "aprovado" se pontuação for entre 8 e 10;
 * mensagem "em recuperação" se pontuação for entre 6 e 7,9;
 * mensagem "reprovado" se pontuação for entre 0 e 6,9;
 */
package exercicio001;
import java.util.Scanner;
public class Ex003 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            double n1, n2, pontuacao;
            System.out.print("Digite a pontuação obtida na primeira avaliação: ");
            n1 = read.nextDouble();
            System.out.print("Digite a pontuação obtida na segunda avaliação: ");
            n2 = read.nextDouble();
            pontuacao = (n1 + n2)/2;
        
            if(pontuacao>=8){
                System.out.printf("Parabéns, você obteve média de %.2f pontos e portanto foi aprovado.%n", pontuacao);
            }
            else if(pontuacao>=6){
                System.out.printf("Atenção! Você obteve a média de %.2f pontos e portanto está em recuperação.%n", pontuacao);
            }
            else{
                System.out.printf("Infelizmente você obteve média de %.2f pontos e portanto está reprovado.%n", pontuacao);
            }
        }
    }    
}
