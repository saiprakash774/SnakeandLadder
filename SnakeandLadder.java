package day3;

public class SnakeandLadder 
{

	public static void main(String[] args)
	{
		int position=0;
	//	int [] board=new int [101];
		while(position==100) 
		{
			int die_value=(int)Math.floor((Math.random()*10 +1 )% 6);
			int option=(int)Math.floor((Math.random()*10 +1 )% 3);
			switch(option) 
			{
			case 0:
					break;
			case 1:
					position=position+die_value;
					break;
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
