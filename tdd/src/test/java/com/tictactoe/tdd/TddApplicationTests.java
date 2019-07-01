package com.tictactoe.tdd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringRunner.class)
@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class TddApplicationTests {


//	private TddApplication mockBoard;
//
//	@Rule
//	public ExpectedException exception = ExpectedException.none();
//
//
//	@Before
//	public void makeTheBoard()
//	{
//		mockBoard = new TddApplication();
//	}
//
//	@Test
//	public void ifPlayerMakesLegalMoveShouldSaveMoveInArray()
//	{
//		mockBoard.play(2,2);
//
//		assertEquals(mockBoard.board[2][2], 'O');
//	}
//
//	@Test
//	public void ifPlayerMakesAnIllegalMoveForX_ShouldPrintOutIllegalMoveToThePlayer(){
//		exception.expect(RuntimeException.class);
//		mockBoard.play(1750,13);
//	}
//
//	@Test
//	public void ifPlayerMakesAnIllegalMoveForY_ShouldPrintOutIllegalMoveToThePlayer(){
//		exception.expect(RuntimeException.class);
//		mockBoard.play(1,13);
//	}
//
//	@Test
//	public void ifPlayerMakesAMove_CheckIfTheSpaceInsertedIsNotOccupied_OtherwiseThrowException()
//	{
//		mockBoard.board[1][1] = 'O';
//		exception.expect(RuntimeException.class);
//		mockBoard.play(1,1);
//
//	}
//
//	@Test
//	public void whenThePlayerSwapFunctionIsCallItShouldChangePlayerCharacter(){
//		mockBoard.player = 'O';
//
//		mockBoard.playerswap();
//		assertEquals(mockBoard.player, 'X');
//
//		mockBoard.playerswap();
//		assertEquals(mockBoard.player, 'O');
//	}
//
//	@Test
//	public void whenPlayerOneMakesAMove_WeExpectTheBoardToDisplay(){
//		mockBoard.play(1,1);
//		//TO BE TESTED. DONT IGNORE ME. I WILL FIND YOU IF YOU FORGET TO FEED ME. FFFEEEEEEEEEEEEEEEEDDDDDDD MMMEEEEEEEE
//		Mockito.verify(mockBoard).displayBoard();
//	}





//    @Test
//    public void playerInsertsIntoTheBoardLegally()
//    {
//        board.play(1,1);
//
//        char [][] ticTacToe = new char[3][3];
//
//        ticTacToe[1][1] = 'X';
//
//        assertEquals(ticTacToe[1][1], 'X');
//    }

}
