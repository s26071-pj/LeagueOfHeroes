package interfaces.heroes;

public interface ICanBeHero {
    int getStrength();
    int getDefence();
    int getIntelligence();
    int getDexterity();
    int getAgility();
    int getSpeed();
    String getName();
    void setName(String name);
    int getAvailableStatsPoints();
    void levelUp();

    void raiseStr();
    void raiseDef();
    void raiseInt();
    void raiseDex();
    void raiseAgi();
    void raiseSpd();

}