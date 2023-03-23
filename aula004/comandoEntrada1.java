package aula004;
import java.util.Scanner; //importanto a classe Scanner
public class comandoEntrada1 {
    public static void main(String[] args) {
        try (Scanner read = new Scanner(System.in)) {
            double n1 = 0, n2 = 0, media=0;
            String res = "";

            System.out.println("Digite o seu nome:");
            String aluno = read.nextLine();
            System.out.println("Qual a nota da primeira avaliação?:");
            n1 = read.nextDouble();
            System.out.println("Qual a nota da segunda avaliação?");
            n2 = read.nextDouble();
            media = (n1+n2)/2;
            if (media>=7){
                res = "Aprovado! Parabéns!!";
            }
            else if(media>=6){
                res = "de recuperação, estude um pouco mais que você vai conseguir passar.";
            }
            else{
                res = "Reprovado. Você precisa se dedicar mais no próximo ano!";
            }
            System.out.printf("Olá, %s! A sua média geral foi %.2f e portanto você está %s%n", aluno, media, res);
        }
    }    
}
