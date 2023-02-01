import java.util.Random;

public class Obstacle {
    private String oName;
    private int damage, award, health, maxNumber;

    public Obstacle(String oName, int damage, int award, int health, int maxNumber) {
        this.oName = oName;
        this.damage = damage;
        this.award = award;
        this.health = health;
        this.maxNumber = maxNumber;
    }
    public int count() {
     Random r = new Random();
 
      return  r.nextInt(this.maxNumber) + 1 ;
    }




    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

}
