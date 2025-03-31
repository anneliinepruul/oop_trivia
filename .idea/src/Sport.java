public class Sport {
    // Küsimuste ja vastuste massiivid
    private String[] SpordiKüsimused;
    private String[] SpordiVastused;

    // Konstruktor massiivide initsialiseerimiseks
    public Sport() {
        this.SpordiKüsimused = new String[]{
                "Milline Eesti linn on tuntud kui \"Eesti suusa pealinn\" ?",
                "Millisel aastal võitis Eesti olümpiamängudel esimese kulla?",
                "Millisel staadionil peab Eesti jalgpallikoondis oma kodumänge?",
                "Kes on ainus eestlane, kes on mänginud NBA-s?",
                "Millise tulemusega püstitas Gerd Kanter oma kettaheite isikliku rekordi? (meetrites)",
                "Milline Eesti rallisõitja tuli maailmameistriks 2019. aastal?",
                "Millisel aastal alistas Anett Kontaveit maailma esireketi?",
                "Mis vigastus takistas Kelly Sildarul osalemast 2018. aasta taliolümpiamängudel?",
                "Mis maailmakuulsal spordialal oli Paul Keres Eesti läbi aegade üks tuntumaid ja edukamaid sportlasi?",
                "Kes on läbi aegade edukaim Eesti kulturist?"
        };

        this.SpordiVastused = new String[]{
                "otepää",
                "1920",
                "a. le coq arena",
                "martin müürsepp",
                "73.38",
                "ott tänak",
                "2021",
                "acl vigastus",
                "male",
                "ott kiivikas"
        };
    }

    // Getter küsimuste jaoks
    public String[] getSpordiKüsimused() {
        return SpordiKüsimused;
    }

    // Getter vastuste jaoks
    public String[] getSpordiVastused() {
        return SpordiVastused;
    }

    // Meetod küsimuse leidmiseks ja vastuse tagastamiseks
    public String getVastus(String küsimus) {
        for (int i = 0; i < SpordiKüsimused.length; i++) {
            if (SpordiKüsimused[i].equalsIgnoreCase(küsimus)) {
                return SpordiVastused[i];
            }
        }
        return "Küsimusele vastust ei leitud.";
    }
}