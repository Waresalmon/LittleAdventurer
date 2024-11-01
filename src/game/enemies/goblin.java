package game.enemies;

public class goblin {
  private int health;
  private int defence;
  private int damage;
  private int CC; //critical Chance likehood of occuring as a percent
  private int CD; //critical damage percent increase 100 = normal

  goblin(){
    CC = 10;
    CD = 100;
  }
  public int attack(){
    return damage;
  }
  public int heal(){
    return health;
  }
}
