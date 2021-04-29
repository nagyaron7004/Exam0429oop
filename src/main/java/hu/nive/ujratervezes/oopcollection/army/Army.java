package hu.nive.ujratervezes.oopcollection.army;

//A hadseregnek az alábbi metódusai vannak:
//
//addUnit(MilitaryUnit militaryUnit), amivel egy katonai egységet tudunk hozzáadni a sereghez,
//
//damageAll(int damage), ami a sereg minden egységének életerejéből levonja a paraméterül kapott értéket,
//valamint eltávolítja a seregből azokat az egységeket, melyeknek így 25 pont alá csökkent az életerejük
//(azaz harcképtelenek vagy halottak),
//
//getArmyDamage(), ami visszaadja, hogy az aktuális támadással mennyi sebzést okoz a sereg összesen,
//
//getArmySize(), ami visszaadja, hogy hány egységből áll a sereg.

import java.util.ArrayList;
import java.util.List;

public class Army {
    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        this.army.add(militaryUnit);
    }
    public void damageAll(int damage) {
        this.army.forEach(solider -> solider.sufferDamage(damage));
        this.army.removeIf(solider -> solider.health <= 25);
    }
    public int getArmyDamage() {
        return this.army.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }
    public int getArmySize() {
        return this.army.size();
    }
}