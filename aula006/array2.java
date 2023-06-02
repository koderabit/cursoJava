package aula006;
import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*String[] materias=new String[5];
        materias[0]="Ciências da Natureza";
        materias[1]="Ciências Humanas";
        materias[2]="Matemática e suas tecnologias";
        materias[3]="Linguagem e seus códigos";
        materias[4]="Redação";*/

        String[] materias={
            "Ciências da Natureza", "Ciências Humanas", "Matemática e suas tecnologias", "Linguagem e seus códigos", "Redação"
        };

        System.out.print("Digite o nome do aluno: ");
        String aluno = scan.nextLine();
        aluno = aluno.substring(0,1).toUpperCase()+aluno.substring(1);
        double soma =0.0;

        double[] notas=new double[5];
        for(int i =0; i<=4; i++){
            System.out.printf("Digite a nota de %s: ", materias[i]);
            notas[i] = scan.nextDouble();
            soma += notas[i];
        }
        double media = soma/5;

        System.out.printf("A média geral do aluno %s foi de %.2f!%n", aluno, media);
        scan.close();
    }
}

