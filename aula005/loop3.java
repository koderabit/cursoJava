package aula005;

public class loop3 {
    public static void main(String[] args) {
        /*DO... WHILE - APLICAÇÃO
         * do{
         * bloco de comandos
         * }while(condição)
         */
        int i=0;
        System.out.println("Início da contagem:");
        do{
            System.out.printf("%d%n", i++);
        }while(i<=10);
        System.out.println("Fim do programa...");
    }
}
