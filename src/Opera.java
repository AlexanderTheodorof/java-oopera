class Opera extends MusicalShow {
    int choirSize;

    Opera(MusicalShow musicalShow, int choirSize) {
        super(new Show(musicalShow.title, musicalShow.duration, musicalShow.director, musicalShow.actorList),
              musicalShow.getMusicAuthor(),
              musicalShow.getLibrettoText());
        this.choirSize = choirSize; 
    }

    public int getChoirSize() {
        return choirSize;
    }
}
