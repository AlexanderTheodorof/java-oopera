import java.util.ArrayList;

class MusicalShow extends Show {
    protected Person musicAuthor;
    protected ArrayList<String> librettoText;
    
    MusicalShow(Show show,
                Person musicAuthor,
                ArrayList<String> librettoText) {
        super(show.title, show.duration, show.director);
        this.musicAuthor  = musicAuthor;
        this.librettoText = librettoText;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public ArrayList<String> getLibrettoText() {
        return librettoText; 
    }

    public void printLibrettoText() {
        System.out.println("_".repeat(20));
        if (librettoText == null || librettoText.size() == 0) {
            System.out.println("Это авангардная постановка, а которой у каждого зрителя своё либретто в голове.");
        } else {
            System.out.println("Текст либретто:");
            for (String sentence : librettoText) {
                System.out.println(sentence);
            }
        }
        System.out.println("_".repeat(20));
    }
}
