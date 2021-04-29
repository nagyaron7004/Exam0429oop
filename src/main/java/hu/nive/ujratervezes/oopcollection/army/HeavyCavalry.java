package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean attac;

    public HeavyCavalry() {
        super(150, 20, true);
        this.attac = true;
    }

    @Override
    public int doDamage() {
        if(attac) {
            this.attac = false;
            return this.damage * 3;
        } else {
            return this.damage;
        }
    }
    @Override
    public int getHitPoints() {
        return this.health;
    }
}