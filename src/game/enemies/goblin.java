package game.enemies;

public class goblin extends enemies {

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
