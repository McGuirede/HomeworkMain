import java.util.Scanner;


class RoShamBo {
  public static void main(String[] args)
  {
    System.out.println ("Hello Player" + '\n' + "Choose your Weapon:");

    System.out.println ("1. Rock" + '\n' + "2. Paper" + '\n' + "3. Scissors");

    /*    Int Rock = 0;

    Int Paper = 1;

    int Scissors = 2;
    */
    int CpWeapon = (int)(Math.random()*3);

    Scanner UserInput = new Scanner (System.in);

    String userWeapon;
    int intWeapon;

    userWeapon = UserInput.nextLine();
    intWeapon = UserInput.nextInt();

    System.out.println ("Player's Choice: " + userWeapon);

    //System.out.println(CpWeapon);

    if (CpWeapon == 0) {
      System.out.println("Computer's Choice: Rock");
    } else if (CpWeapon == 1){
      System.out.println("Computer's Choice: Paper");
    } else if (CpWeapon == 2){
      System.out.println("Computer's Choice: Scissors");
    } else
      System.out.println(CpWeapon);

      if (intWeapon == 0 ^= userWeapon == "Rock"){
        System.out.println("Player's Choice: Rock");
      } else if (intWeapon == 1 ^= userWeapon == "Paper"){
        System.out.println("Player's Choice: Paper");
      } else if (intWeapon == 2 ^= userWeapon == "Scissors"){
        System.out.println("Player's Choice: Scissors");
      } else
        System.out.println(userWeapon);

      /*  if (userWeapon == "Rock") {
          System.out.println("Player's Choice: Rock");
        } else if (userWeapon == "Paper"){
          System.out.println("Player's Choice: Paper");
        } else if (userWeapon == "Scissors"){
          System.out.println("Player's Choice: Scissors");
        } else
          System.out.println("Hello World");*/
    }


  }
