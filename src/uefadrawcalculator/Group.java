package uefadrawcalculator;

import java.util.ArrayList;
import java.util.Collections;

public class Group {

    protected ArrayList<Club> clubs = new ArrayList<>();
    
    public void addClub(Club club){
        this.clubs.add(club);
    }   

    public ArrayList<Club> getClubs() {
        return clubs;
    }
    
    public void shuffle(){
        Collections.shuffle(clubs);
    }
    public void removeClub(Club club){
        this.clubs.remove(club);
    }
}
