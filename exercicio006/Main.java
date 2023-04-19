package exercicio006;

public class Main {
    public static void main(String[] args) {
        Interface[] interfaceObj = new Interface[4];
        interfaceObj[0] = new BrasilSerieFilme(42000000, 28000000, 14000000);
        interfaceObj[1] = new RussiaSerieFilme(40500000, 27000000, 13500000);

        System.out.println("Downloads Brasil x Rússia em 2014");
        for(int i=0; i<=1;i++){
            System.out.printf("%s\n\n", interfaceObj[i].toString());
        }

        interfaceObj[2] = new BrasilSerieFilme(42000000*1.01, 28000000*1.01, 14000000*1.01);
        interfaceObj[3] = new RussiaSerieFilme(40500000*1.01, 27000000*1.01, 13500000*1.01);
        System.out.println("No ano de 2015 houve um aumento de 1% nos downloads, os dados foram atualizados e ficaram da seguinte maneira:");
        System.out.println("Downloads Brasil x Rússia em 2015");

        for(int i=2; i<=3;i++){
            System.out.printf("%s\n\n",interfaceObj[i].toString());
        }


    }
}
