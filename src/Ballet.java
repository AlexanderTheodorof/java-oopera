class Ballet extends MusicalShow {
    Person choreographer;

    Ballet(MusicalShow musicalShow, Person choreographer) {
        super(new Show(musicalShow.title, musicalShow.duration, musicalShow.director, musicalShow.actorList),
              musicalShow.musicAuthor,
              musicalShow.librettoText);
        this.choreographer = choreographer; 
    }

    public Person getChoreographer() {
        return choreographer; 
    }
}
