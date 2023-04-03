package aula007;
import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        /*Arrays.sort(nomeArray); -> organiza o array em ordem crescente;
         * Arrays.fill(valorPreencher); -> preenche o array com o valor determinado dentro dos parênteses;
         * Arrays.copy(arrayOrigem, posicaoArrayOrigem, arrayDestino, posicaoArrayDestino); -> copia os elementos de um array para o outro;
         * Arrays.equals(array1, array2); -> compara os arrays e retorna um valor booleano;
         * Arrays.binarySearch(nomeArray, elementoPesquisa); -> pesquisa se um elemento está no array e retorna a posição do elemento (o Array precisa estar ordenado)
         */
        
        try (Scanner read = new Scanner(System.in)) {
            int[] gabarito={1, 2, 4, 5, 3};
            int[] respostasAluno=new int[5];

            double nota=0;
            for(int i=0; i<5; i++){
                System.out.printf("Resposta da questão %d: ", i+1);
                respostasAluno[i] = read.nextInt();
                if(gabarito[i]==respostasAluno[i]){
                    nota = nota + 1;
                }
                
            }
            System.out.printf("Nota geral do aluno: %.2f", nota*2);
        }
    }
}
