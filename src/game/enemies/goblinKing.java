package game.enemies;

public class goblinKing extends enemies {

  public goblinKing(){
    health = 200;
    defence = 68; //maybe remove?

  }
  public boolean isdead(){
    if(health < 0){
      return true;
    }
    return false;
  }
  public void getAttacked(int damage){
    health = health - damage;
  }
  public void defend(){}
}
