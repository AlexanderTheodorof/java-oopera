class Ballet extends MusicalShow {
    private final Person choreographer;

    Ballet(MusicalShow musicalShow, Person choreographer) {
        super(new Show(musicalShow.title, musicalShow.duration, musicalShow.director),
              musicalShow.musicAuthor,
              musicalShow.librettoText);
        this.choreographer = choreographer; 
    }

    public Person getChoreographer() {
        return choreographer; 
    }

    @Override
    public void printActorList() {
        System.out.println("_".repeat(20));
        System.out.println("В балете '" + title + "' участвуют актеры:"); 
        System.out.println(actorListToString());
        System.out.println("_".repeat(20));
    }
    
    @Override
    public String toString() {
        String objectDescription =
              "_".repeat(20)
            + "\nБаллет '" + title + "'"
            + "\nПродолжительность:" + duration + "\n"
            + "\nВ постановке участвуют:\n" 
            + director + "\n"
            + "Хореограф: " + choreographer.getFullName()  + "\n"
            + actorListToString();
        return objectDescription;
    }
}
