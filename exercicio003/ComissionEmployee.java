package exercicio003;

public class ComissionEmployee extends Employee{
    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String first, String last, String ssn, double sales, double rate){
        super(first, last, ssn);
        setGrossSales(sales);
        setComissionRate(rate);
    }

    public void setGrossSales(double sales){
        grossSales = (sales < 0.0) ? 0.0 : sales;
    }

    public double getGrossSales(){
        return grossSales;
    }

    public void setComissionRate(double rate){
        comissionRate = (rate > 0.0 && rate < 1.0) ? rate : 0.0;
    }

    public double getComissionRate(){
        return comissionRate;
    }

    @Override
    public double getPaymentAmount(){
        return getComissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s\n%s: R$%,.2f\n%s: %,.2f", "Comission employee", super.toString(), "Gross sales", getGrossSales(), "Comission sales", getComissionRate());
    }
}
