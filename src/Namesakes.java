import java.util.ArrayList;

class Namesakes {
    
    private ArrayList<Actor>   namesakes;
    private ArrayList<Integer> namesakeIndex;

    Namesakes(String surname, ArrayList<Actor> actorList) {
        namesakes     = new ArrayList<>();
        namesakeIndex = new ArrayList<>();
        findNamesakes(surname,actorList);
    }

    public Actor getNamesake(int index) {
        return namesakes.get(index);
    }

    public int getNamesakeIndex(int index) {
        return namesakeIndex.get(index);
    }

    public int getSizeOfNamesakesList() {
        return namesakes.size();
    }
    
    private void findNamesakes(String surname, ArrayList<Actor> actorList) {
        for (int i = 0; i < actorList.size(); i++) {
            Actor   actorFromList   = actorList.get(i);
            boolean isActorContains = surname.equals(actorFromList.surname);
            
            if (isActorContains) {
                namesakes.add(actorFromList);
                namesakeIndex.add(i);
            }
        }
    }

    public void printNamesakes() {
        for (int i = 0; i < namesakes.size(); i++) {
            System.out.println((i+1) + " " + namesakes.get(i));
        }
    }
}
