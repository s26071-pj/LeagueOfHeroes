package model.heroes;

public class Mage extends Hero {
/*
    //metoda podniesienia wybranych umiejetnosci punktów jeżeli wybierzemy maga

    @Override
    public void raiseInt(){
        if(availableStatsPoints<=0)return;
        intelligence=(int)((intelligence+1)/1.2);
        intelligence++;
        intelligence*=1.2;
        availableStatsPoints--;
    }
    @Override
    public void raiseDex(){
        if(availableStatsPoints<=0)return;
        dexterity=(int)((dexterity+1)/1.05);
        dexterity++;
        dexterity*=1.05;
        availableStatsPoints--;
    }
    @Override
    public void raiseAgi(){
        if(availableStatsPoints<=0)return;
        agility=(int)((agility+1)/1.02);
        agility++;
        agility*=1.02;
        availableStatsPoints--;
    }
*/

    protected void modifyStrength(){
        strength++;
    }
    protected void modifyDefence(){
        defence++;
    }
    protected void modifyIntelligence(){
        intelligence=(int)((intelligence+1)/1.2);
        intelligence++;
        intelligence*=1.2;
    }
    protected void modifyDexterity(){
        dexterity=(int)((dexterity+1)/1.05);
        dexterity++;
        dexterity*=1.05;
    }
    protected void modifyAgility(){
        agility=(int)((agility+1)/1.02);
        agility++;
        agility*=1.02;
    }
    protected void modifySpeed(){
        speed++;
    }
}
