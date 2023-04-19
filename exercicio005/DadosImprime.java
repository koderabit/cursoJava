package exercicio005;

public class DadosImprime extends Dados{

    public DadosImprime(String name, String surname, double salary){
        super(name, surname, salary);
    }

    @Override
    public String toString(){
        return String.format("Nome: %s\nSobrenome: %s\nSalário: R$%,.2f", getName(), getSurname(), getSalary());
    }
}
