import java.util.Objects;

class Actor extends Person {
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
        String objectDescription = super.toString() + "(" + height + ")"; 
        return objectDescription; 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Actor   anotherActor  = (Actor) obj;
        boolean isEqPerson    = super.equals(anotherActor);
        boolean isEqHeight    = this.height  == anotherActor.height;

        return isEqPerson && isEqHeight; 
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += super.hashCode();
        result *= 31;
        result += height; 
        return result;
    }
}
