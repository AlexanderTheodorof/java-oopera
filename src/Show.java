import java.util.ArrayList;
import java.util.HashMap;

class Show {                    // спектакль
    protected String                    title;
    protected int                    duration;
    protected Director               director;
    //ArrayList<Actor> actorsList;
    protected HashMap<String,Actor> actorList;

    Show(String                   title,
         int                   duration,
         Director              director,
         HashMap<String,Actor> actorList) {
        this.title     = title;
        this.duration  = duration;
        this.director  = director;
        this.actorList = actorList;
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
        
}
