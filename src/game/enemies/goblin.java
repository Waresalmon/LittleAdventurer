package game.enemies;

public class goblin extends enemies {

  public goblin(){
    health = 100;
    defence = 10;
    CC = 10;
    CD = 101;
  }
  public int attack(){
    return damage;
  }
  public int heal(){
    return health;
  }
}
