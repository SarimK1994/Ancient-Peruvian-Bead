/**************************************************************************
*                                                                         *
*     Program Filename:  Khan02B.java                                     *
*     Author          :  Sarim Khan                                       *
*     Date Written    :  September 5th, 2017                              *
*     Purpose         :  To find the volume of the ancient Peruvian Bead  *
*     Input from      :  Keyboar                                          *
*     Output to       :  Screen                                           *
*                                                                         *
**************************************************************************/
import java.util.Scanner; 
import java.util.Random;

public class Khan02B
{

   public static void main (String[] args)
   {
      int i, point, count = 0; 
      double x, y, z, Volume; 
      Random RNG = new Random(); 
      
      Scanner input = new Scanner(System.in); 
      System.out.println("Please enter the amount of points you would like to populate:"); 
      point = input.nextInt(); 
      
      for (i = 1; i<= point; i++)
      {
         x = 8*RNG.nextDouble() - 4.0; 
         y = 8*RNG.nextDouble() - 4.0; 
         z = 8*RNG.nextDouble() - 4.0; 
         
         if(x*x + y*y > 1 && x*x + y*y + z*z <= 16)
         {
            count++; 
         }
      }
      
         Volume = 512.0*count/point; 
         System.out.println(Volume); 
   }
}         
     