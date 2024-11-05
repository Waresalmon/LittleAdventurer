package game.floors;

import game.enemies.*;
import java.util.ArrayList;

public class f1 extends dungeon {
  private int goblinCount;
  private int bossCount;
  
  public f1(){
    goblinCount = 10;
    bossCount = 1;
    enemyList = new ArrayList<enemies>();
    //insertEnemies(); //good idea?, bad idea?
  }
  public void insertEnemies(){
    //Floors only contains 10 goblins and 1 boss
    for(int i = 0; i < goblinCount; i++){
      enemies g = new goblin();
      enemyList.add(g);
    }
    boss = new goblinKing();
  } 


  
}
