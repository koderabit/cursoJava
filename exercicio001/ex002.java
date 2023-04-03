/*
 * Programe um contador para exibir a sequência de números inteiros de 1 a 20 e interrompa a contagem quando ele atingir 17.
 */
package exercicio001;

public class Ex002 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++){
            if(i==17){
                break;
            }
        System.out.printf("Número %2d%n", i);    
        } 
    }
}
