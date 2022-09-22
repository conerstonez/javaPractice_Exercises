package Practice.Notepad;

import java.util.Scanner;

public class Score{
	public static void main(String[] args){		

		Scanner mark = new Scanner(System.in);
		
		System.out.print("Enter Student score:");
		int score = mark.nextInt();

		System.out.printf("%s%d%s%n", " I scored ", score, " in Java");

	}

}