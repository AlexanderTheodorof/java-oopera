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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        
        Person  anotherPerson = (Person) obj;
        boolean isEqName      = this.name.equals(anotherPerson.name);
        boolean isEqSurname   = this.surname.equals(anotherPerson.surname);
        boolean isEqGender    = this.gender.equals(anotherPerson.gender);

        return isEqName && isEqSurname && isEqGender; 
     }

    @Override
    public int hashCode() {
        int result = 17;
        if (this.name != null) result += name.hashCode();
        result *= 31;
        if (this.surname != null) result += surname.hashCode();
        result *= 7;
        if (this.gender != null) result += gender.hashCode();
        return result; 
    }
}
