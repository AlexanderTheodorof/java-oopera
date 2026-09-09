public class Opera extends MusicalShow {
    private final int choirSize;

    Opera(MusicalShow musicalShow, int choirSize) {
        super(new Show(musicalShow.title, musicalShow.duration, musicalShow.director),
              musicalShow.getMusicAuthor(),
              musicalShow.getLibrettoText());
        this.choirSize = choirSize; 
    }

    public int getChoirSize() {
        return choirSize;
    }

    @Override
    public void printActorList() {
        System.out.println("_".repeat(20));
        System.out.println("В опере '" + title + "' участвуют актеры:"); 
        System.out.println(actorListToString());
        System.out.println("_".repeat(20));
    }

    
    @Override
    public String toString() {
        String objectDescription =
              "_".repeat(20)
            + "\nОпера '" + title + "'"
            + "\nПродолжительность:" + duration + "\n"
            + "\nВ постановке участвуют:\n" 
            + director + "\n"
            + "Хор в составе " + choirSize + " человек\n"
            + actorListToString();
        return objectDescription;
    }
}
