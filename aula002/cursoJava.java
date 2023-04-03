package aula002;

public class CursoJava{
    public static void main(String[] args) {
        String msg = "Koderabit, aproximando tecnologia e pessoas."; //declarando e inicializando a variável msg
        int num = 2023; //declarando e inicializando a variável num
        System.out.print("Programação é algo muito legal!\n"); //comando de saída sem quebra de linha automática no final
        System.out.println("Iniciando o Curso de Java"); //comando de saída com quebra de linha automática no final
        System.out.printf("%s%nSince %d.",  msg, num); //comando de saída com formatação personalizada
        /*
         * %d = inteiro (int)
         * %f = real (float) 
         * %s = cadeia de caracteres (string)
         */
    }
}
