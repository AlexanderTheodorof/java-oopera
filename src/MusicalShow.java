

class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;
    
    MusicalShow(Show show, String musicAuthor, String librettoText) {
        super(show.getTitle(), show.getDuration(), show.getDirector(), show.getActorList());
        this.musicAuthor  = musicAuthor;
        this.librettoText = librettoText;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText; 
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
