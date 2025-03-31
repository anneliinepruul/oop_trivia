public class Varia {
    private String[] variaKüsimused;
    private String[] variaVastused;

    public Varia() {
        this.variaKüsimused = new String[]{
                "Mis on Eesti pikim jõgi?", "Milline paik võiks olla Eestis ideaalne uinaku tegemiseks?",
                "Millises Eesti paigas võiks teoreetiliselt elada kõige rohkem piraate?", "Mis aastal võeti Eestis kasutusele euro?",
                "Mis teosest pärinevad tegelased Pearu, Andres ja Krõõt?", "Mis on Eesti rahvuslill?",
                "Mis aastal saadeti kosmosesse ESTCube-1?", "Mis on Eesti vanim järjepidevalt eetris olnud telesaade?",
                "Milline Eesti hoone on kõige kõrgem?", "Mitu aastaaega on Soomaal?"
        };

        this.variaVastused = new String[]{
                "võhandu", "tudulinn", "rummu", "2011",
                "tõde ja õigus", "rukkilill", "2013", "aktuaalne kaamera",
                "tallinna teletorn (314 m)", "5"
        };
    }

    public String[] getVariaKüsimused() {
        return variaKüsimused;
    }

    public String[] getVariaVastused() {
        return variaVastused;
    }
}