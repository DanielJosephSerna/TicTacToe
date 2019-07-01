package com.tictactoe.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class TddApplication {

	public static void main(String[] args) {

		TicTacToe game = new TicTacToe();

		System.out.println("My board: ");
		System.out.println(game.displayBoard());
		// displayBoard();
		//
		//        play(1,1);
		//        displayBoard();


	}



}
