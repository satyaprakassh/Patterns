import java.util.*;
import java.io.*;

public class StarPatterns
{
  
  public static void showTheSquareStarPattern()
  {
    for(int i=0;i<=4;i++)
    {
      for(int j=0;j<=4;j++)
      {
        System.out.print("* ");
      }
       System.out.println();
    }
   
  }
  
  
  public static void showTheTriangularStarPattern1()
  {

    for(int i=0;i<=4;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print("* ");
      }
       System.out.println();
    }
   
  }
  
  public static void showTheTriangularStarPattern2()
  {
    for(int i=0;i<=4;i++)
    {
      for(int j=4;j>=i;j--)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  public static void showTheTriangularStarPattern3()
  {
    //int l=4;
    //int i,j;
    int counter=4;
    for(int i=1;i<=5;i++)
    {
      for(int j=1;j<=5;j++)
      {
        if(j>counter)
        {
          System.out.print("* ");
        }
        else
        {
          System.out.print("  ");
        }
      }
      counter--;
      System.out.println();
      
    }
  }
   public static void showTheTriangularStarPattern4()
  {
     int counter=0;
    for(int i=0;i<=4;i++)
    {
      for(int j=0;j<=4;j++)
      {
        if(j<counter)
        {
          System.out.print("   ");
        }
        else
        {
           System.out.print("*  ");
        }
      }
      System.out.println();
      counter++;
    }
  }
  public static void showThePyramid1()
  {
    int left_side=5;
    int rigth_side=5;
    for(int i=0;i<=9;i++)
    {
      for(int j=0;j<=9;j++)
      {
        if(j<left_side||j>rigth_side)
        {
          System.out.print("   ");
        }
        else
        {
          System.out.print("*  ");
        }
      }
      left_side--;
      rigth_side++;
      System.out.println();
      if(i==4)
      {
        break;
      }
    }
  }
  
  
  
  public static void main(String ...args)
  {
    StarPatterns.showTheSquareStarPattern();
    System.out.println();
    StarPatterns.showTheTriangularStarPattern1();
    System.out.println();
    StarPatterns.showTheTriangularStarPattern2();
    System.out.println();
    StarPatterns.showTheTriangularStarPattern3();
    System.out.println();
    StarPatterns.showTheTriangularStarPattern4();
    System.out.println();
    StarPatterns.showThePyramid1();
     
  }
}
/*
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

* 
* * 
* * * 
* * * * 
* * * * * 

* * * * * 
* * * * 
* * * 
* * 
* 

        * 
      * * 
    * * * 
  * * * * 
* * * * * 

*  *  *  *  *  
   *  *  *  *  
      *  *  *  
         *  *  
            *  

               *              
            *  *  *           
         *  *  *  *  *        
      *  *  *  *  *  *  *     
   *  *  *  *  *  *  *  *  *  
*/