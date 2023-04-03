package aula003;
public class Condicoes2 { //condições compostas
    public static void main(String[] args) {
        double mediaTurma = 7.00;
        double nota1 = 6.5;
        double nota2 = 5.9;
        double mediaAluno = (nota1+nota2)/2;
        if(((nota1+nota2)/2)>mediaTurma){
            System.out.printf("O aluno teve média %.2f e foi aprovado.", mediaAluno);
        }
        else{
            System.out.printf("O aluno teve média %.2f e foi reprovado.", mediaAluno);
        }

    }
}
