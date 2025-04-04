class Muusika {
    private String[] muusikaKüsimused;
    private String[] muusikaVastused;

    public Muusika() {
        this.muusikaKüsimused = new String[]{
                "Mis on nublu kodaniku nimi?",
                "Millise lauluga võitis Tanel Padar koos Dave Bentoniga Eurovisiooni?",
                "Kes on tuntud folkansambli Zetod solist?",
                "Millise Eesti helilooja teos on \"Concerto Grosso\"?",
                "Mis aastal osales Eesti esimest korda Eurovisioonil?",
                "Milline festival toimub Viljandis ja on pühendatud pärimusmuusikale?",
                "Mis aastal toimus 2020 aasta Eurovisioon?",
                "Kes on Eesti hümni sõnade autor?",
                "Milline Eesti ansambel esitas laulu \"Soorebased\"?",
                "Milline Eesti artist püstitas Spotifys uue rekordi ilmumispäeva kuulamiste arvuga (25860 kuulamist)?"
        };

        this.muusikaVastused = new String[]{
                "markkus pulk",
                "\"everybody\"",
                "jalmar vabarna",
                "eino tamberg",
                "1994.a.",
                "viljandi folk",
                "ei toimunud",
                "johann voldemar jannsen",
                "trad.attack!",
                "kermo murel"
        };
    }

    public String[] getMuusikaKüsimused() {
        return muusikaKüsimused;
    }

    public String[] getMuusikaVastused() {
        return muusikaVastused;
    }

    public String getVastus(String küsimus) {
        for (int i = 0; i < muusikaKüsimused.length; i++) {
            if (muusikaKüsimused[i].equalsIgnoreCase(küsimus)) {
                return muusikaVastused[i];
            }
        }
        return "Küsimusele vastust ei leitud.";
    }
}