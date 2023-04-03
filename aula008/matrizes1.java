package aula008;
import java.security.SecureRandom;
public class Matrizes1 {
    public static void main(String[] args) {
    final int linhas=3;
    final int colunas=5;
    int[][] matriz=new int[3][5];

    for(int l=0; l<linhas; l++){
        for(int c=0; c<colunas; c++){
            matriz[l][c] = new SecureRandom().nextInt(100);
        }
    }

    for(int[] n:matriz){
        for(int v:n){
            System.out.printf("%2d |", v);
        }
        System.out.println("");
    }
}
}