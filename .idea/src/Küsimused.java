import java.util.Random;
import java.util.Scanner;

public class Küsimused {
    private int indeks;
    private int valik;
    private Scanner scanner;  // Üksainus scanner objekt

    public Küsimused(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String esitaKüsimus(int valik) {
        Random random = new Random();
        String suvalineKüsimus;
        switch (valik) {
            case 1:
                Ajalugu ajalugu = new Ajalugu();
                this.indeks = random.nextInt(ajalugu.getAjalooKüsimused().length);
                System.out.println(this.indeks);
                suvalineKüsimus = ajalugu.getAjalooKüsimused()[indeks];
                break;
            case 2:
                It it = new It();
                this.indeks = random.nextInt(it.getItKüsimused().length);
                suvalineKüsimus = it.getItKüsimused()[indeks];
                break;
            case 3:
                Keel keel = new Keel();
                this.indeks = random.nextInt(keel.getKeeleKüsimused().length);
                suvalineKüsimus = keel.getKeeleKüsimused()[indeks];
                break;
            case 4:
                Muusika muusika = new Muusika();
                this.indeks = random.nextInt(muusika.getMuusikaKüsimused().length);
                suvalineKüsimus = muusika.getMuusikaKüsimused()[indeks];
                break;
            case 5:
                Sport sport = new Sport();
                this.indeks = random.nextInt(sport.getSpordiKüsimused().length);
                suvalineKüsimus = sport.getSpordiKüsimused()[indeks];
                break;
            case 6:
                Toit toit = new Toit();
                this.indeks = random.nextInt(toit.getToiduKüsimused().length);
                suvalineKüsimus = toit.getToiduKüsimused()[indeks];
                break;
            case 7:
                Varia varia = new Varia();
                this.indeks = random.nextInt(varia.getVariaKüsimused().length);
                suvalineKüsimus = varia.getVariaKüsimused()[indeks];
                break;
            default:
                suvalineKüsimus = "Tundmatu kategooria";
                break;
        }
        return suvalineKüsimus;
    }

    public int valiKategooria () {

        System.out.println("Vali kategooria: ");
        System.out.println("1 - Ajalugu");
        System.out.println("2 - IT");
        System.out.println("3 - Keel");
        System.out.println("4 - Muusika");
        System.out.println("5 - Sport");
        System.out.println("6 - Toit");
        System.out.println("7 - Varia");

        valik = -1;
        while (valik < 1 || valik > 7) {
            System.out.println("Vali kategooria (1-7):");
            try {
                valik = Integer.parseInt(scanner.nextLine());  // Loeme kogu rea ja teisendame arvuks
            } catch (NumberFormatException e) {
                System.out.println("Vale sisend, proovi uuesti.");
            }
        }
        this.valik = valik;
        return valik;
    }

    public int getIndeks() {

        System.out.println(valik);
        return indeks;
    }

    public int getValik() {

        return valik;
    }

    public boolean kasUuestimängida() throws Exception {
        System.out.println("Kas soovite uuesti mängida? (jah / ei)");
        String kasutajaValik = scanner.nextLine();
        return kasutajaValik.equalsIgnoreCase("jah");
    }
}
