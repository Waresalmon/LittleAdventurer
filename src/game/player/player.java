package game.player;

import java.util.Scanner;

public class player {
  private int health;
  private int maxhealth;
  //private int defence; TODO: future
  private int damage;
  //Make it functional first
  //private int CC; //critical Chance likehood of occuring as a percent
  //private int CD; //critical damage percent increase 100 = normal
  public player(){
    health = 100;
    damage = 5;
    //CC = 10;
    //CD = 100;
  }
  /*
   * Player deals damage to enemies. Player has the chance to increase damage
   * by landing a critical hit. which deals damage * CD increase
   */
  public int attack(){
    //if(criticalLanded()){
    //  return damage * (CD/100);
    //}
    return damage;
  }
  /*
   * Player takes damage from an enemy
   * Player can defend and reduce the damage taken
   */
  public void damagetaken(int enemyDamage){
    health = health - enemyDamage;
  }
  //FOR THE FUTURE
  //public void defend(){
  //} 
  public int heal(){
    health = health + health*(50/100); 
    return health;
  }
  public void playerDied(){
    System.out.println("YOU DIED");
    System.out.println("tough luck buddy");
  }

  //private boolean criticalLanded(){
  //  return true;
  //}
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
  public void readOption(){
    //need to read from number from the user.
    Scanner s = new Scanner(System.in);
    int selection = s.nextInt();
    boolean validFlag = true; 
    while (validFlag) {
      switch (selection) {
        case 1:
          //Player has chosen ATTACK
          attack();
          validFlag = false;
          break;
        case 2:
          //player has chosen DEFEND
          //TO COME IN THE FUTURE FOR NOW JUST IGNORE
          //defend()
          validFlag = false;
          break;
        case 3:
          //player has chosen HEAL
          heal();
          validFlag = false;
          break;
        default:
          //Invalid option was chosen
          System.out.println("INVALID OPTION WAS CHOSEN PLEASE CHOOSE A NEW OPTION");
          System.out.println(optionMenu());
          break;
      }
    }
  }
  public void selectTarget(){
    //Used when there are multiple targets

  }
}
