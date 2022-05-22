package model.heroes;

public class Archer extends Hero {
    /*
    //metoda podniesienia wybranych umiejetnosci punktów jeżeli wybierzemy frakcje Archer
     @Override
    public void raiseStr(){
        if(availableStatsPoints<=0)return;
        strength=(int)((strength+1)/1.05);
        strength++;
        strength*=1.05;
        availableStatsPoints--;
    }
    @Override
    public void raiseDef(){
        if(availableStatsPoints<=0)return;
        defence=(int)((defence+1)/1.05);
        defence++;
        defence*=1.05;
        availableStatsPoints--;
    }
    @Override
    public void raiseDex(){
        if(availableStatsPoints<=0)return;
        dexterity=(int)((dexterity+1)/1.2);
        dexterity++;
        dexterity*=1.2;
        availableStatsPoints--;
    }
     @Override
    public void raiseAgi(){
        if(availableStatsPoints<=0)return;
        agility=(int)((agility+1)/1.1);
        agility++;
        agility*=1.1;
        availableStatsPoints--;
    }
     @Override
    public void raiseSpd(){
        if(availableStatsPoints<=0)return;
        speed=(int)((speed+1)/1.05);
        speed++;
        speed*=1.05;
        availableStatsPoints--;
    }

     */

    protected void modifyStrength(){
        strength=(int)((strength+1)/1.05);
        strength++;
        strength*=1.05;
    }
    protected void modifyDefence(){
        defence=(int)((defence+1)/1.05);
        defence++;
        defence*=1.05;
    }
    protected void modifyIntelligence(){
        intelligence++;
    }
    protected void modifyDexterity(){
        dexterity=(int)((dexterity+1)/1.2);
        dexterity++;
        dexterity*=1.2;
    }
    protected void modifyAgility(){
        agility=(int)((agility+1)/1.1);
        agility++;
        agility*=1.1;
    }
    protected void modifySpeed(){
        speed=(int)((speed+1)/1.05);
        speed++;
        speed*=1.05;
    }
}