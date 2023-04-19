package exercicio007;

public class Lucro18Meses extends Livraria{
    public Lucro18Meses(double grossSalesBook, double grossSalesEbook){
        super(grossSalesBook*0.9, grossSalesEbook*0.9);
    }

    @Override
    public String toString(){
        return String.format("Lucro líquido após 1 ano e meio de vendas\nLivros: R$%,.2f\nE-books: R$%,.2f", getGrossSalesBook()*18, getGrossSalesEbook()*18);
    }
}
