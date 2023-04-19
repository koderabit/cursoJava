package exercicio003;

public class BasePlusComissionEmployee extends ComissionEmployee{
    private double baseSalary;

    public BasePlusComissionEmployee(String first, String last, String ssn, double sales, double rate, double salary){
        super(first, last, ssn, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary){
        baseSalary = (salary < 0.0) ? 0.0 : salary;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }

    @Override
    public String toString(){
        return String.format("%s %s\n%s: R$%,.2f\n%s: R$%,.2f", "Base-salaried", super.toString(), "Base-Salary", getBaseSalary(), "Comission sales value", getGrossSales()*getComissionRate());
    }
}
