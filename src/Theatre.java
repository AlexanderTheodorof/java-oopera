public class Theatre {
    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor(new Person("Федор Шаляпин", Gender.MALE), 197);
        Actor actor2 = new Actor(new Person("Иван Дмитриевский", Gender.MALE), 184);
        Actor actor3 = new Actor(new Person("Софья Гославская", Gender.FEMALE),165); 

        Director dyagilev = new Director(new Person("Сергей Дягилев", Gender.MALE),74);
        Director meyerhold = new Director(new Person("Всеволод Мейерхольд ", Gender.MALE), 56);
        
        Person choreographer = new Person("Вацлав Нижинский", Gender.MALE);
        Person musicAuthor   = new Person("Клара Шуман", Gender.FEMALE);

        Libretto libretto = new Libretto(); //загружаем либретто 

        Show        spectacle   = new Show("Сон в летнюю ночь",120, meyerhold);
        MusicalShow musicalShow = new MusicalShow(new Show("Фауст",120,dyagilev), musicAuthor, libretto.getLibrettoText());
        Ballet      ballet      = new Ballet(musicalShow,choreographer);
        Opera       opera       = new Opera(musicalShow, 12); 

        spectacle.addNewActor(actor1);
        spectacle.addNewActor(actor2);

        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);

        opera.addNewActor(actor1);
        opera.addNewActor(actor3);

        spectacle.printActorList();

        ballet.printActorList();

        opera.printActorList();

        ballet.replacementOfActor("Дмитриевский", actor1);

        ballet.printActorList();

        opera.replacementOfActor("Гагарин", actor2);
        opera.printActorList();

        ballet.printLibrettoText();
        opera.printLibrettoText();
    }
}
