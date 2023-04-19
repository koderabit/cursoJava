package exercicio005;

public class DadosTest {
    public static void main(String[] args) {
        Dados[] objectsDados = new Dados[3];

        objectsDados[0] = new DadosImprime10Percent("Jonathan", "Girafa", 2500.25);
        objectsDados[1] = new DadosImprime10Percent("Charles", "Perneta", 1540.44);
        objectsDados[2] = new DadosImprime10Percent("Le", "Poti", 1800.96);

        System.out.printf("Informações pessoais após aumento salarial de 10%%:\n");
        for(int i = 0; i<=2; i++){
            System.out.printf("%dª pessoa\n%s\n\n", i+1, objectsDados[i].toString());
        }
    }
}
