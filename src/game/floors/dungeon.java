package game.floors;

import game.enemies.enemies;
import game.player.player;
import java.util.ArrayList;

public class dungeon {
  protected static boolean bossDefeated;    //Had to make static is there a way to avoid this?
  protected static boolean adventurerAlive; //Had to make static is there a way to avoid this?
  protected ArrayList<enemies> enemyList;
  protected enemies boss;
  
    public dungeon(){
      bossDefeated = false;
      adventurerAlive = true;
      enemyList = new ArrayList<>();
      
    }
    public String encounter(enemies e){
      String s;
      s = "You have encounter a " + e.getClass().getSimpleName(); //get class name of enemy randomly from the list
      return s;

    }
    //insertion is done by the floor class
    public enemies selectRandomEnemy(){
      int index = (int) (Math.random() * enemyList.size());
      return enemyList.get(index);
    }
    
    public void removeEnemy(enemies e){
      enemyList.remove(e); //should be by reference
    }
    public static void main(String[] args) {
      dungeon currentD = new f1(); //creates new floor 1. player must clear f1 before going to f2
      //doesn'd intialize dungeon constructor will insert use f1() constructor
      player player = new player(); //creates player
      enemies nextEnemy = currentD.selectRandomEnemy();

      System.out.println("Welcome adventurer");
      while(bossDefeated == false && adventurerAlive == true){
        //set up encouter
        System.out.println(currentD.encounter(nextEnemy));
        
    }

  }

}
