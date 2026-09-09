class Director extends Person {

    private int numberOfShows;

    Director(Person person, int numberOfShows) {
        super(person.name, person.surname, person.gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        String objectDescription = String.format("Режиссер: %s %s", name, surname);
        return "Режиссер: " + name + " " + surname;  
    }
}
