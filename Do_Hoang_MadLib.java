import java.util.Scanner;
public class Do_Hoang_MadLib {
	public static String noun1;
	public static String verb1;
	public static String place1;
	public static String adjective1;
	public static String verbIng1;
	public static String pluralNoun1;
	public static String animal;
	public static String adjective2;
	public static String noun2;
	private static String userName;
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		Do_Hoang_MadLib c = new Do_Hoang_MadLib();
		System.out.println(" What's your name? ");
		c.userName = input.next();
		System.out.println("Could you give a noun? "+userName);
		noun1 = input.next();
		System.out.println("Could you give me a verb? "+userName);
		verb1 = input.next();
		System.out.println("Could you give me a place? "+ userName);
		place1 = input.next();
		System.out.println("Could you give me an adjective? "+ userName);
		adjective1 = input.next();
		System.out.println("Could you give me a verb wiht _ing? "+ userName);
		verbIng1 = input.next();
		System.out.println("Could you give me a plural noun? "+ userName);
		pluralNoun1 = input.next();
		System.out.println("Could you give me an animal? "+ userName);
		animal = input.next();
		System.out.println("Could you give me an adjective? "+ userName);
		adjective2 = input.next();
		System.out.println("Could you give me a noun? "+ userName);
		noun2 = input.next();

		System.out.print("Now is summer time, you plan going to gym to have more ");
		System.out.println(noun1);
		System.out.println("Then "+verb1+" your friend to "+ place1 +" afterward.");	
		System.out.print("And once per week, you visit some "+ adjective1);
		System.out.println(" places to meet new friends" +verbIng1+" about "+pluralNoun1+".");
		System.out.println("Also, you want to adopt a(n) "+animal+ " and name it numberOne. ");
		System.out.println("Onwards, you will have a new pet friend to play with you when being " +adjective2+" . ");
		System.out.println("Once day, you wake up and see a(n) "+noun2+ " lying next to you.");
		System.out.println("Maybe that is your pet.");
	}
}
