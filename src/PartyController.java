
import java.util.ArrayList;
import java.util.List;


public class PartyController {
    private List<Cd> cds;
    private CdPlayer cdPlayer;


    public PartyController() {
        cds = new ArrayList<>();
        cdPlayer = new CdPlayer("jvg");
    }

    //Add new cd to the list of cds.
    public void addCd(Cd cd) {
        cds.add(cd);
    }


    // Creates specific List of Album's to be played during the party, based on the party's duration.

    public String prepareParty(int partyDuration) {
        cdPlayer.turnOn();
        cdPlayer.increaseVolume(75);
        cdPlayer.setIspartyModeOn(true);
        List<Cd> albums = generateListOfCds();
        List<Cd> cds = new ArrayList<>();
        int listTotalDuration = 0;

        for (Cd album : albums) {
            int totalDuration = album.getDuration() + listTotalDuration;
            if ((listTotalDuration < partyDuration) && (totalDuration < partyDuration)) {
                cds.add(album);
            }
            listTotalDuration += album.getDuration();
        }
        String musicList = cdPlayer.playList(cds);
        cdPlayer.setPlayList(musicList);
        return musicList;
    }

    //generates a List of Albums to be played during the party.
    public List<Cd> generateListOfCds() {

        Cd cd1 = new Cd("Crash", "Hardly Criminal", "Soul", 23);
        Cd cd2 = new Cd(" The Bar-keys", "Soul Finger", "Soul", 34);
        Cd cd3 = new Cd("Cream", "Fresh Cream", "Folk", 47);
        Cd cd4 = new Cd("Al green", "", "Folk", 35);
        Cd cd5 = new Cd("Mickey Finn", "Garden next to you", "garage", 40);
        Cd cd6 = new Cd("Nina Simone", "I put a spell on you", "Northern Soul", 22);
        Cd cd7 = new Cd("Del Moroccos", "Blue black hair", "rockabilly", 62);
        Cd cd8 = new Cd("Torment", "Hypnosis", "Psychobilly", 73);
        Cd cd9 = new Cd("The dragtones", "Drag", "rockabilly", 41);

        cds.add(cd1);
        cds.add(cd2);
        cds.add(cd3);
        cds.add(cd4);
        cds.add(cd5);
        cds.add(cd6);
        cds.add(cd7);
        cds.add(cd8);
        cds.add(cd9);

        return cds;
    }

    public String toString() {
        return "Party controller playing: " + cdPlayer;
    }


}
