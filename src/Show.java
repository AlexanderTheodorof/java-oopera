import java.util.ArrayList;
import java.util.Scanner;

class Show  {
    protected String   title;
    protected int      duration;
    protected Director director;
    protected String   type;
    protected final ArrayList<Actor> actorList = new ArrayList<>();

    Show(String title, int duration, Director director) {
        this.title     = title;
        this.duration  = duration;
        this.director  = director;
        type = "спектакле"; 
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

    public ArrayList<Actor> getActorList() {
        return actorList; 
    }

    public void printDirectorData(){
        System.out.println("_".repeat(20));
        System.out.println(director);
        System.out.println("_".repeat(20));
    }

    protected String actorListToString() {
        String result = "";
        if (actorList.size() == 0) {
            result += "Это постмодернистская постановка, в которой зрители сами представляют актеров.";
        } else {
            for (Actor actor : actorList) {
                result += "\n" + actor;
            }
        }

        return result;
    }
    
    public void printActorList() {
        System.out.println("_".repeat(20));
        System.out.println("В " + type + "  '" + title + "' участвуют актеры:"); 
        System.out.println(actorListToString());
        System.out.println("_".repeat(20));
    }

    public void addNewActor(Actor actor) {
        if (actorList.contains(actor)) {
            System.out.println("Актер " + actor + " уже участвует в " + type + " '" + title + "'.");
        } else {
            actorList.add(actor);
        }
    }

    public void replacementOfActor(String surnameOfReplaced, Actor actor) {
        if (!actorList.contains(actor)) {
            Namesakes namesakes = new Namesakes(surnameOfReplaced, actorList);
            switch (namesakes.getSizeOfNamesakesList()) {
                case 0:
                    System.out.println("Актера с такой фамилией нет в списке");
                    break;
                case 1:
                    int   indexOfReplacement = namesakes.getNamesakeIndex(0);
                    Actor replacedActor      = namesakes.getNamesake(0); 
                    actorList.set(indexOfReplacement,actor);
                    System.out.println("Актер " + replacedActor + " был заменен на " + actor);
                    break;
                default:
                    System.out.println("В списке есть несколько актеров с такой фамилией");
                    namesakes.printNamesakes();
                    System.out.print("Введите номер актера, которого хотите заменить: ");

                    Scanner scanner = new Scanner(System.in);
                    while(true) {
                        String userInput = scanner.nextLine();
                        userInput = userInput.strip();
                        int userIndex = Integer.parseInt(userInput);
                        if (userIndex > 0 && userIndex <= namesakes.getSizeOfNamesakesList()) {
                            actorList.set(namesakes.getNamesakeIndex(userIndex - 1), actor);
                            System.out.println("Актер " + namesakes.getNamesake(userIndex - 1) + " был заменен на " + actor);
                            break;
                        } else {
                            System.out.println("Вы указали неправильный номер");
                            namesakes.printNamesakes();
                        }
                    }
            } 
        } else {
            System.out.println("Актер, которым вы хотите заменить, уже участвует в "
                                + type + " '" + title + "'.");
         }
    }
}

