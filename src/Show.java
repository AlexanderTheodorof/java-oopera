import java.util.HashMap;

class Show  {
    protected String                    title;
    protected int                    duration;
    protected Director               director;
    protected final HashMap<String,Actor> actorList = new HashMap<>();

    Show(String title, int duration, Director director) {
        this.title     = title;
        this.duration  = duration;
        this.director  = director;
    }
    

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public HashMap<String,Actor> getActorList() {
        return actorList; 
    }

    public void printDirectotData(){
        System.out.println("_".repeat(20));
        System.out.println(director);
        System.out.println("_".repeat(20));
    }

    protected String actorListToString() {
        String result = "";
        if (actorList.size() == 0) {
            result += "Это постмодернистская постановка, в которой зрители сами представляют актеров.";
        } else {
            for (Actor actor : actorList.values()) {
                result += "\n" + actor;
            }
        }

        return result;
    }
    public void printActorList() {
        System.out.println("_".repeat(20));
        System.out.println("В спектакле '" + title + "' участвуют актеры:"); 
        System.out.println(actorListToString());
        System.out.println("_".repeat(20));
    }

    public void addNewActor(Actor actor) {
        if (actorList.containsValue(actor)) {
            System.out.println("Актер " + actor + " уже участвует в постановке " + title);
        } else {
            actorList.put(actor.getSurname(), actor);
        }
    }

    public void replacementOfActor(String surname, Actor actor) {
        System.out.println("~".repeat(20));
        if (actorList.containsKey(surname)) {
            System.out.println("Актер " + actorList.get(surname) + "в постановке '" + title + "' был заменен на " + actor);
            actorList.remove(surname);
            actorList.put(actor.getSurname(), actor);
        } else {
            System.out.println("Актера с фамилией " + surname + " нет в списке постановки '" + title +  "' . Заменить его не получится (︶︹︺)");
        }
        System.out.println("~".repeat(20));
    }
}
