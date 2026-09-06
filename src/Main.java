import java.util.HashMap;
import java.util.ArrayList; 
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Поехали!");

        Person   person1  = new Person("Светлана Баскова", Gender.FEMALE);
        Person   person2  = new Person("Владимир Епифанцев", Gender.MALE);
        Person   person3  = new Person("Сергей Пахомов", Gender.MALE);
        Director director = new Director(person1,120);
        Actor    actor1   = new Actor(person2, 175);
        Actor    actor2   = new Actor(person3,182);
        
        HashMap<String, Actor> actorList = new HashMap<>();
        
        Show show = new Show("Фауст", 120, director, actorList);
        Libretto libretto = new Libretto();
        MusicalShow musicalShow = new MusicalShow(show,"Шарль Гуно", libretto.getLibrettoText());
        
        
        //System.out.println(director);
        
        System.out.println(director);
        System.out.println(actor1);
        System.out.println(actor2);
        
        actorList.put(actor1.getSurname(),actor1);
        actorList.put(actor2.getSurname(),actor2);
        System.out.println(actorList);
        System.out.println(actor1.equals(actor1));
        System.out.println(actor1.hashCode());
        System.out.println(actor2.hashCode());
        musicalShow.printLibrettoText();
        
    }
}
