/*
 * Faça um programa que leia três números a, b e c, some a e b e divida o resultado por c
 */
package exercicio001;
import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        try (Scanner num = new Scanner(System.in)) {
            double n1, n2, n3;
            System.out.print("Digite um número qualquer: ");
            n1 = num.nextDouble();
            System.out.print("\nDigite outro número qualquer: ");
            n2 = num.nextDouble();
            System.out.print("\nDigite mais um número qualquer: ");
            n3 = num.nextDouble();
            System.out.printf("A soma entre %.2f e %.2f vale %.2f e dividindo este resultado por %.2f obtemos %.2f.", n1,n2,n1+n2, n3, (n1+n2)/n3);
        }
    }    
}
