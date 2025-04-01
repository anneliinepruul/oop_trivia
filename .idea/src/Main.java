import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  // Üksainus scanner objekt
        Küsimused küsimused = new Küsimused(scanner);
        Vastused vastus = new Vastused(scanner);
        boolean uuestiMängida = true;  // Mängu jätkamiseks või lõpetamiseks

        while (uuestiMängida) {  // Tsükkel, et mängu võib uuesti mängida
            System.out.println();
            int kategooriaValik = küsimused.valiKategooria();  // Kutsume valiKategooria
            System.out.println("Sisestatud kategooria number: " + kategooriaValik);  // Kuvame kategooria numbri
            System.out.println(küsimused.esitaKüsimus(kategooriaValik));  // Kutsume esitaKüsimus, et saada küsimus
            System.out.println();

            vastus.vastus(küsimused);  // Läbime vastuste kontrolli
            uuestiMängida = küsimused.kasUuestimängida();  // Küsi, kas mängida uuesti
        }

        System.out.println("Head aega!");
    }
}