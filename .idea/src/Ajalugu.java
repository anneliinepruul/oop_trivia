public class Ajalugu {
    private String[] ajalooKüsimused;
    private String[] ajalooVastused;

    public Ajalugu() {
        this.ajalooKüsimused = new String[]{
                "Kes oli Eesti esimene president?", "Mis aastal iseseisvus Eesti esimest korda?",
                "Mis oli teadaolevalt esimene asula Eesti aladel?", "Kuidas kutsuti Tartut muinasajal?",
                "Mis aastal toimus Balti kett?", "Mis aastal rajati Tartu Ülikool?",
                "Mis aastal toimus esimene laulupidu?", "Mis on üks Eesti kuulsamaid kummituslugusid?",
                "Mis on Eesti rahvuseepose pealkiri?", "Mis oli Eesti esimene linn, mis sai raudteeühenduse?"
        };

        this.ajalooVastused = new String[]{
                "Konstantin Päts", "1918", "Pulli asula", "Tarbatu",
                "1989", "1632", "1869", "Valge Daam",
                "Kalevipoeg", "Narva"
        };
    }

    public String[] getAjalooKüsimused() {
        return ajalooKüsimused;
    }

    public String[] getAjalooVastused() {
        return ajalooVastused;
    }
}