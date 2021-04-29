package hu.nive.ujratervezes.oopcollection.army;

//Heavy Cavalry
//A nehézlovas életereje 150 pont, sebzése 20.
//Páncélozott.
//
/* A lovasság a csatát rohammal indítja,
        így minden lovas első támadása háromszoros sebzést okoz,
        az utána következők egyszereset.*/

public class HeavyCavalry extends MilitaryUnit {

    private boolean rush;

    public HeavyCavalry() {
        super(150, 20, true);
        this.rush = true;
    }

    @Override
    public int doDamage() {
        if(rush) {
            this.rush = false;
            return this.damage * 3;
        } else {
            return this.damage;
        }
    }

    @Override
    public int getHitPoints() {
        return 0;
    }
}