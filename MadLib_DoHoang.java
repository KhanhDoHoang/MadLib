# MadLib
Making a word game

/*This program illustrates a MadLib
 * made by Do Hoang
 * ID course CST8110 section 320
 */
 
 
import java.util.Scanner;

/*This program illustrates the MadLib game 
 * made by Hoang Do
 * ID course : CST8110 
 */

public class MadLib_DoHoang {

	public static void main (String[]args) {
		
		Scanner input = new Scanner (System.in);
		String userName;
		String[] user = new String[9];
		
		System.out.println("This is a Mad Lib game: ");
		System.out.println("Can you give me your name: ");
		userName =input.next();
		
		String[] MadLibQuest = { "noun", "verb", "place","adjective", "V_ing", "pluralNoun", "animal", "adjective", "noun"};
		
		for (int index = 0; index < 9; index++) {
		
			System.out.println("Could you give a(n)"+MadLibQuest[index]+" ,"+userName+" ?");
			
			user[index] = input.nextLine();
			user[index] = input.next();
		}
		
		System.out.println(" Now is summer time, you plan going to gym to have more "+ user[0]+ " .");
		System.out.println(" Then "+user[1]+ " your friend to "+user[2]+" afterwars.");
		System.out.print(" And once per week, you visit some "+ user[3] +" places to meet new friends ");
		System.out.print(user[4] +" about ");
		System.out.println(" talking about "+user[5]+" .");
		System.out.println(" Also, you want to adopt a new "+ user[6] +" and name it numberOne.");
		System.out.println(" Onwards, you will have a new pet friend to play with you when being "+user[7]);
		System.out.println(" Once day, you wake up and see a(n) "+user[8]+ " .Maybe that is your pet.");
		
	}
	
}

