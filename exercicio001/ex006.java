package exercicio001;
import java.text.DecimalFormat; //biblioteca para formatação dos números reais
public class ex006 {
    public static void main(String[] args) {
        final double frota2013 = 5445562;
        final double co2013 = 1000000;
        String frota2013f = new DecimalFormat("#,##0.00").format(frota2013);
        String co2013f = new DecimalFormat("#,##0.00").format(co2013);

        final double frota2014 = frota2013 + 130000;
        final double co2014 = frota2014 * co2013 / frota2013;
        String frota2014f = new DecimalFormat("#,##0.00").format(frota2014);
        String co2014f = new DecimalFormat("#,##0.00").format(co2014);

        final double frota2015 = frota2014 + 130000;
        final double co2015 = frota2015 * co2014 / frota2014;
        String frota2015f = new DecimalFormat("#,##0.00").format(frota2015);
        String co2015f = new DecimalFormat("#,##0.00").format(co2015);
       
        final double frota2016 = frota2015 + 130000;
        final double co2016 = frota2016 * co2015 / frota2015;
        String frota2016f = new DecimalFormat("#,##0.00").format(frota2016);
        String co2016f = new DecimalFormat("#,##0.00").format(co2016);
       
        final double frota2017 = frota2016 + 130000;
        final double co2017 = frota2017 * co2015 / frota2015;
        String frota2017f = new DecimalFormat("#,##0.00").format(frota2017);
        String co2017f = new DecimalFormat("#,##0.00").format(co2017);

        System.out.printf("Frota em 2013: %s%n", frota2013f);
        System.out.printf("Poluição de Monóxido de carbono em 2013: %s toneladas.%n%n", co2013f);

        System.out.printf("Frota em 2014: %s%n", frota2014f);
        System.out.printf("Poluição de Monóxido de carbono em 2013: %s toneladas.%n%n", co2014f);

        System.out.printf("Frota em 2015: %s%n", frota2015f);
        System.out.printf("Poluição de Monóxido de carbono em 2013: %s toneladas.%n%n", co2015f);

        System.out.printf("Frota em 2016: %s%n", frota2016f);
        System.out.printf("Poluição de Monóxido de carbono em 2013: %s toneladas.%n%n", co2016f);

        System.out.printf("Frota em 2017: %s%n", frota2017f);
        System.out.printf("Poluição de Monóxido de carbono em 2013: %s toneladas.%n%n", co2017f);
    }
}
