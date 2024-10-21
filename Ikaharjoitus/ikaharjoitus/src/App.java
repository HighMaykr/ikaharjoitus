import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Luodaan skanneri tekstin lukemiseen
        Scanner scanner = new Scanner(System.in);

        // Kysytaan ikaa kayttajalta
        System.out.print("Anna ikäsi: ");
        int ika = scanner.nextInt();

        // Luokitellaan eri ikaluokille println komento
        if (ika > 0 && ika < 18) {
            System.out.println("Olet alaikäinen");

           
            if (ika >= 15) {
                System.out.println("Saat ajaa mopoa");
            }

           
            if (ika >= 16 && ika <= 17) {
                System.out.println("Saat ajaa kevaria");
            }
           
        } else if (ika == 18) {
            System.out.println("Olet juuri tullut täysi-ikäiseksi ja saat ajaa autoa!");

       
        } else if (ika >= 65) {
            System.out.println("Olet eläkeläinen");

           
            if (ika == 65) {
                System.out.println("Toivotan sinulle hyviä eläkepäiviä!");
            }

       
        } else if (ika >= 58) {
            System.out.println("Voit mennä varhaiseläkkeelle");


        } else if (ika >= 40 && ika <= 50) {
            System.out.println("Toivotan parasta keski-ikää!");

       
        } else {
            System.out.println("Olet aikuinen");

           
            if (ika % 10 == 0) {
                System.out.println("Onnittelut tasavuosikymmenistä!");
            }
        }

        // 100 vuoden syntymäpäivä onnentoivotukset
        if (ika == 100) {
            System.out.println("Onnittelut sadan vuoden saavuttamisesta! Se on upea saavutus!");
            System.out.println("Olet varmasti kokenut kaikenlaista!");
            System.out.println("Toivon hyvää jatkoa ja monia valoisia päiviä!");
        }

        scanner.close();
    }
}