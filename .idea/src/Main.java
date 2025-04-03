//Esmalt tuleb valida kategooria number vahemikus 1 kuni 7.  Vastus tuleb sisestada läbivalt väikeste tähtedega.
//Projekti autorid: Kadri Paan, Anne-Liine Pruul

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Küsimused küsimused = new Küsimused(scanner);
        Vastused vastus = new Vastused(scanner);
        boolean uuestiMängida = true;

        while (uuestiMängida) {
            int kategooriaValik = küsimused.valiKategooria();
            System.out.println(küsimused.esitaKüsimus(kategooriaValik));

            //vastus.vastus(küsimused);

            uuestiMängida = küsimused.kasUuestimängida();
        }
        System.out.println("Head aega!");
    }

}