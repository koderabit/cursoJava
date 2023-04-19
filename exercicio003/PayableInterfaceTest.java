package exercicio003;

public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[5];

        payableObjects[0] = new Invoice("2021002221022235022", "Boleto material escritório", 2, 2500.56);
        payableObjects[1] = new SalariedEmployee("Jonathan", "Girafa", "202205124807", 1800.26);
        payableObjects[2] = new ComissionEmployee("Lisa", "Cacho", "201209255500", 32000, 0.1);
        payableObjects[3] = new BasePlusComissionEmployee("Le", "Poti", "202002142253", 21000.14, 0.05, 1100.00);
        payableObjects[4] = new HourlyEmployee("Charles", "Perneta", "202104256658", 7.99, 50);


        System.out.println("Invoices and Employees processed pollymorphically:\n");

        for(Payable currentPayable : payableObjects){
            System.out.printf("%s \n%s: R$%,.2f\n\n", currentPayable.toString(), "Payment due", currentPayable.getPaymentAmount());
        }
    }
}
