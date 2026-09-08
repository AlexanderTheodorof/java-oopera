import java.util.ArrayList;
import java.util.HashMap;

class Show {                    // спектакль
    protected String                    title;
    protected int                    duration;
    protected Director               director;
    //ArrayList<Actor> actorsList;
    protected static final HashMap<String,Actor> actorList = new HashMap<>();

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
            result += "Актеры:";
            for (Actor actor : actorList.values()) {
                result += "\n" + actor;
            }
        }

        return result;
    }
    public void printActorList() {
        System.out.println("_".repeat(20));
        System.out.println(actorListToString());
        System.out.println("_".repeat(20));
    }

    public void addNewActor(Actor actor) {
        if (actorList.containsValue(actor)) {
            System.out.println("Актер " + actor + " уже участвует в спектакле " + title);
        } else {
            actorList.put(actor.getSurname(), actor);
        }
    }

    public void replacementOfActor(String surname, Actor actor) {
        System.out.println("~".repeat(20));
        if (actorList.containsKey(surname)) {
            System.out.println("Актер " + actorList.get(surname) + " был заменен на " + actor);
            actorList.remove(surname);
            actorList.put(actor.getSurname(), actor);
        } else {
            System.out.println("Актера с фамилией " + surname + " нет в списке. Заменить его не получится (︶︹︺)");
        }
        System.out.println("~".repeat(20));
    }
}
