package hu.nive.ujratervezes.oopcollection.army;

//Archer
//Az íjász életereje 50 pont, sebzése 20.
//Nem rendelkezik páncéllal.

public class Archer extends MilitaryUnit {

    public Archer() {
        super(50, 20, false);
    }

    @Override
    public int getHitPoints() {
        return 0;
    }
}