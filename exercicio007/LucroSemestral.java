package exercicio007;

public class LucroSemestral extends Livraria{
    public LucroSemestral(double grossSalesBook, double grossSalesEbook){
        super(grossSalesBook*0.9, grossSalesEbook*0.9);
    }

    @Override
    public String toString(){
        return String.format("Lucro líquido Semestral\nLivros: R$%,.2f\nE-books: R$%,.2f", getGrossSalesBook()*6, getGrossSalesEbook()*6);
    }
}
