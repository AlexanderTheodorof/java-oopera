class Ballet extends MusicalShow {
    Person choreographer;

    Ballet(Show show, MusicalShow musicalShow, Person choreographer) {
        super(show, musicalShow.getMusicAuthor(), musicalShow.getLibrettoText);
        this.choreographer = choreographer; 
    }

    public Person getChoreographer() {
        return choreographer; 
    }
}
