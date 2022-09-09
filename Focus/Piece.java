import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.lang.Object;

public class Piece
{
  private Color color;
  private int locationX;
  private int locationY;
  private String status, playerColorAsString;
  private Player player;

   public Piece(Player player, Color color, int locationX, int locationY, String playerColorAsString)
   {
     this.player = player;
     this.color = color;
     this.locationX = locationX;
     this.locationY = locationY;
     this.playerColorAsString = playerColorAsString;
     this.status = "inPlay";
   }

   public Color getColor()
   {
     return color;
   }

   public Player getPlayer()
   {
     return player;
   }

   public String getPlayerName()
   {
     return player.getPlayerName();
   }

   public String getColorAsString()
   {
     return playerColorAsString;
   }

   public void setReserved()
   {
     status = "reserved";
   }

   public void setCaptured()
   {
     status = "captured";
   }


   /* Possible other methods to include:


   public boolean isReserved()
   {
     if (status=="reserved")
     {
       return true;
     }
     else
     {
       return false;
     }
   }

   public boolean isCaptured()
   {
     if (status=="captured")
     {
       return true;
     }
     else
     {
       return false;
     }
   } */

}
