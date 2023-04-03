package aula005;

public class Loop1 {
    public static void main(String[] args) {
        /*FOR - APLICAÇÃO:
         * for(variávelContadora; condiçãoDeExecução; Incremento/Decremento){
         *  bloco de comando
         * }
        */
        System.out.println("Contando de 0 a 10:");
        for(int i=0; i<=10; i++){
            System.out.printf("%d%n", i);
        }
        System.out.print("Fim da contagem...");
    }
}
