package exercicio003;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String first, String last, String ssn, double salary){
        super(first, last, ssn);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary){
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }

    public double getWeeklySalary(){
        return weeklySalary;
    }

    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("Salaried employee: %s\n%s: R$%,.2f", super.toString(), "Weekly salary", getWeeklySalary());
    }
}
