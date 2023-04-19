package exercicio006;

public abstract class RussiaDownload implements Interface{
    private double downloadRussia;

    public RussiaDownload(double downloads){
        downloadRussia = downloads;
    }

    public void setDownloadBrasil(double downloads){
        downloadRussia = downloads;
    }

    public double getDownloadRussia(){
        return downloadRussia;
    }


    @Override
    public String toString(){
        return String.format("Total de downloads na Rússia: %,.0f", getDownloadRussia());
    }
}
