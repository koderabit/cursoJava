package exercicio004;
import java.util.Scanner;

public class EmailInvalidoException extends Exception {
    public EmailInvalidoException (String mensagem, Throwable causa) {
        super(mensagem, causa);
    }


    public static void validarEmail(String email) throws EmailInvalidoException{
        if(!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")){
            throw new EmailInvalidoException("Endereço de e-mail inválido: " + email, new IllegalArgumentException());
        }
    }

    public static void main(String[] args) throws EmailInvalidoException{
        Scanner read = new Scanner(System.in);
        String email;

        System.out.println("Digite o seu e-mail:");
        email = read.nextLine();

        try {
            validarEmail(email);
            System.out.println("E-mail válido!");
        } catch (Exception e) {
            System.out.println("Erro ao validar o e-mail: \n"+e.getMessage());
        }finally{
            System.out.println("Verificação de e-mail concluída.");
            read.close();
        }
    }
}