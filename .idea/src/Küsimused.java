import java.util.Random;
import java.util.Scanner;

public class Küsimused {

    public String esitaKüsimus(int valik) {
        Random random = new Random();
        String suvalineKüsimus;
        switch (valik) {
            case 1:
                Ajalugu ajalugu = new Ajalugu();
                int indeks = random.nextInt(ajalugu.getAjalooKüsimused().length);
                suvalineKüsimus = ajalugu.getAjalooKüsimused()[indeks];
                break;
            case 2:
                It it = new It();
                int indeks2 = random.nextInt(it.getItKüsimused().length);
                suvalineKüsimus = it.getItKüsimused()[indeks2];
                break;
            case 3:
                Keel keel = new Keel();
                int indeks3 = random.nextInt(keel.getKeeleKüsimused().length);
                suvalineKüsimus = keel.getKeeleKüsimused()[indeks3];
                break;
            case 4:
                Muusika muusika = new Muusika();
                int indeks4 = random.nextInt(muusika.getMuusikaKüsimused().length);
                suvalineKüsimus = muusika.getMuusikaKüsimused()[indeks4];
                break;
            case 5:
                Sport sport = new Sport();
                int indeks5 = random.nextInt(sport.getSpordiKüsimused().length);
                suvalineKüsimus = sport.getSpordiKüsimused()[indeks5];
                break;
            case 6:
                Toit toit = new Toit();
                int indeks6 = random.nextInt(toit.getToiduKüsimused().length);
                suvalineKüsimus = toit.getToiduKüsimused()[indeks6];
                break;
            case 7:
                Varia varia = new Varia();
                int indeks7 = random.nextInt(varia.getVariaKüsimused().length);
                suvalineKüsimus = varia.getVariaKüsimused()[indeks7];
                break;
            default:
                suvalineKüsimus = "Tundmatu suvalineKüsimus";
                break;
        }
        return suvalineKüsimus;
    }
        public int valiKategooria () {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Vali kategooria: ");
            System.out.println("1 - Ajalugu");
            System.out.println("2 - IT");
            System.out.println("3 - Keel");
            System.out.println("4 - Muusika");
            System.out.println("5 - Sport");
            System.out.println("6 - Toit");
            System.out.println("7 - Varia");

            int valik = -1;
            while (valik < 1 || valik > 7) {
                System.out.println("Vali kategooria (1-7):");
                try {
                    valik = Integer.parseInt(scanner.nextLine());  // Loeme kogu rea ja teisendame arvuks
                } catch (NumberFormatException e) {
                    System.out.println("Vale sisend, proovi uuesti.");
                }
            }
            return valik;
        }
    }
