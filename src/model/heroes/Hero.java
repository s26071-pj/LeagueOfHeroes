package model.heroes;
import interfaces.heroes.ICanBeHero;

public abstract class Hero implements ICanBeHero{

    protected abstract void modifyStrength();
    protected abstract void modifyDefence();
    protected abstract void modifyIntelligence();
    protected abstract void modifyDexterity();
    protected abstract void modifyAgility();
    protected abstract void modifySpeed();

    protected int availableStatsPoints;
    protected String name;
    protected int strength;
    protected int defence;
    protected int intelligence;
    protected int dexterity;
    protected int agility;
    protected int speed;

    public int getStrength(){
        return strength;
    }
    public int getDefence(){
        return defence;
    }
    public int getIntelligence(){
        return intelligence;
    }
    public int getDexterity(){
        return dexterity;
    }
    public int getAgility(){
        return agility;
    }
    public int getSpeed(){
        return speed;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAvailableStatsPoints() {
        return availableStatsPoints;
    }

    //metoda levelUp dodaje za każdym wywołaniem 10 pnkt
    public void levelUp() {
        availableStatsPoints += 10;
    }


    @Override
    public void raiseStr(){
        if (availableStatsPoints<=0)return;
        modifyStrength();
        availableStatsPoints--;
    }
    @Override
    public void raiseDef(){
        if (availableStatsPoints<=0)return;
        modifyDefence();
        availableStatsPoints--;
    }
    @Override
    public void raiseInt(){
        if (availableStatsPoints<=0)return;
        modifyIntelligence();
        availableStatsPoints--;
    }
    @Override
    public void raiseDex(){
        if (availableStatsPoints<=0)return;
        modifyDexterity();
        availableStatsPoints--;
    }
    @Override
    public void raiseAgi(){
        if (availableStatsPoints<=0)return;
        modifyAgility();
        availableStatsPoints--;
    }
    @Override
    public void raiseSpd(){
        if (availableStatsPoints<=0)return;
        modifySpeed();
        availableStatsPoints--;
    }

// zastosowanie text blocku i formatera
//template - ala wzorzec
    public void printoutHero(){
        String template = """
                -----------------------------------------------------------------------------
                %s
                str: %s    | def: %s   | int: %s   | dex: %s   | agi: %s   | spd: %s   |
                -----------------------------------------------------------------------------
                 """;

        String result = String.format(
                template,
                getName(),
                getStrength(),
                getDefence(),
                getIntelligence(),
                getDexterity(),
                getAgility(),
                getSpeed()
        );

        System.out.println(result);
    }

}
