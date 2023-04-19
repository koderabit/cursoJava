package exercicio007;

public class Main {
    public static void main(String[] args) {
        LucroSemestral lucroSemestral = new LucroSemestral(30200, 22540);
        Lucro18Meses lucro18Meses = new Lucro18Meses(30200, 22540);

        System.out.printf("KoderaBooks\n%s\n\n%s", lucroSemestral.toString(), lucro18Meses.toString());
    }
}
