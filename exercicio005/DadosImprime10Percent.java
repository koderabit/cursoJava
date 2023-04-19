package exercicio005;

public class DadosImprime10Percent extends Dados {
    public DadosImprime10Percent(String name, String surname, double salary){
        super(name, surname, salary*1.1);
    }

    @Override
    public String toString(){
        return String.format("Nome: %s\nSobrenome: %s\nSalário: R$%,.2f", getName(), getSurname(), getSalary());
    }
}
