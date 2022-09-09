import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Random;



public class CPU extends SetUp
{
	public GameTile [][] gameTile;
	public int currX, currY, steps, prevX, prevY;
	private String cpuDifficulty = SetUp.getDifficultyLevel();
	ArrayList<GameTile> Moves = new ArrayList<GameTile>();
	public int height;


  public void Easy (String cpuDifficulty)
 // here our goal is to choose tile randomly
  //then it will move the peice according to legal moves
  //for movement we will choose tile randomly
  {
	  if (cpuDifficulty.equals("Easy"));

	   {
		   Random rn =new Random();
		   int currX = rn.nextInt(9);
		   int currY = rn.nextInt(9);
		   GameTile gt = new GameTile(currX, currY);
		   int steps = gt.getPieceHeight();
           for(int i=1; i<=steps; i++)
            {
        	   if(((currX+i)>=0)&&((currX+i)<=10))
               {
                 Object[][] gameTile = null;
				if(((GameTile) gameTile[currX+i][currY]).hasPiece())
                 {
                   ((Frame) gameTile[currX+i][currY]).setBackground(((GameTile) gameTile[currX+i][currY]).getTopPieceColor().darker());
                   Moves.add((GameTile) gameTile[currX+i][currY]);
                 }
                 Moves.add((GameTile) gameTile[currX+i][currY]);

               }
        	   Object[][] gameTile = null;
			   if(((currX-i)>=0)&&((currX-i)<=10))
               {
                 if(((GameTile) gameTile[currX-i][currY]).hasPiece())
                 {
                   ((Frame) gameTile[currX-i][currY]).setBackground(((GameTile) gameTile[currX-i][currY]).getTopPieceColor().darker());
                 }
                 Moves.add((GameTile) gameTile[currX-i][currY]);
               }

               if(((currY+i)>=0)&&((currY+i)<=10))
               {
                 if(((GameTile) gameTile[currX][currY+i]).hasPiece())
                 {
                   ((Frame) gameTile[currX][currY+i]).setBackground(((GameTile) gameTile[currX][currY+i]).getTopPieceColor().darker());
                 }
                 Moves.add((GameTile) gameTile[currX][currY+i]);
               }

               if(((currY-i)>=0)&&((currY-i)<=10))
               {
                 if(((GameTile) gameTile[currX][currY-i]).hasPiece())
                 {
                   ((Frame) gameTile[currX][currY-i]).setBackground(((GameTile) gameTile[currX][currY-i]).getTopPieceColor().darker());
                 }
                 Moves.add((GameTile) gameTile[currX][currY-i]);
               }
             }

           prevX = currX;
           prevY = currY;

           gameTile[currX][currY].addPiece(gameTile[prevX][prevY].removePiece());
           for (int y=0; y<10; y++)
           {
             for (int x=0; x<10; x++)
             {
               gameTile[x][y].setBorder(BorderFactory.createLineBorder(Color.darkGray));
               if(gameTile[x][y].hasPiece())
               {
                 gameTile[x][y].setBackground(gameTile[x][y].getTopPieceColor());
               }
               else
               {
                 gameTile[x][y].setBackground(Color.white);
               }
             }
           }

          }




	   }

  public void difficult(String cpuDifficulty)
  //here in the difficult AI our plan was to find out the tallest stack
  // so if we have 2 stack one has 2 height and another one has 4 height out piece will choose the highest height one to move the piece.
  {
	  if (cpuDifficulty.equals("Difficult"));

	   {
		   Random rn =new Random();
		   int currX = rn.nextInt(9);
		   int currY = rn.nextInt(9);
		   GameTile gt = new GameTile(currX, currY);
		   int steps = gt.getPieceHeight();
          for(int i=1; i<=steps; i++)
           {
       	   if(((currX+i)>=0)&&((currX+i)<=10))
              {
                Object[][] gameTile = null;
				if(((GameTile) gameTile[currX+i][currY]).hasPiece())
                {
                  ((Frame) gameTile[currX+i][currY]).setBackground(((GameTile) gameTile[currX+i][currY]).getTopPieceColor().darker());
                  Moves.add((GameTile) gameTile[currX+i][currY]);
                }
                Moves.add((GameTile) gameTile[currX+i][currY]);

              }
       	   Object[][] gameTile = null;
			   if(((currX-i)>=0)&&((currX-i)<=10))
              {
                if(((GameTile) gameTile[currX-i][currY]).hasPiece())
                {
                  ((Frame) gameTile[currX-i][currY]).setBackground(((GameTile) gameTile[currX-i][currY]).getTopPieceColor().darker());
                }
                Moves.add((GameTile) gameTile[currX-i][currY]);
              }

              if(((currY+i)>=0)&&((currY+i)<=10))
              {
                if(((GameTile) gameTile[currX][currY+i]).hasPiece())
                {
                  ((Frame) gameTile[currX][currY+i]).setBackground(((GameTile) gameTile[currX][currY+i]).getTopPieceColor().darker());
                }
                Moves.add((GameTile) gameTile[currX][currY+i]);
              }

              if(((currY-i)>=0)&&((currY-i)<=10))
              {
                if(((GameTile) gameTile[currX][currY-i]).hasPiece())
                {
                  ((Frame) gameTile[currX][currY-i]).setBackground(((GameTile) gameTile[currX][currY-i]).getTopPieceColor().darker());
                }
                Moves.add((GameTile) gameTile[currX][currY-i]);
              }
            }

          prevX = currX;
          prevY = currY;



          // here we have to do the coding for how to move the piece with tallest stack

          //height = gameTile[currX][currY-i]).hasPiece())

          //if ( height < 1 )

          // if we have 2 stack then we ae going to compare them then we will move them.

          // if height is greater then 1  we are going to put our piece in the top of that tile




  }


 }

}
