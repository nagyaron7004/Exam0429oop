package hu.nive.ujratervezes.oopcollection.army;

// Minden katonai egység számára elérhetőek az alábbi metódusok:
//
//doDamage(): adja vissza az egység sebzését int-ben.
//
//sufferDamage(int damage): a paraméterül kapott értéket levonja az egység életerő pontjaiból,
//ha az egység páncélozott, akkor csak az érték felét vonjuk le.


public abstract class MilitaryUnit {
    int health;
    int damage;
    boolean hasArmor;

    public MilitaryUnit(int health, int damage, boolean hasArmor) {
        this.health = health;
        this.damage = damage;
        this.hasArmor = hasArmor;
    }

    public int doDamage() {
        return damage;
    }

    public int sufferDamage(int damage) {
        if(hasArmor) {
            this.health -= damage / 2;
            return damage / 2;
        } else {
            this.health -= damage;
            return damage;
        }
    }
    public abstract int getHitPoints();
}

