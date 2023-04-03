package aula006;

public class Array1 {
    public static void main(String[] args) {
        int[] num=new int[11]; //array de inteiros com 11 posições
        System.out.println("Início da contagem:");
        for(int i=0; i<=10; i++){
            num[i] = i; //a cada iteração, será adicionado o valor de i à posição do array, iniciando da posição 0 até a 10
            System.out.printf("%d%n", num[i]);
        }
        System.out.println("Fim do programa...");
    }
}
