package game.player;

public class player {
  private int health;
  private int defence;
  private int damage;
  private int CC; //critical Chance likehood of occuring as a percent
  private int CD; //critical damage percent increase 100 = normal
  player(){
    CC = 10;
    CD = 100;
  }
  /*
   * Player deals damage to enemies. Player has the chance to increase damage
   * by landing a critical hit. which deals damage * CD increase
   */
  public int attack(){
    return damage;
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
}
