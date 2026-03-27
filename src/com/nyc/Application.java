package com.nyc;

import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//use loop
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Guess your number from 1 to 9: ");
		int guessedNum=scan.nextInt();
		//generate guessed number
		Random rand=new Random();
		int winnerNum=rand.nextInt(9)+1;
		
		if(guessedNum==winnerNum) {
			//print success msg
			System.out.println("\n\t********WINNER********");
			System.exit(0);
		}
		else
			//print failure msg
			System.out.println("LOSER!");
		}
	}

}
