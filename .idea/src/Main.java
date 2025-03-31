public class Main {
    public static void main(String[] args) {
        Küsimused küsimused = new Küsimused();
        int kategooriaValik = küsimused.valiKategooria();  // Kutsume valiKategooria
        System.out.println("Sisestatud kategooria number: " + kategooriaValik);  // Kuvame kategooria numbri
        System.out.println(küsimused.esitaKüsimus(kategooriaValik));  // Kutsume esitaKüsimus, et saada küsimus
    }
}