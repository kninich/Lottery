package com.nyc;

import java.util.Random;
import java.util.Scanner;

public class Application {

	//conflict example
	public static void main(String[] args) {
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Guess your number from 1 to 9: ");
		int guessedNum=scan.nextInt();
		Random rand=new Random();
		int winnerNum=rand.nextInt(9)+1;
		System.out.println("winner number is " + winnerNum);
		
		if(guessedNum==winnerNum) {
			System.out.println("\n\t********WINNER********");
			System.exit(0);
		}
		else
			System.out.println("LOSER!");
		}
	}

}
