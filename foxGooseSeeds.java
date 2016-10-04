/**
* < This program runs the Fox Goose Seeds game. Get all the items the other side of the river to win! >
* @author Bao Pham
*/

import java.util.Scanner;

public class foxGooseSeeds
{
	public static boolean gameLose;
	public static boolean gameWin;
	public static boolean seeds;
	public static boolean goose;
	public static boolean fox;
	public static boolean human;

	/**
	* This is the main method
	* It operates the two smaller methods and prints the instructions
	*/
	public static void main( String[] args )
	{
	
		System.out.println();
		System.out.println( "You are trying to transport seeds, a goose, and a fox to the other side" );
		System.out.println();
		System.out.println( "of the river. You may only carry 1 item at a time on your boat" );
		System.out.println();
		System.out.println( "and you must be on the same side as the item you plan on transporting." ); 
		System.out.println();
		System.out.println( "You may not leave the fox alone with the goose or the" );
		System.out.println();
		System.out.println( "goose alone with the seeds, else you will lose." );
		System.out.println();
		System.out.println( "Transport all 3 items to the other side without fail and you will win!" );
		System.out.println();
		
		
		while( gameLose != true && gameWin != true )
		{
		
			// operates the game
			game();
		
			// prints the graphics
			graphics();
			
		}
		
		if( gameLose == true )
		{
		
			if( fox == goose )
			{
				
				System.out.println( "The fox ate the goose! You lose!" );
				
			}
			
			if( goose == seeds )
			{
			
				System.out.println( "The goose ate the seeds! You lose!" );
				
			}
			
		}	
		
		else if( gameWin == true )
		{
		
			System.out.println( "You win!" );
			
		}
	
	}
	
	/**
	* This is the game method. It keeps track of which item is on what side
	*/
	public static void game()
	{
	
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print( "Which item do you want to move? fox, goose, seeds or none: " );
		String userPick = keyboard.nextLine();
		
		if( userPick.equals( "none" ) )
		{
		
			human = !human;
			
		}
		
		if( userPick.equals( "fox" ) )
		{
		
			if( human != fox )
			{

				System.out.println( "You are not on the same side as that item!" );

			}
			else
			{
			
				fox = !fox;
				human = !human;
				
			}

		}
		
		if( userPick.equals( "goose" ) )
		{
		
			if( human != goose )
			{

				System.out.println( "You are not on the same side as that item!" );

			}
			else
			{
			
				goose = !goose;
				human = !human;
				
			}

		}
		
		if( userPick.equals( "seeds" ) )
		{
		
			if( human != seeds )
			{

				System.out.println( "You are not on the same side as that item!" );

			}
			else
			{
			
				seeds = !seeds;
				human = !human;
				
			}


		}
		
		if( (fox == goose && seeds != goose && human != goose ) || (goose == seeds && fox != seeds && human != seeds ) )
		{
		
			gameLose = !gameLose;
			
		}
		
		if( fox == true && goose == true && seeds == true )
		{
		
			gameWin = !gameWin;
			
		}
		
	
	}
	
	/**
	* this is the graphics methods
	* it prints the graphics
	*/
	public static void graphics()
	{
	
		String bank0 = "";
		String bank1 = "";
		
		if (seeds == false)
		{
		
			bank0 += " seeds";
			
		}
		else
		{
		
			bank1 += " seeds";
			
		}
		
		if (goose == false)
		{
		
			bank0 += " goose";
			
		}
		else
		{
		
			bank1 += " goose";
			
		}
		
				
		if (fox == false)
		{
		
			bank0 += " fox";
			
		}
		else
		{
		
			bank1 += " fox";
			
		}
				
		if (human == false)
		{
		
			bank0 += " human";
			
		}
		else
		{
		
			bank1 += " human";
			
		}
		
		System.out.println();
		System.out.println( bank0 );
		System.out.println( "__________________________________" );
		System.out.println( "~~~~~~~~~~<><~~~~~~~~~<><~~~~~~~~~" );
		System.out.println( "~~~~~~<><~~~~~~~~~~~~~~~~~~<><~~~~" );
		System.out.println( "~~~~~~~~~~~~~~~<><~~~~~<><~~~~~~~~" );
		System.out.println( "__________________________________" );
		System.out.println( bank1 );
		System.out.println();
		
	}
	
	
	
	
}