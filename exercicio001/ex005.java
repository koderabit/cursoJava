/*
 * Crie um programa que preencha uma matriz 10 x 10 com números inteiros e exiba esta matriz na tela.
 */
package exercicio001;
import java.security.SecureRandom;
public class ex005 {
    public static void main(String[] args) {
        int[][] mat = new int [10][10];
        for(int l=0; l<10;l++){
            for(int c=0; c<10; c++){
            mat[l][c] = new SecureRandom().nextInt(100);
            }
        }
        for(int[] linha:mat){
            for(int coluna:linha){
                System.out.printf("%3d  ", coluna);
            }
            System.out.println("");
        }
    }
}
