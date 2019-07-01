package com.tictactoe.tdd;

public class TicTacToe {

    char [][] board = {{' ', ' ', ' ',},
                       {' ', ' ', ' ',},
                       {' ', ' ', ' ',}};

    char player = 'X';

    public void play(int x, int y){

        // CHECK FOR ILLEGAL MOVES
        if(x < 0 || x > 2)
        {
            throw new RuntimeException("Illegal move!");
        }
        else if( y < 0 || y > 2 )
        {
            throw new RuntimeException("Illegal move!");
        }

        // CHECK IF SPACE IS OCCUPIED
        if(board[x][y] != ' ')
        {
            throw new RuntimeException("Space is occupied!");
        }
        else
        {
            board[x][y] = player;
            playerswap();
        }

    }

    public String displayBoard(){

        String temp = " " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " \n" +
                      "-----------\n" +
                      " " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " \n" +
                      "-----------\n" +
                      " " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " \n";

        return temp;
    }

    // Function for swaping turns
    public void playerswap(){
        if(player == 'X'){
            player = 'O';
        }else if(player == 'O'){
            player = 'X';
        }else{
            System.out.print("What have you done to my application? You have broken it beyond repair");
        }

    }

    public boolean didWin(){
        if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' '){
            return true;
        }
        else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' '){
            return true;
        }
        else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' '){
            return true;
        }
        else if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' '){
            return true;
        }
        else if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' '){
            return true;
        }
        else if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != ' '){
            return true;
        }
        else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' '){
            return true;
        }
        else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' '){
            return true;
        }

        return false;
    }

    public boolean didTie(int count){
        return true;
    }

    //Contructor
    public TicTacToe()
    {

    }
}
