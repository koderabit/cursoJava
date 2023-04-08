package aula009;

public class Metodos003 {
    public static void main(String[] args) {
        int num1 = 100, num2 =50;
        double num3 = 500.00, num4 = 0.00;
        System.out.println("Calculadora simples");
        System.out.printf("Soma entre %d e %d = %d.%n", num1, num2, soma(num1, num2));
        System.out.printf("Diferença entre %d e %d = %d.%n", num1, num2, diferenca(num1, num2));
        System.out.printf("Multiplicação entre %d e %d = %d.%n", num1, num2, multiplicacao(num1, num2));
        System.out.printf("Divisão inteira entre %d e %d = %d.%n", num1, num2, divisao(num1, num2));
        System.out.printf("Divisão real entre %.2f e %.2f = %.2f.%n", num3, num4, divisao(num3, num4));
    }

    //métodos com parâmetros obrigatórios e retorno do tipo int
    //Calculadora de inteiros simples
    public static int soma(int n1, int n2){
        int res = n1+n2;
        return res;
    }

    public static int diferenca(int n1, int n2){
        int res = n1-n2;
        return res;
    }

    public static int multiplicacao(int n1, int n2){
        int res = n1*n2;
        return res;
    }

    public static int divisao(int n1, int n2){
        int res = 0;
        if(n2==0){
            System.out.println("Erro: Divisão por 0.");
            res = 999999999;
        }
        else{
            res = n1/n2;
        }
        return res;
    }
    public static double divisao(double n1, double n2){//sobrecarga do método divisao;
        double res = 0.0;
        if(n2==0){
            System.out.println("Erro: Divisão por 0.");
        }
        else{
            res = n1/n2;
        }
        return res;
    }
}
