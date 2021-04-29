package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean shield;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
        this.shield = true;
    }
    @Override
    public int sufferDamage(int damage) {
        if(shield) {
            this.shield = false;
            return 0;
        } else {
            if(hasArmor) {
                this.health -= damage / 2;
                return damage / 2;
            } else {
                this.health -= damage;
                return damage;
            }
        }
    }

    @Override
    public int getHitPoints() {
        return this.health;
    }
}