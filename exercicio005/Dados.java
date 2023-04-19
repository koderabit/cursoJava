package exercicio005;

public abstract class Dados {
    private String name;
    private String surname;
    private double salary;

    public Dados(String nome, String sobrenome, double salario){
        name = nome;
        surname = sobrenome;
        salary = salario;
    }

    public void setName(String nome){
        name = nome;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String sobrenome){
        surname = sobrenome;
    }
    public String getSurname(){
        return surname;
    }

    public void setSalary(double salario){
        salary = (salario<0.0)? 0.0 : salario;
    }
    public double getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s\nSobrenome: %s\nSalário: R$%,.2f", getName(), getSurname(), getSalary());
    }
}
