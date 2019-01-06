package com.nyc;

import java.util.Random;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		while(true) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Guess your number: ");
		int guessedNum=scan.nextInt();
		Random rand=new Random();
		int winnerNum=rand.nextInt(99)+1;
		
		if(guessedNum==winnerNum) {
			System.out.println("WINNER!!!!!");
			System.exit(0);
		}
		else
			System.out.println("LOSER!");
		}
	}

}
