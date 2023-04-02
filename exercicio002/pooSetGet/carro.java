package exercicio002.pooSetGet;
import java.util.Scanner;
import java.text.DecimalFormat;
public class carro{ //início da classe carro
    String modelo, fabricante, cor, placa;
    double valor;
    int numPortas, anoModelo, anoFabricacao;

    //início dos métodos Set, verificando se as variáveis serão preenchidas
    public void setModelo(String model){
        if(!model.isEmpty()){
            modelo = model;
        }
    }

    public void setFabricante(String manufacturer){
        if(!manufacturer.isEmpty()){
            fabricante = manufacturer;
        }
    }

    public void setCor(String color){
        if(!color.isEmpty()){
            cor = color;
        }
    }

    public void setPlaca(String plate){
        if(!plate.isEmpty()){
            placa = plate;
        }
    }

    public void setValor(double value){
        if(value>0.0){
            valor = value;
        }
    }

    public void setNumPortas(int numberDoors){
        if(numberDoors>0){
            numPortas = numberDoors;
        }
    }

    public void setAnoModelo(int yearModel){
        if(yearModel>1900){
            anoModelo = yearModel;
        }
    }

    public void setAnoFabricacao(int yearManufacture){
        if(yearManufacture>1900){
            anoFabricacao = yearManufacture;
        }
    }//fim dos métodos Set

    //início dos métodos Get
    public String getModelo(){
        return modelo;
    }

    public String getFabricante(){
        return fabricante;
    }

    public String getCor(){
        return cor;
    }

    public String getPlaca(){
        return placa;
    }

    public double getValor(){
        return valor;
    }

    public int getNumPortas(){
        return numPortas;
    }

    public int getAnoModelo(){
        return anoModelo;
    }

    public int getAnoFabricacao(){
        return anoFabricacao;
    }//fim dos métodos Get;
    
    public void entradaDados(){
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Qual o modelo do veículo?");
            setModelo(read.nextLine());

            System.out.println("Qual o Fabricante do veículo?");
            setFabricante(read.nextLine());

            System.out.println("Qual a cor do veículo?");
            setCor(read.nextLine());

            System.out.println("Qual a Placa do veículo?");
            setPlaca(read.nextLine());

            System.out.println("Qual o valor do veículo?");
            setValor(read.nextDouble());

            System.out.println("Quantas portas o veículo possui?");
            setNumPortas(read.nextInt());

            System.out.println("Qual o ano do modelo do veículo?");
            setAnoModelo(read.nextInt());

            System.out.println("Qual o ano de fabricação do veículo?");
            setAnoFabricacao(read.nextInt());
        }
    }

    public void imprimir() {
        System.out.println("");
        System.out.printf("Modelo: %s;%n",getModelo());
        System.out.printf("Fabricante: %s;%n",getFabricante());
        System.out.printf("Cor: %s;%n",getCor());
        System.out.printf("Placa: %s;%n",getPlaca());
        String valorForm = new DecimalFormat("#,##0.00").format(valor);
        System.out.printf("Valor: R$ %s;%n",valorForm);
        System.out.printf("Número do portas: %d;%n",getNumPortas());
        System.out.printf("Ano do modelo: %d;%n",getAnoModelo());
        System.out.printf("Ano de Fabricação: %d.%n",getAnoFabricacao());    
    }

    public static void main(String[] args){
        carro carro1 = new carro();
        carro1.entradaDados();
        carro1.imprimir();
    }
}
