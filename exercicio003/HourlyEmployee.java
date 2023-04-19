package exercicio003;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked){
        super(first, last, ssn);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage){
        wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
    }

    public double getWage(){
        return wage;
    }

    public void setHours(double hoursWorked){
        hours = ((hoursWorked >= 0.0) && (hoursWorked <= 168.0)) ? hoursWorked : 0.0;
    }

    public double getHours(){
        return hours;
    }

    @Override
    public double getPaymentAmount(){
        if(getHours()<=40){
            return getHours() * getWage();
        }
        else{
            return 40 * getHours() + (getHours()-40) * getWage() * 1.5;
        }
    }

    @Override
    public String toString(){
        return String.format("Hourly employee: %s\n%s: R$%,.2f\n%s: %,.2f", super.toString(), "Hourly wage", getWage(), "Hours worked in the week", getHours());
    }
}
