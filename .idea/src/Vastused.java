import java.util.Scanner;

public class Vastused {
    private String õigeVastus;
    private Scanner scanner;

    public Vastused(Scanner scanner) {
        this.scanner = scanner;
    }

    // Vastavalt küsitud küsimuse kategooriale õige vastuse saamine

    public void vastus(Küsimused küsimused){
        int valik = küsimused.getValik();
        System.out.println("Sisesta vastus (väiketähtedes) : ");
        switch (valik) {
            case 1:
                Ajalugu ajalugu = new Ajalugu();
                õigeVastus = ajalugu.getAjalooVastused()[küsimused.getIndeks()];
                break;
            case 2:
                It it = new It();
                õigeVastus = it.getItVastused()[küsimused.getIndeks()];
                break;
            case 3:
                Keel keel = new Keel();
                õigeVastus = keel.getKeeleVastused()[küsimused.getIndeks()];
                break;
            case 4:
                Muusika muusika = new Muusika();
                õigeVastus = muusika.getMuusikaVastused()[küsimused.getIndeks()];
                break;
            case 5:
                Sport sport = new Sport();
                õigeVastus = sport.getSpordiVastused()[küsimused.getIndeks()];
                break;
            case 6:
                Toit toit = new Toit();
                õigeVastus = toit.getToiduVastused()[küsimused.getIndeks()];
                break;
            case 7:
                Varia varia = new Varia();
                õigeVastus = varia.getVariaVastused()[küsimused.getIndeks()];
                break;
            default:
                õigeVastus = "Tundmatu vastus";
                break;
        }

        // Vastuse kontroll

        String kasutajaVastus = küsimused.getScanner().nextLine();
        if (kasutajaVastus.equals(õigeVastus)) {
            System.out.println("Õige vastus!");

        } else {
            System.out.println("Vale vastus! Õige vastus oli: " + õigeVastus);
        }

    }

}
