class Person {
    protected String name;
    protected String surname;
    protected Gender gender;

    // конструктор, упрощающий пользовательский ввод имени и фамилии
    Person(String fullName, Gender gender) {
        String[] parts = fullName.split(" ");

        this.name = parts[0];
        this.surname = parts[1];
        this.gender  = gender;
    }

    // конструктор, упрощающий процедурный ввод
    Person(String name, String surname, Gender gender){
        this.name    = name;
        this.surname = surname;
        this.gender  = gender; 
    }

    public String getName() {
        return name; 
    }
    
    public String getSurname(){
        return surname; 
    }
    
    public Gender getGender() {
        return gender;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        String objectDescription =
            name + " " + surname;
        return objectDescription; 
    }
}
