package game.player;

public class player {
  private int health;
  private int maxhealth;
  private int defence;
  private int damage;
  private int CC; //critical Chance likehood of occuring as a percent
  private int CD; //critical damage percent increase 100 = normal
  public player(){
    CC = 10;
    CD = 100;
  }
  /*
   * Player deals damage to enemies. Player has the chance to increase damage
   * by landing a critical hit. which deals damage * CD increase
   */
  public int attack(){
    if(criticalLanded()){
      return damage * (CD/100);
    }
    return damage;
  }
  /*
   * Player takes damage from an enemy
   * Player can defend and reduce the damage taken
   */
  public void damagetaken(int edamage){
    health = health - edamage;

  }

  public void defend(){

  } 
  public int heal(){

    return health;
  }
  public void flee(){

  }
  private boolean criticalLanded(){
    return true;
  }
  public String displayhealth(){
    String s;
    s = "Current Health: " + String.valueOf(health) + "/" + String.valueOf(maxhealth);
    return s;
  }
  public String optionMenu(){
    String s;
    s = " 1 Attack " + " 2 Defend " + "3 Heal";
    return s;
  }
}
