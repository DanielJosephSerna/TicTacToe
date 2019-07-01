package com.tictactoe.tdd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class TicTacToeTest {

    TicTacToe game;

    @Rule
	public ExpectedException exception = ExpectedException.none();

    @Before
    public void prepWork(){
        game = new TicTacToe();
    }

    @Test
    public void displayBoard_newGame_displaysEmptyBoard(){
        String expected =
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n";

        //TicTacToe game = new TicTacToe();

        assertEquals(expected, game.displayBoard());
    }

    @Test
    public void whenAPlayerMakesTheFirstMove_TheBoardWillDisplayOneOccupiedSpace()
    {
        game.player = 'X';
        String expected =
                "   |   |   \n" +
                "-----------\n" +
                "   | X |   \n" +
                "-----------\n" +
                "   |   |   \n";

        game.play(1, 1);
        assertEquals(expected, game.displayBoard());
    }

    @Test
    public void checkThatWhenXIsPlayerIllegally_ThatItThrowsAnException()
    {
        exception.expect(RuntimeException.class);
        game.play(1750,2);
    }

    @Test
    public void checkThatWhenYIsPlayerIllegally_ThatItThrowsAnException()
    {
        exception.expect(RuntimeException.class);
        game.play(2,23);
    }

    @Test
	public void ifPlayerMakesAMove_CheckIfTheSpaceInsertedIsNotOccupied_OtherwiseThrowException()
	{
        game.play(0,0);
		exception.expect(RuntimeException.class);
		game.play(0,0);

	}

    @Test
	public void whenThePlayerSwapFunctionIsCallItShouldChangePlayerCharacter(){
		game.player = 'O';

		game.playerswap();
		assertEquals(game.player, 'X');

		game.playerswap();
		assertEquals(game.player, 'O');
	}

	@Test
    public void WhenAPlayerLinesUpInTheTopRowDidWinShouldReturnTrue(){
        game.board[0][0] = 'X';
        game.board[0][1] = 'X';
        game.board[0][2] = 'X';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenAPlayerLinesUpInTheMiddleRowDidWinShouldReturnTrue(){
        game.board[1][0] = 'O';
        game.board[1][1] = 'O';
        game.board[1][2] = 'O';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenAPlayerLinesUpInTheBottomRowDidWinShouldReturnTrue(){
        game.board[2][0] = 'X';
        game.board[2][1] = 'X';
        game.board[2][2] = 'X';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenAPlayerLinesUpInTheRightColumnDidWinShouldReturnTrue(){
        game.board[0][0] = 'X';
        game.board[1][0] = 'X';
        game.board[2][0] = 'X';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenAPlayerLinesUpInTheMiddleColumnDidWinShouldReturnTrue(){
        game.board[0][1] = 'O';
        game.board[1][1] = 'O';
        game.board[2][1] = 'O';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenAPlayerLinesUpInTheBottomColumnDidWinShouldReturnTrue(){
        game.board[0][2] = 'X';
        game.board[1][2] = 'X';
        game.board[2][2] = 'X';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenAPlayerLinesUpDiagonallyDownwardDidWinShouldReturnTrue(){
        game.board[0][1] = 'O';
        game.board[1][1] = 'O';
        game.board[2][1] = 'O';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenAPlayerLinesUpDiagonallyUpwardDidWinShouldReturnTrue(){
        game.board[0][2] = 'O';
        game.board[1][2] = 'O';
        game.board[2][2] = 'O';

        assertEquals(true, game.didWin());
    }

    @Test
    public void WhenTheGameBootsUpDidWinShoulReturnFalse(){
        assertEquals(false, game.didWin());
    }

}