package day3;

public class SnakeandLadder 
{

	public static void main(String[] args)
	{
		int position=0;
		while(position==100) 
		{
			int die_value=(int)Math.floor((Math.random()*10 +1 )% 6);
			int option=(int)Math.floor((Math.random()*10 +1 )% 3);
			switch(option) 
			{
			case 0:
					break;
			case 1:
					if(position+die_value<=100) 
					{
						position=position+die_value;
						break;
					}
					else
					{
						break;
					}
			case 2:
					if(position>die_value && position>0) 
					{
						position=position-die_value;
						break;
					}
					else
					{
						position=0;
						break;
					}
			}
		}
	}
}
