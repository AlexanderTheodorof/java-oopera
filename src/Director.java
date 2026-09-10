class Director extends Person {

    private int numberOfShows;

    Director(Person person, int numberOfShows) {
        super(person.name, person.surname, person.gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссер: " + super.toString();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += super.hashCode();
        result *= 31;
        result += numberOfShows;
        return result;
    }
}
