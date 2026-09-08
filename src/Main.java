import java.util.HashMap;
import java.util.ArrayList; 
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поехали!");
        
        Person   person1  = new Person("Светлана Баскова", Gender.FEMALE);
        Person   person2  = new Person("Владимир Епифанцев", Gender.MALE);
        Person   person3  = new Person("Сергей Пахомов", Gender.MALE);
        Person   person4  = new Person("Шарль Гуно", Gender.MALE);
        Director director = new Director(person1,120);
        Actor    actor1   = new Actor(person2, 175);
        Actor    actor2   = new Actor(person3,182);
        Actor    actor3   = new Actor(new Person("Джейсон Стэтхем"
                                                 ,Gender.MALE),
                                      187);

        Show show = new Show("Фауст", 120, director);
        show.addNewActor(actor1);
        show.addNewActor(actor2);
        show.addNewActor(actor1);
        show.replacementOfActor("Епифанцев", actor3);
        show.replacementOfActor("Гагарин", actor2);
        show.replacementOfActor("Стэтхем", actor3);
        //show.printActorList();

        Libretto    libretto    = new Libretto();
        MusicalShow musicalShow = new MusicalShow(show, person4, libretto.getLibrettoText());
        Opera       opera       = new Opera(musicalShow, 120);
        // opera.printActorList();
        System.out.println(opera);

        Ballet ballet = new Ballet(musicalShow, new Person("Вячеслав Самодуров", Gender.MALE));
        System.out.println(ballet);

        //Ballet ballet = new Ballet()
        // show.printDirectotData();
        //show.printActorList();
        // HashMap<String, Actor> actorList = new HashMap<>();
        // actorList.put(actor1.getSurname(), actor1);
        // actorList.put(actor2.getSurname(), actor2);
        // Show show = new Show("Фауст", 120, director, actorList);
        // Libretto libretto = new Libretto();
        // MusicalShow musicalShow = new MusicalShow(show,"Шарль Гуно", libretto.getLibrettoText());
        
        // Show show2 = new Show("Ромео и Джульетта", 120, director, null);
        //System.out.println(director);
        
        // System.out.println(director);
        // System.out.println(actor1);
        // System.out.println(actor2);
        
        // actorList.put(actor1.getSurname(),actor1);
        // actorList.put(actor2.getSurname(),actor2);
        // System.out.println(actorList);
        // System.out.println(actor1.equals(actor1));
        // System.out.println(actor1.hashCode());
        // System.out.println(actor2.hashCode());
        // musicalShow.printLibrettoText();

        // musicalShow.printDirectotData();
        // musicalShow.printActorList();
        // musicalShow.printLibrettoText();

        // show.printDirectotData();
        // show.printActorList();
        // show2.printDirectotData();
        // show2.printActorList();
    }
}
