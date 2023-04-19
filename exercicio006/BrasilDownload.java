package exercicio006;

public abstract class BrasilDownload implements Interface{
    private double downloadBrasil;

    public BrasilDownload(double downloads){
        downloadBrasil = downloads;
    }

    public void setDownloadBrasil(double downloads){
        downloadBrasil = downloads;
    }

    public double getDownloadBrasil(){
        return downloadBrasil;
    }


    @Override
    public String toString(){
        return String.format("Total de downloads no Brasil: %,.0f", getDownloadBrasil());
    }
}