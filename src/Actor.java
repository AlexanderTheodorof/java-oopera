import java.util.Objects;

class Actor extends Person {
    //String name;
    //String surname;
    //Gender gender;
    private int   height;

    Actor(Person person, int height) {
        super(person.name, person.surname, person.gender);
        this.height = height; 
    }

    
    public int getHeight() {
        return height;
    }
        
    @Override
    public String toString() {
        String objectDescription = String.format("%s %s(%d)", name, surname, height);
        return objectDescription; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Actor   anotherActor  = (Actor) obj;
        boolean isEqName      = Objects.equals(this.name, anotherActor.name);
        boolean isEqSurname   = Objects.equals(this.surname, anotherActor.surname);
        boolean isEqHeight    = this.height  == anotherActor.height;

        return isEqName && isEqSurname && isEqHeight; 
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (this.name != null) {
            result += name.hashCode();
        }
        result *= 31;
        if (this.surname != null) {
            result += surname.hashCode();
        }
        result *= 7;
        if (height != 0) {
            result += height;
        }
        return result;
    }
}
