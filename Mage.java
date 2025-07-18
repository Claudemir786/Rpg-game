

import java.util.Random;

public class Mage extends Character{

    public Mage(String name){
        super(name);
        setStrength(13);
        setDefense(2);
    }

    public int attack(Character target){

        System.out.println("the Mage "+getName() + " casts his magic..!!");
        //setStrength(13);
        int atc = getStrength();

        Random random  = new Random();
        int criticalHit = random.nextInt(10);

        if(criticalHit > 3){
            if(target.getLife() >0){
                target.setLife(getLife() - atc);
            }else{
                System.out.println("Character " + target.getName() + " is dead");
            }
        }else if(criticalHit >0 && criticalHit <3){
              if(target.getLife() > 0){
                System.out.println("Bonus critical hit");    
                target.setLife(getLife()-(atc + criticalHit));                
            }else{
                System.out.println("Character " + target.getName() + " is dead");
                
            }
        }
      return 0;
       
    }

    public int defense(){
        System.out.println("the Mage defends..!!");

        setLife(getDefense() + getLife());
        return getLife();
    }

     @Override
    public void showStatus(){
        System.out.println("name: "+ getName() + " Life: "+ this.getLife() + " Strength: "+ this.getStrength() + " Defense: "+ this.getDefense());
          
    }
}
