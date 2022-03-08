//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name1 = "";
		String name2 = "";
		int size1 = 0;
		int size2 = 0;

		System.out.println("Enter 1st monster's name");
		name1 = keyboard.next();
		System.out.println("Enter 1st monster's size");
		size1 = keyboard.nextInt();
		
		System.out.println("Enter 2nd monster's name");
		name2 = keyboard.next();
		System.out.println("Enter 2nd monster's size");
		size2 = keyboard.nextInt();
		
		Skeleton m1 = new Skeleton(name1, size1);
		Skeleton m2 = new Skeleton(name2, size2);
		
		System.out.println("Monster 1 - " + m1);
		System.out.println("Monster 2 - " + m2);
		
		if (m1.isBigger(m2)) System.out.println("Monster 1 is bigger than Monster 2");
		else System.out.println("Monster 2 is bigger than Monster 1");
		
		if (m1.namesTheSame(m2)) System.out.println("Monster 1 has the same name is Monster 2");
		else System.out.println("Monster 1 does not have the same name as Monster 2.");

		
		

	}
}