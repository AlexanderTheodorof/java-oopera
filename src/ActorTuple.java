class IndexActorTuple {
    private Actor actor;
    private int   index;

    IndexActorTuple(int index, Actor actor) {
        this.index = index;
        this.actor = actor; 
    }

    public Actor getActor() {
        return actor;
    }

    public int getIndex() {
        return index; 
    }
}
