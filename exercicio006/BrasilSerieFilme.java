package exercicio006;

public class BrasilSerieFilme extends BrasilDownload{
    private double downloadSeries;
    private double downloadFilmes;
    
    public BrasilSerieFilme(double downloads, double series, double filmes){
        super(downloads);
        setDownloadSeries(series);
        setDownloadFilmes(filmes);
    }

    public void setDownloadSeries(double series){
        downloadSeries = series;
    }
    public double getDownloadSeries(){
        return downloadSeries;
    }

    public void setDownloadFilmes(double filmes){
        downloadFilmes = filmes;
    }
    public double getDowloadFilmes(){
        return downloadFilmes;
    }

    @Override
    public String toString(){
        return String.format("Total de downloads no Brasil: %,.0f\nDownload de Séries: %,.0f\nDownload de Filmes: %,.0f", getDownloadBrasil(), getDownloadSeries(), getDowloadFilmes());
    }
}
