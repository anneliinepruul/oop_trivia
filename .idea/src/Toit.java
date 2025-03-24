class Toit {
    private String[] toiduKüsimused;
    private String[] toiduVastused;

    public Toit() {
        this.toiduKüsimused = new String[]{
                "Millest tehakse mulgiputru?",
                "Mis on verivorstide traditsiooniline lisand jõululaual?",
                "Milline jook on valmistatud kääritatud leivast?",
                "Mis on traditsiooniline magustoit, mida tehakse odrajahust ja piimast?",
                "Millist suppi süüakse vastlapäeval?",
                "Milline Eesti restoran on saanud Michelini tärni?",
                "Millises Eesti linnas toimub iga-aastane toidufestival \"Grillfest\"?",
                "Milline Eestis toodetud alkohoolne jook on tuntud oma magusa ja vürtsika maitse poolest?",
                "Milline kuulus Eesti joogitootja valmistab limonaadi Kelluke?",
                "Millise Eesti linna lähedal asub Piimandusmuuseum?"
        };

        this.toiduVastused = new String[]{
                "Kartulitest ja tangudest/kruupidest (ja seapekk)",
                "Pohlamoos",
                "Kali",
                "Kama",
                "Hernesupp",
                "NOA Chef’s Hall",
                "Pärnus",
                "Vana-Tallinn",
                "A. Le Coq",
                "Imavere"
        };
    }

    public String[] getToiduKüsimused() {
        return toiduKüsimused;
    }

    public String[] getToiduVastused() {
        return toiduVastused;
    }

    public String getVastus(String küsimus) {
        for (int i = 0; i < toiduKüsimused.length; i++) {
            if (toiduKüsimused[i].equalsIgnoreCase(küsimus)) {
                return toiduVastused[i];
            }
        }
        return "Küsimusele vastust ei leitud.";
    }
}