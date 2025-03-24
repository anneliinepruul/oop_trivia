public class It {
    private String[] itKüsimused;
    private String[] itVastused;

    public It() {
        this.itKüsimused = new String[]{
                "Milline üle maailma tuntud Eesti ettevõte suletakse 5. mail 2025?",
                "Mis aastal toimus Eesti vastu üks maailma esimesi suuremahulisi küberrünnakuid?",
                "Eestis loodi esimene e-residentsuse programm maailmas. Mis aastal see käivitati?",
                "Milline oli esimene Eesti veebileht, mis loodi 1992. aastal?",
                "Millise Eesti tehnoloogiaettevõtte asutajate hulka kuuluvad Taavet Hinrikus ja Kristo Käärmann?",
                "Mis on hetkel Eesti edukaim ükssarvik?",
                "Mis aastal võeti Eestis kasutusele e-valimised?",
                "Milline Eesti e-teenus võimaldab ettevõtetel ja eraisikutel dokumente digitaalselt allkirjastada ja neid turvaliselt jagada?",
                "Mis on Eesti kõige levinum programmeerimiskeel, mida õpetatakse ka koolides?",
                "Millises Eesti linnas asub NATO Küberkaitsekoostöö Keskus (NATO CCDCOE)?"
        };

        this.itVastused = new String[]{
                "Skype", "2007", "2014", "Tartu Ülikooli veebileht",
                "Wise", "Bolt", "2005", "DigiDoc",
                "Python", "Tallinn"
        };
    }

    public String[] getItKüsimused() {
        return itKüsimused;
    }

    public String[] getItVastused() {
        return itVastused;
    }
}