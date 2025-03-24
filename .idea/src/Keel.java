public class Keel {
    private String[] keeleKüsimused;
    private String[] keeleVastused;

    public Keel() {
        this.keeleKüsimused = new String[]{
                "Mis on eesti keele kõige pikem palindroom?",
                "Milline täht esineb eesti keeles kõige sagedamini?",
                "Mitu käänet on eesti keeles?",
                "Milline on kõige lühem eestikeelne lause?",
                "Mis sõna tähendab eesti keeles puutüve ning töötasu?",
                "Mida tähendab seto murdes sõna 'kobrõh'?",
                "Milline sõna on eesti keeles leedu keelega täpselt sama?",
                "Millise võõrkeele mõjul on eesti keelde tulnud kõige rohkem laensõnu?",
                "Mitu tähte on eesti tähestikus?",
                "Milline sõna valiti 2019. aastal kõige eestilikumaks sõnaks?"
        };

        this.keeleVastused = new String[]{
                "kuulilennuteetunneliluuk", "a", "14", "on", "palk", "segadus",
                "kirves", "saksa keel", "32", "sõnajalaõis"
        };
    }

    public String[] getKeeleKüsimused() {
        return keeleKüsimused;
    }

    public String[] getKeeleVastused() {
        return keeleVastused;
    }
}