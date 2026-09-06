import java.util.ArrayList;

class MusicalShow extends Show {
    protected String musicAuthor;
    protected ArrayList<String> librettoText;
    
    MusicalShow(Show show,
                String musicAuthor,
                ArrayList<String> librettoText) {
        super(show.title, show.duration, show.director, show.actorList);
        this.musicAuthor  = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public ArrayList<String> getLibrettoText() {
        return librettoText; 
    }

    public void printLibrettoText() {
        for (String sentence : librettoText) {
            System.out.println(sentence);
        }
    }
}
