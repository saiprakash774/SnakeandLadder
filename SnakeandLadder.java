package day3;
public class SnakeandLadder 
{
	private static int position_of_player1=0;
	private static int position_of_player2=0;
	private static int no_of_die_rolls=0;
	public static int play(int value) 
	 {
		if(value<100) 
		{
			int die_value=(int)Math.floor((Math.random()*10 +1 )% 6);
			no_of_die_rolls=no_of_die_rolls+1;
			int option=(int)Math.floor((Math.random()*10)% 3);
			switch(option) 
			{
			case 0:
					break;
			case 1: //Ladder
					if(value+die_value<=100) 
					{
						value=value+die_value;
						if(value+die_value<=100)
						{
							die_value=(int)Math.floor((Math.random()*10 +1 )% 6);
							value=value+die_value;
						}
						break;
						
					}
					else
					{
						break;
					}
					
			case 2:  //Snake
					if(value>die_value && value>0) 
					{
						value=value-die_value;
						break;
					}
					else
					{
						value=0;
						break;
					}
			default:
					System.out.println("Something unexpected happen: ");
			}
		}
		return value;
	 }
	public static void main(String[] args)
	{
		while(position_of_player1<100 && position_of_player2<100) 
		{
			position_of_player1=play(position_of_player1);
			System.out.println("number of die roll "+no_of_die_rolls+" position of player1: "+position_of_player1);
			position_of_player2=play(position_of_player2);	
			System.out.println("number of die roll "+no_of_die_rolls+" position of player2: "+position_of_player2);
		}
		if(position_of_player1==100)
			System.out.println("player 1 is winner");
		else
			System.out.println("player2 is winner");
		
	}
	
}
