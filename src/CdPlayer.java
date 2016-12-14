import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class CdPlayer {
    //instance variables. What the object "Knows about himself"
    private String brand;
    private boolean isOn;
    private int volume;
    private Collection<Cd> reproductionQueue;
    private String playList;
    private boolean partyModeIsOn;

    //Constructor: Here we set consistent values for each property of every new instance.
    //it makes sense to pass the cd player brand as a parameter.

    public CdPlayer(String brand ) {
        this.brand = brand;
        this.isOn = false;
        this.volume = 0;
        this.reproductionQueue = new LinkedList<>();
        this.playList = "";
        this.partyModeIsOn = false;

    }

    //Methods. Actions that the object  of type cdPlayer can perform.

    //turn on cd Player
    public void turnOn() {this.isOn = true;}

    //turn off cd Player
    public void turnOff(){
        this.isOn = false;
        this.volume = 0;
        removeAll();
    }

    public void setIspartyModeOn(boolean isOn) {this.partyModeIsOn = isOn;}

    //increase volume in given amount. Volume cannot take a value above or below the max and min volume allowed.
    public void increaseVolume(int increment) {
        this.volume += increment;
        adjustVolume();
    }

    //adjust volume. Set maximum and minimum volume allowed.
    private void adjustVolume(){
        if(this.volume < 0){
            this.volume = 0;
        }else if (this.volume > 100) {
            this.volume = 100;
        }
    }

    //Remove cd
    public void removeCd(Cd cd) { this.reproductionQueue.remove(cd); }

    public void removeAll() { this.reproductionQueue = null;}

    //Get Cd
    public Collection<Cd> getQueueOfCds(){return this.reproductionQueue;}

    // play cd
    public String playCd() {
        String currentAlbum = "";
        if(getQueueOfCds() != null) {
            for(Cd cd : reproductionQueue) {
                currentAlbum += cd.getAlbum();
            }
            return currentAlbum;
        } else {
            return "There's no Cd in the Player!";
        }

    }

    public String playList(List<Cd> partyList) {
        String currentAlbum = "";
        if(partyList != null) {
            for(Cd cd : partyList) {
                currentAlbum += cd.getAlbum();
                currentAlbum += ",";
            }
            return currentAlbum;
        } else {
            return "There's no Cd in the Player!";
        }
    }

    public void setReproductionQueue(Collection<Cd> reproductionQueue) {
        this.reproductionQueue = reproductionQueue;
    }

    // add a new cd to the reproduction queue.
    public void addCd(Cd cd) {
        this.reproductionQueue.add(cd);
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    //cd Player to String
    public String toString(){
        if(this.partyModeIsOn){
            return "CD player: " + this.brand + ". is On: " + this.isOn + ", at volume: " + this.volume + ", PlayList: " + this.playList;
        } else {
            return "CD player: " + this.brand + ". is On: " + this.isOn + ", at volume: " + this.volume + ", playing: " + this.reproductionQueue.toString();
        }

    }

}