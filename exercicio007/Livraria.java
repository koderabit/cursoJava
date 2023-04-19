package exercicio007;

public abstract class Livraria {
    private double grossSalesBook;
    private double grossSalesEbook;

    public Livraria(double salesBook, double salesEbook){
        grossSalesBook = salesBook;
        grossSalesEbook = salesEbook;
    }

    public void setGrossSalesBook(double salesEbook){
        grossSalesBook = salesEbook;
    }

    public double getGrossSalesBook(){
        return grossSalesBook;
    }

    public void setGrossSalesEbook(double salesEbook){
        grossSalesBook = salesEbook;
    }

    public double getGrossSalesEbook(){
        return grossSalesEbook;
    }

    @Override
    public String toString(){
        return String.format("Venda bruta mensal\nLivros: R$%,.2f\nE-books: R$%,.2f", getGrossSalesBook(), getGrossSalesEbook());
    }
}
