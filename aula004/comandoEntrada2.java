package aula004;
import java.util.Scanner;
public class ComandoEntrada2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            final double MEDIA_CORTE_MEDICINA = 800.00, MEDIA_CORTE_ENGENHARIA_SOFTWARE = 750.00, MEDIA_CORTE_METEOROLOGIA = 750.00;
            String aluno = "";
            System.out.println("ENEM 2023.");
            System.out.print("Digite o nome do aluno: ");
            aluno = scan.nextLine();
            System.out.print("Nota de ciências da natureza: ");
            double cnAluno1 = scan.nextDouble();
            System.out.print("Nota de ciências humanas: ");
            double chAluno1 = scan.nextDouble();
            System.out.print("Nota de matemática e suas tecnologias: ");
            double matAluno1 = scan.nextDouble();
            System.out.print("Nota de linguagens e seus códigos: ");
            double langAluno1 = scan.nextDouble();
            System.out.print("Nota de redação: ");
            double redAluno1 = scan.nextDouble();
            
            double mediaAluno1 = (cnAluno1+chAluno1+matAluno1+langAluno1+redAluno1)/5;
            
            System.out.print("\nEscolha o seu curso digitando o número adequado:\nDigite 1 para Medicina.\nDigite 2 para Engenharia de Software.\nDigite 3 para Meteorologia.\n\nOpção desejada: ");
            int opcaoCurso = scan.nextInt();

            System.out.print("\nEstudou o ensino médio inteiro no estado do Pará?\nDigite 1 para Sim e 2 para não: ");
            int dezPorcento = scan.nextInt();
            if(dezPorcento == 1){
                mediaAluno1 = mediaAluno1 * 1.1;
            }
            else if(dezPorcento > 2 || dezPorcento < 1){
                System.out.print("Opção inválida, tente novamente: ");
                dezPorcento = scan.nextInt();
            }

            if(opcaoCurso == 1){
                if(mediaAluno1 >= MEDIA_CORTE_MEDICINA){
                    System.out.printf("Parabéns, %s! Você obteve a média de %.2f e foi aprovado em Medicina. Vamos festejar!", aluno, mediaAluno1);
                }
                else if(mediaAluno1 < 800 && mediaAluno1 >= 500){
                    System.out.printf("Candidato %s, verificamos que você obteve a média de %.2f e se classificou para a lista de espera do curso de Medicina.", aluno, mediaAluno1);
                }
                else if(mediaAluno1 < 500){
                    System.out.printf("%s, infelizmente você obteve a média de %.2f e portanto não conseguiu se classificar para o curso de Medicina.", aluno, mediaAluno1);
                }
            }
            else if(opcaoCurso == 2){
                if(mediaAluno1 >= MEDIA_CORTE_ENGENHARIA_SOFTWARE){
                    System.out.printf("Parabéns, %s! Você obteve a média de %.2f e foi aprovado em Engenharia de Software. Vamos festejar!", aluno, mediaAluno1);
                }
                else if(mediaAluno1 < 750 && mediaAluno1 >= 500){
                    System.out.printf("Candidato %s, verificamos que você obteve a média de %.2f e se classificou para a lista de espera do curso de Engenharia de Software.", aluno, mediaAluno1);
                }
                else if(mediaAluno1 < 500){
                    System.out.printf("%s, infelizmente você obteve a média de %.2f e portanto não conseguiu se classificar para o curso de Engenharia de Software.", aluno, mediaAluno1);
                }
            }
            else if(opcaoCurso == 3){
                if(mediaAluno1 >= MEDIA_CORTE_METEOROLOGIA){
                    System.out.printf("Parabéns, %s! Você obteve a média de %.2f e foi aprovado em Meteorologia. Vamos festejar!", aluno, mediaAluno1);
                }
                else if(mediaAluno1 < 750 && mediaAluno1 >= 500){
                    System.out.printf("Candidato %s, verificamos que você obteve a média de %.2f e se classificou para a lista de espera do curso de Meteorologia.", aluno, mediaAluno1);
                }
                else if(mediaAluno1 < 500){
                    System.out.printf("%s, infelizmente você obteve a média de %.2f e portanto não conseguiu se classificar para o curso de Meteorologia.", aluno, mediaAluno1);
                }
            }
            else{
                System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
