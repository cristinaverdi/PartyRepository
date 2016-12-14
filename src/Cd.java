
public class Cd {
    //Properties, attributes, fields or instance variables.
    //What the Object "Knows" about himself
    private String artist;
    private String album;
    private String genre;
    private int duration;

    //Constructor. Here we set consistent initial values for every new instace.
    public Cd(String artist, String album, String genre, int duration) {
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.duration = duration;
    }

    //Methods. Here we will implement getter methods.

    // Get artist
    public String getArtist(){return this.artist;}

    //Get album
    public String getAlbum(){return this.album;}

    //Get cd's duration
    public int getDuration() {return this.duration;}

    //To String

    public String toString(){
        return "Artist: " + this.artist + " Album: " + this.album + " genre: " + this.genre + " duration: " + this.duration;

    }


}
